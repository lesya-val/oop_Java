import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@WebServlet("/users")
public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private String filePath;

    @Override
    public void init() throws ServletException {
        super.init();
        filePath = getServletContext().getRealPath("/WEB-INF/users.json");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Читаем список пользователей из файла
        List<User> users = readUsersFromFile();

        // Преобразуем список в JSON-строку и отправляем клиенту
        JSONArray jsonArray = new JSONArray(users);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(jsonArray.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Читаем данные из запроса
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String group = request.getParameter("group");
        int age = Integer.parseInt(request.getParameter("age"));
        String subject = request.getParameter("subject");

        // Создаем новый объект и добавляем его в список на сервере
        User user = new User(name, surname, group, age, subject);
        writeUserToFile(user);

        // Отправляем ответ клиенту
        response.setStatus(HttpServletResponse.SC_CREATED);
    }

    private List<User> readUsersFromFile() throws IOException {
        List<User> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                JSONObject json = new JSONObject(line);
                User user = new User(
                        json.getString("name"),
                        json.getString("surname"),
                        json.getString("group"),
                        json.getInt("age"),
                        json.getString("subject")
                );
                users.add(user);
            }
        } catch (JSONException e) {
            // Обработка ошибки парсинга JSON
            e.printStackTrace();
        }
        return users;
    }

    private void writeUserToFile(User user) throws IOException {
        JSONObject json = new JSONObject();
        json.put("name", user.getName());
        json.put("surname", user.getSurname());
        json.put("group", user.getGroup());
        json.put("age", user.getAge());
        json.put("subject", user.getSubject());
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(json.toString());
            writer.newLine();
        }
    }
}

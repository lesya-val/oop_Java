import com.example.User;
import com.example.UserFileUtil;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.util.List;
import java.io.IOException;
import com.google.gson.Gson;

@WebServlet(name = "UserServlet", value = "/UserServlet")

public class UserServlet extends HttpServlet {
    private static final Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = UserFileUtil.readUsersFromFile();
        String json = gson.toJson(users);
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String jsonString = req.getReader().readLine();
        User user = gson.fromJson(jsonString, User.class);
        UserFileUtil.writeUserToFile(user);
        resp.getWriter().write("OK");
    }
}

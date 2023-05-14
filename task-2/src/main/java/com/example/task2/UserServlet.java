package com.example.task2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/users/*")
public class UserServlet extends HttpServlet {

    private static final String FILE_PATH = "/path/to/users.json";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = readUsersFromFile();
        String json = convertUsersToJson(users);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String group = request.getParameter("group");
        int age = Integer.parseInt(request.getParameter("age"));
        String subject = request.getParameter("subject");
        User user = new User(name, surname, group, age, subject);
        addUserToFile(user);
        response.sendRedirect(request.getContextPath() + "/index.html");
    }

    private List<User> readUsersFromFile() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(FILE_PATH)) {
            Type type = new TypeToken<List<User>>() {}.getType();
            return gson.fromJson(reader, type);
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private void addUserToFile(User user) {
        List<User> users = readUsersFromFile();
        users.add(user);
        Gson gson = new Gson();
        try (Writer writer = new FileWriter(FILE_PATH)) {
            gson.toJson(users, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String convertUsersToJson(List<User> users) {
        Gson gson = new Gson();
        return gson.toJson(users);
    }
}

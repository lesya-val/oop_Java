package com.example;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

@WebServlet(name = "students", value = "/students")
public class MyServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private final List<Student> students = new ArrayList<>();

    public MyServlet() {
        students.add(new Student("Евгений", "Иванов", "ИСТ-201", 20, "Математика"));
        students.add(new Student("Юлия", "Зайцева", "ПИ-202", 19, "Английский язык"));
        students.add(new Student("Павел", "Смирнов", "ПИН-211", 21, "История"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(new Gson().toJson(students));
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String group = request.getParameter("group");
        int age = Integer.parseInt(request.getParameter("age"));
        String subject = request.getParameter("subject");

        students.add(new Student(name, surname, group, age, subject));

        doGet(request, response);
    }
}
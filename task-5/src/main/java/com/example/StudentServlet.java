package com.example;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.google.gson.Gson;

@WebServlet(name = "students", value = "/students")
public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        List<Student> students = StudentService.getAllStudents();
        out.print(new Gson().toJson(students));
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String group = request.getParameter("group");
        int age = Integer.parseInt(request.getParameter("age"));
        String subject = request.getParameter("subject");
        Student student = new Student(id, name, surname, group, age, subject);
        StudentService.addStudent(student);
        doGet(request, response);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String group = request.getParameter("group");
        int age = Integer.parseInt(request.getParameter("age"));
        String subject = request.getParameter("subject");
        Student student = new Student(id, name, surname, group, age, subject);
        StudentService.updateStudent(student);
        doGet(request, response);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        StudentService.deleteStudent(id);
        doGet(request, response);
    }
}

package com.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private static final String FILE_NAME = "students.json";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "password";

    public static void saveStudentsToFile(List<Student> students) {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            new Gson().toJson(students, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Student> readStudentsFromFile() {
        List<Student> students = new ArrayList<>();
        try (FileReader reader = new FileReader(FILE_NAME)) {
            Type type = new TypeToken<List<Student>>() {}.getType();
            students = new Gson().fromJson(reader, type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void addStudent(Student student) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement("INSERT INTO students (name, surname, groupName, age, subject) VALUES (?, ?, ?, ?, ?)")) {
            statement.setString(1, student.getName());
            statement.setString(2, student.getSurname());
            statement.setString(3, student.getGroup());
            statement.setInt(4, student.getAge());
            statement.setString(5, student.getSubject());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM students")) {
            while (resultSet.next()) {
                Student student = new Student(
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("groupName"),
                        resultSet.getInt("age"),
                        resultSet.getString("subject")
                );
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void updateStudent(Student student) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement("UPDATE students SET name=?, surname=?, groupName=?, age=?, subject=? WHERE id=?")) {
            statement.setString(1, student.getName());
            statement.setString(2, student.getSurname());
            statement.setString(3, student.getGroup());
            statement.setInt(4, student.getAge());
            statement.setString(5, student.getSubject());
            statement.setInt(6, student.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteStudent(int id) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement("DELETE FROM students WHERE id=?")) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

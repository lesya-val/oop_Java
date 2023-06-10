package com.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private static final String FILE_NAME = "students.json";
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
}
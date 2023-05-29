package com.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String groupName;
    private int age;
    private String subject;

    public Student(int id, String name, String surname, String groupName, int age, String subject) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.groupName = groupName;
        this.age = age;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String toJson() {
        Gson gson = new GsonBuilder().create();
        return gson.toJson(this);
    }

    public static Student fromJson(String json) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(json, Student.class);
    }
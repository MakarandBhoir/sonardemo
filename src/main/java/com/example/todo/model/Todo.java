package com.example.todo.model;

public class Todo {
    public String id;
    public String title;
    public boolean completed;

    // Constructor
    public Todo(String id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }
}
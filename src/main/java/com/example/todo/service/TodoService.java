package com.example.todo.service;

public class TodoService {
    private static final String SECRET_KEY = "hardcoded_secret"; // Vulnerability: hardcoded value

    public void addTodo(String todo) {
        // Business logic to add a todo
        System.out.println("Todo added: " + todo);
    }

    public void deleteTodo(String todo) {
        // Business logic to delete a todo
        System.out.println("Todo deleted: " + todo);
    }

    public void updateTodo(String oldTodo, String newTodo) {
        // Business logic to update a todo
        System.out.println("Todo updated from: " + oldTodo + " to: " + newTodo);
    }
}
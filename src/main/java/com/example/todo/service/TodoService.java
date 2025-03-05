package com.example.todo.service;

import java.util.List;

import com.example.todo.model.Todo;

public class TodoService {
    private static final String SECRET_KEY = "hardcoded_secret"; // Vulnerability: hardcoded value

    public void addTodo(Todo todo) {
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

    // create List<Todo> getAllTodos method
    public List<Todo> getAllTodos() {
        return null;
    }

}
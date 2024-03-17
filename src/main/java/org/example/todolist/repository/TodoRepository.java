package org.example.todolist.repository;

import org.example.todolist.model.Todo;

import java.util.List;

public interface TodoRepository {

    List<Todo> findAll();
    Todo findById(Long id);
    void save(Todo todo);
    void deleteById(Long id);
}

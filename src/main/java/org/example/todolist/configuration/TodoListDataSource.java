package org.example.todolist.configuration;

import lombok.Data;
import org.example.todolist.model.Todo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Configuration
public class TodoListDataSource {
    @Bean
    public List<Todo> todoList() {
        List<Todo> todos = new ArrayList<>();
        Todo todo1 = new Todo(1, "Task 1", "Go to school", false, LocalDateTime.now());
        Todo todo2 = new Todo(2, "Task 2", "Drink Coffee", true, LocalDateTime.now());
        Todo todo3 = new Todo(3, "Task 3", "Do homework", false, LocalDateTime.now());

        todos.add(todo1);
        todos.add(todo2);
        todos.add(todo3);


        return todos;
    }
}

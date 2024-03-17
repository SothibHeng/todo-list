package org.example.todolist.repository.repoimplementation;

import org.example.todolist.model.Todo;
import org.example.todolist.repository.TodoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class TodoRepositoryImpl1 implements TodoRepository {
    private final Map<Long, Todo> todoMap = new HashMap<>();

    @Override
    public List<Todo> findAll() {
        return new ArrayList<>(todoMap.values());
    }

    @Override
    public Todo findById(Long id) {
        return todoMap.get(id);
    }

    @Override
    public void save(Todo todo) {
        todoMap.put(todo.getId(), todo);
    }

    @Override
    public void deleteById(Long id) {
        todoMap.remove(id);
    }
}

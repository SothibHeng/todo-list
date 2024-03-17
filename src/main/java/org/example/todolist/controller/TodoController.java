package org.example.todolist.controller;

import org.example.todolist.model.Todo;
import org.example.todolist.repository.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {
    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping
    public String displayTodos(Model model) {
        List<Todo> todos = todoRepository.findAll();
        model.addAttribute("todos", todos);
        return "todo.html";
    }

    @GetMapping("/{id}")
    public String displayTodoById(@PathVariable Long id, Model model) {
        Todo todo = todoRepository.findById(id);
        model.addAttribute("todo", todo);
        return "todo-details.html";
    }

    @GetMapping("/new")
    public String showAddTodoForm(Model model) {
        model.addAttribute("todo", new Todo());
        return "todo-new.html";
    }

    @PostMapping("/new")
    public String addTodo(@ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo";
    }

    @GetMapping("/edit/{id}")
    public String showEditTodoForm(@PathVariable Long id, Model model) {
        Todo todo = todoRepository.findById(id);
        model.addAttribute("todo", todo);
        return "todo-edit.html";
    }

    @PostMapping("/edit/{id}")
    public String editTodo(@PathVariable int id, @ModelAttribute Todo todo) {
        todo.setId(id);
        todoRepository.save(todo);
        return "redirect:/todo";
    }

    @GetMapping("/delete/{id}")
    public String deleteTodo(@PathVariable Long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo";
    }
}

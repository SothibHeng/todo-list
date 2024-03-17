package org.example.todolist.model;

import java.time.LocalDateTime;

public class Todo {
    private long id;
    private String task;
    private String description;
    private boolean isDone;
    private LocalDateTime createdAt;

    //constructor, getter, setter


    public Todo(long id, String task, String description, boolean isDone, LocalDateTime createdAt) {
        this.id = id;
        this.task = task;
        this.description = description;
        this.isDone = isDone;
        this.createdAt = createdAt;
    }

    public Todo() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

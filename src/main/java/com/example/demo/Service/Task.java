package com.example.demo.Service;

public class Task {
    private Long id;
    private String todo;
    private boolean done = false;

    public Task(Long id, String todo, boolean done) {
        this.id = id;
        this.todo = todo;
        this.done = done;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

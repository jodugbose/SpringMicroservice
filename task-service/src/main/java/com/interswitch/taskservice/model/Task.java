package com.interswitch.taskservice.model;

public class Task {
    private Long id;
    private String name;
    private Long assignTo;

    public Task(Long id, String name, Long assignTo) {
        this.id = id;
        this.name = name;
        this.assignTo = assignTo;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getAssignTo() {
        return assignTo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAssignTo(Long assignTo) {
        this.assignTo = assignTo;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", assignTo=" + assignTo +
                '}';
    }
}

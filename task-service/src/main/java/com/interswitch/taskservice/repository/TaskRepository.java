package com.interswitch.taskservice.repository;

import com.interswitch.taskservice.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    List<Task> tasks = new ArrayList<>();

    public Task add(Task task) {
        task.setId((long) (tasks.size() + 1));
        tasks.add(task);
        return task;
    }

    public List<Task> findByEmployeeId(Long employeeId) {
        return tasks.stream()
                .filter(t -> t.getAssignTo().equals(employeeId))
                .toList();
    }
}


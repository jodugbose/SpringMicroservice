package com.interswitch.taskservice.controller;

import ch.qos.logback.classic.Logger;
import com.interswitch.taskservice.model.Task;
import com.interswitch.taskservice.repository.TaskRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(TaskController.class);
    @Autowired
    TaskRepository taskRepository;

    @GetMapping("/employee/{employeeId}")
    public List<Task> findByEmployeeId(@PathVariable("employeeId") Long employeeId) {
        LOGGER.info("Task find: employeeId={}", employeeId);
        return taskRepository.findByEmployeeId(employeeId);
    }
}

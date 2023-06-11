package com.generic.rest.controller;

import com.generic.rest.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/tasks/")
    public List<TaskDTO> findAll() {
        return taskService.findAll();
    }
}

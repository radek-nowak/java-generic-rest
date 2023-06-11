package com.generic.rest.service;

import com.generic.rest.controller.TaskDTO;
import com.generic.rest.storage.TaskStorage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskStorage taskStorage;
    public List<TaskDTO> findAll() {
        return taskStorage.findAll();
    }
}

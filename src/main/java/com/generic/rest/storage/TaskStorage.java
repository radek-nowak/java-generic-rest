package com.generic.rest.storage;

import com.generic.rest.controller.TaskDTO;
import com.generic.rest.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import com.generic.rest.mapper.TaskMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class TaskStorage {

    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    public List<TaskDTO> findAll() {
        return taskRepository.findAll().stream()
                .map(taskMapper::toDto)
                .collect(Collectors.toList());
    }
}

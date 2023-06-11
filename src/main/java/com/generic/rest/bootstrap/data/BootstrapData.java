package com.generic.rest.bootstrap.data;

import com.generic.rest.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BootstrapData implements CommandLineRunner {

    private final TaskRepository taskRepository;

    @Override
    public void run(String... args) throws Exception {
        var initialTasks = List.of(
                new Task().withTaskDesc("task1").build(),
                new Task().withTaskDesc("").build(),
                new Task().withTaskDesc("task1").build()
                );

        taskRepository.saveAll(initialTasks);
    }
}

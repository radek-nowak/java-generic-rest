package com.generic.rest.bootstrap.data;

import com.generic.rest.entity.TaskEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.With;

import java.time.LocalDateTime;

@With
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    private Long id = null;
    private String taskDesc = "New Task";
    private LocalDateTime dateTime = LocalDateTime.now();

    public TaskEntity build() {
        return new TaskEntity(id, taskDesc, dateTime);
    }
}

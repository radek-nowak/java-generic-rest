package com.generic.rest.controller;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskDTO {
    private Long id;
    private String taskDescription;
    private LocalDateTime dateTime;
}

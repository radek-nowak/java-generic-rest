package com.generic.rest.mapper;

import com.generic.rest.controller.TaskDTO;
import com.generic.rest.entity.TaskEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskDTO toDto(TaskEntity task);
}

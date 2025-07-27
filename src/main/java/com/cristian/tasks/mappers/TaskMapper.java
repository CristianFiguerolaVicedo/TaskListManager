package com.cristian.tasks.mappers;

import com.cristian.tasks.domain.dto.TaskDto;
import com.cristian.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}

package com.cristian.tasks.mappers;

import com.cristian.tasks.domain.dto.TaskListDto;
import com.cristian.tasks.domain.entities.TaskList;

public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}

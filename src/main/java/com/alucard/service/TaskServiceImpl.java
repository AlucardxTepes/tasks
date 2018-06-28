package com.alucard.service;

import com.alucard.domain.Task;
import com.alucard.repository.TaskRepository;

/**
 * @author Nelson Pantaleon on 6/28/2018
 */
public class TaskServiceImpl implements TaskService {

  private TaskRepository taskRepository;

  public TaskServiceImpl(TaskRepository taskRepository) {
    this.taskRepository = taskRepository;
  }

  @Override
  public Iterable<Task> list() {
    return this.taskRepository.findAll();
  }

}

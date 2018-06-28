package com.alucard.service;

import com.alucard.domain.Task;
import com.alucard.repository.TaskRepository;

import org.springframework.stereotype.Service;

/**
 * @author Nelson Pantaleon on 6/28/2018
 */
@Service
public class TaskServiceImpl implements TaskService {

  private TaskRepository taskRepository;

  public TaskServiceImpl(TaskRepository taskRepository) {
    this.taskRepository = taskRepository;
  }

  @Override
  public Iterable<Task> list() {
    return this.taskRepository.findAll();
  }

  @Override
  public Task save(Task task) {
    return this.taskRepository.save(task);
  }

}

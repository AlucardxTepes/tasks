package com.alucard.controller;

import com.alucard.domain.Task;
import com.alucard.service.TaskService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nelson Pantaleon on 6/28/2018
 */
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

  private TaskService taskService;

  public TaskController(TaskService taskService) {
    this.taskService = taskService;
  }

  @GetMapping( value = {"", "/"})
  public Iterable<Task> listTasks() {
    return this.taskService.list();
  }

}

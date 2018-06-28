package com.alucard.controller;

import com.alucard.domain.Task;
import com.alucard.service.TaskService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

  @GetMapping(value = {"", "/"})
  public Iterable<Task> listTasks() {
    return this.taskService.list();
  }

  @PostMapping("/save")
  public Task saveTask(@RequestBody Task task) {
    return this.taskService.save(task);
  }

}

package com.alucard.service;

import com.alucard.domain.Task;

/**
 * @author Nelson Pantaleon on 6/28/2018
 */
public interface TaskService {

  Iterable<Task> list();

  Task save(Task task);
}

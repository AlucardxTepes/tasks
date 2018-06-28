package com.alucard.repository;

import com.alucard.domain.Task;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Nelson Pantaleon on 6/28/2018
 */
public interface TaskRepository extends CrudRepository<Task, Long> {



}

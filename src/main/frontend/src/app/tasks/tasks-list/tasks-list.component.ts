import { Component, OnInit } from '@angular/core';
import {Task} from '../task.model';

@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

  tasks: Task[] = [];

  constructor() { }

  ngOnInit() {
    this.tasks.push(new Task(1, "Task 1", true, "07/08/18"));
    this.tasks.push(new Task(2, "Task 2", true, "07/09/18"));
    this.tasks.push(new Task(3, "Task 3", true, "07/10/18"));
  }

  getDueDateLabel(task: Task) {
    return task.completed ? 'label-success' : 'label-primary';
  }

  onTaskChange(event, task) {
    // this.taskService.saveTask(task, event.target.checked).subscribe();
    console.log("Task changed");
  }

}

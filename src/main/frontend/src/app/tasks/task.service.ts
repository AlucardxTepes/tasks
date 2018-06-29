import {EventEmitter, Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {map} from "rxjs/internal/operators";
import {Task} from './task.model';

@Injectable()
export class TaskService {

  onTaskAdded = new EventEmitter<Task>();

  constructor(private http: HttpClient) {
  }

  getTasks() {
    return this.http.get("/api/tasks").pipe(map(response => response));
  }

  saveTask(task: Task, checked: boolean) {
    task.completed = checked;
    return this.http.post("/api/tasks/save", task).pipe(map(response => response));
  }

  addTask(task: Task) {
    return this.http.post("/api/tasks/save", task).pipe(map(response => response));
  }

}

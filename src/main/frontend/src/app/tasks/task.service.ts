import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {map} from "rxjs/internal/operators";

@Injectable()
export class TaskService {

  constructor(private http: HttpClient) {
  }

  getTasks() {
    return this.http.get("/api/tasks").pipe(map((response: any) => response.json()));
  }

}

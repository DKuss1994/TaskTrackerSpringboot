package com.example.demo.Controller;

import com.example.demo.Service.Task;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {
    private final List <Task> tasks = new ArrayList<>();
  private Long idCounter = 0L;
    @GetMapping
    public List<Task> getTask(){
      return tasks;
  }
  @PostMapping
    public Task addTodo (@RequestBody Task task){
      task.setId(idCounter);
      idCounter++;
      tasks.add(task);
      System.out.println("Task add.");
      return task;
  }
  @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id){
        tasks.removeIf(task ->task.getId().equals(id));
  }
  @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id,@RequestBody Task task){
      for (Task task1 : tasks) {
          if(task1.getId().equals(id)){
              task1.setTodo(task.getTodo());
              task1.setDone(task.isDone());
              return task;
          }

      }
      return null;
  }
}

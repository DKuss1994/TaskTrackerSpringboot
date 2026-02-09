package org.example.Task.Interface;

import org.example.Enum.Enum;
import org.example.Task.Task;

import java.util.List;

public interface TaskRepository {
    List<Task> findTasksByUserId(int userID);
    void addTaskDB(int userID,Task task);
    public List<Task> findTasksByStatusAndUserId(int userID, Enum.Status status);
}

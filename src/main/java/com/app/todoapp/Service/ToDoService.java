package com.app.todoapp.Service;

import com.app.todoapp.Models.Tasks;
import com.app.todoapp.Repository.TaskRepo;
import org.springframework.scheduling.config.Task;

import java.util.List;

public class ToDoService {
    private final TaskRepo taskRepo;

    public ToDoService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    public List<Tasks> getAllTasks() {
        return taskRepo.findAll();
    }
}

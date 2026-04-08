package com.app.todoapp.Service;

import com.app.todoapp.Models.Tasks;
import com.app.todoapp.Repository.TaskRepo;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ToDoService {
    private final TaskRepo taskRepo;

    public ToDoService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    public  void toggleTask(Long id) {
        Tasks task=taskRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("invalid task id"));
                task.setComplete(!task.isComplete());
        taskRepo.save(task);

    }

    public  void deleteTask(Long id) {
        taskRepo.deleteById(id);
    }

    public List<Tasks> getAllTasks() {
        return taskRepo.findAll();
    }

    public void createTask(String title) {
        Tasks task=new Tasks();
        task.setTitle(title);
        task.setComplete(false);
        taskRepo.save(task);
    }
}

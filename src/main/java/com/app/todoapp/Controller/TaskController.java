package com.app.todoapp.Controller;

import com.app.todoapp.Models.Tasks;
import com.app.todoapp.Service.ToDoService;
import com.app.todoapp.Models.Task; // Use your actual Task class path here
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Correct Model import
import org.springframework.web.bind.annotation.GetMapping; // Required for mapping

import java.util.List;

@Controller
public class TaskController {

    private final ToDoService toDoService;

    public TaskController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("/tasks")
    public String getTasks(Model model) {
        List<Tasks> tasks = toDoService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }
}
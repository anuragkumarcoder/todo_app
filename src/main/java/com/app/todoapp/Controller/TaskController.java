package com.app.todoapp.Controller;

import com.app.todoapp.Models.Tasks;
import com.app.todoapp.Service.ToDoService;
import com.app.todoapp.Models.Tasks; // Use your actual Task class path here
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Correct Model import
import org.springframework.web.bind.annotation.GetMapping; // Required for mapping
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    @PostMapping("/tasks")
    public String CreateTask(@RequestParam String title) {
      toDoService.createTask(title);
        return "redirect:/tasks";
    }
    @GetMapping("/{id}/delete")
    public String deleteTasks(@PathVariable Long id) {
        toDoService.deleteTask(id);

        return "redirect:/tasks";
    }
        @GetMapping("/{id}/toggle")
        public String toggleTasks(@PathVariable Long id) {
            toDoService.toggleTask(id);

            return "redirect:/tasks";
    }

}
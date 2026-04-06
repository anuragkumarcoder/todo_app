package com.app.todoapp.Repository;

import com.app.todoapp.Models.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;

public interface TaskRepo extends JpaRepository<Tasks,Long> {
}

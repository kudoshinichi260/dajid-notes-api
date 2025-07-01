package com.example.dajidnotesapi.repositories;

import com.example.dajidnotesapi.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

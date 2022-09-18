package com.BugTrackerApp.BugTracker.repository;

import com.BugTrackerApp.BugTracker.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}

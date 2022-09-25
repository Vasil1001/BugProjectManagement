package com.BugTrackerApp.BugTracker.repository;

import org.springframework.data.repository.CrudRepository;

import com.BugTrackerApp.BugTracker.model.Project;

public interface ProjectRepository extends CrudRepository<Project, Integer> {

}

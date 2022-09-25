package com.BugTrackerApp.BugTracker.service;

import com.BugTrackerApp.BugTracker.model.Project;

import com.BugTrackerApp.BugTracker.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAll() {
        return (List<Project>) projectRepository.findAll();
    }

    public List<Project> getAllProjects() {
        List<Project> projects = new ArrayList<>();
        projectRepository.findAll().forEach(projects::add);
        return projects;
    }

    public Optional<Project> getProject(Integer id) {
        return projectRepository.findById(id);
    }

    public void addProject(Project project) {
        projectRepository.save(project);
    }

    public void updateProject(Integer id, Project project) {
        projectRepository.save(project);
    }

    public void deleteProject(Integer id) {
        projectRepository.deleteById(id);
    }


    public void update(Project project) {
        projectRepository.save(project);
    }

    public void addNew(Project project) {
        projectRepository.save(project);
    }

    public Optional<Project> getOne(Integer id) {
        return projectRepository.findById(id);
    }
}

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

    public Optional<Project> getProject(Integer Id) {
        return projectRepository.findById(Id);
    }

    public void addProject(Project project) {
        projectRepository.save(project);
    }

    public void updateProject(Integer Id, Project project) {
        projectRepository.save(project);
    }

    public void deleteProject(Integer Id) {
        projectRepository.deleteById(Id);
    }


    public void update(Project project) {
        projectRepository.save(project);
    }

    public void addNew(Project project) {
        projectRepository.save(project);
    }

    public Optional<Project> getOne(Integer Id) {
        return projectRepository.findById(Id);
    }

    public void delete(Integer Id) {
        projectRepository.deleteById(Id);
    }

}

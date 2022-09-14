package com.BugTrackerApp.BugTracker.service;

import com.BugTrackerApp.BugTracker.model.Project;
import com.BugTrackerApp.BugTracker.model.Student;
import com.BugTrackerApp.BugTracker.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

    public Optional<Project> getProject(String id) {
        return projectRepository.findById(id);
    }

    public void addProject(Project project) {
        projectRepository.save(project);
    }
    public void updateProject(String id, Project project) {
        projectRepository.save(project);
    }
    public void deleteProject(String id) {
        projectRepository.deleteById(id);
    }


}

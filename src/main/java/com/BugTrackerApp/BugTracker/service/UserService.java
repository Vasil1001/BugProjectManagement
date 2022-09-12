package com.BugTrackerApp.BugTracker.service;

import com.BugTrackerApp.BugTracker.model.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    public List<Project> getAllLocations() {
        List<Project> locations = new ArrayList<>();
        projectRepository.findAll().forEach(locations::add);
        return locations;
    }

    public Optional<Project> getLocation(String id) {
        return projectRepository.findById(id);
    }

    public void addLocation(Project project) {
        projectRepository.save(project);
    }
    public void updateLocation(String id, Project project) {
        projectRepository.save(project);
    }
    public void deleteLocation(String id) {
        projectRepository.deleteById(id);
    }
}

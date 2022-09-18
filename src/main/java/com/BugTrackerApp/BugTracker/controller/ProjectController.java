package com.BugTrackerApp.BugTracker.controller;

import com.BugTrackerApp.BugTracker.model.Project;
import com.BugTrackerApp.BugTracker.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping("/getAll") //RETURN TO HTML
    public String getAllModel(Model model) {
        List<Project> projects = projectService.getAll();
        model.addAttribute("projects", projects);
        return "projects"; //NAME OF HTML TO RETURN
    }

    
    @RequestMapping(value = "/getAllProjects")
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }
    

    @RequestMapping(value = "/Projects/{id}")
    public Optional<Project> getProject(@PathVariable String id) {
        return projectService.getProject(id);
    }
    @RequestMapping(value = "/Projects", method = RequestMethod.POST)
    public void addProject(@RequestBody Project Project) {
        projectService.addProject(Project);
    }
    @RequestMapping(value = "/Projects/{id}", method = RequestMethod.PUT)
    public void updateProject(@PathVariable String id, @RequestBody Project Project) {
        projectService.updateProject(id, Project);
    }
    @RequestMapping(value = "/Projects/{id}", method = RequestMethod.DELETE)
    public void deleteProject(@PathVariable String id) {
        projectService.deleteProject(id);
    }
}

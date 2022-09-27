package com.BugTrackerApp.BugTracker.controller;

import com.BugTrackerApp.BugTracker.model.Project;
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

    @RequestMapping("/getOne")
    @ResponseBody
    public Optional<Project> getOne(Integer Id) {
        return projectService.getOne(Id);
    }

    @PostMapping(value = "/addNew")
    public String addNew(Project project) {
        projectService.addNew(project);
        return "redirect:/projects/getAll";
    }

    @RequestMapping(value = "/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Project project) {
        projectService.update(project);
        return "redirect:/projects/getAll";
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer Id) {
        projectService.delete(Id);
        return "redirect:/projects/getAll";
    }
}

//    @RequestMapping(value = "/getAllProjects")
//    public List<Project> getAllProjects() {
//        return projectService.getAllProjects();
//    }
//
//
//    @RequestMapping(value = "/Projects/{Id}")
//    public Optional<Project> getProject(@PathVariable String Id) {
//        return projectService.getProject(Id);
//    }
//    @RequestMapping(value = "/Projects", method = RequestMethod.POST)
//    public voId addProject(@RequestBody Project Project) {
//        projectService.addProject(Project);
//    }
//    @RequestMapping(value = "/Projects/{Id}", method = RequestMethod.PUT)
//    public voId updateProject(@PathVariable String Id, @RequestBody Project Project) {
//        projectService.updateProject(Id, Project);
//    }
//    @RequestMapping(value = "/Projects/{Id}", method = RequestMethod.DELETE)
//    public voId deleteProject(@PathVariable String Id) {
//        projectService.deleteProject(Id);
//    }
//}

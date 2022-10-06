package com.BugTrackerApp.BugTracker.controller;

import com.BugTrackerApp.BugTracker.model.Project;
import com.BugTrackerApp.BugTracker.model.Project;
import com.BugTrackerApp.BugTracker.model.Ticket;
import com.BugTrackerApp.BugTracker.model.User;
import com.BugTrackerApp.BugTracker.service.ProjectService;
import com.BugTrackerApp.BugTracker.service.TicketService;
import com.BugTrackerApp.BugTracker.service.UserService;
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
    @Autowired
    private TicketService ticketService;
    @Autowired
    private UserService userService;

    @RequestMapping("/getAll") //RETURN TO HTML
    public String getAllModel(Model model) {
        List<Project> projectsList = projectService.getAll();
        List<Ticket> ticketsList = ticketService.getAll();
        List<User> usersList = userService.getAll();

        model.addAttribute("projects", projectsList);
        model.addAttribute("ticketsInList", ticketsList);
        model.addAttribute("usersInList", usersList);

        return "projects"; //NAME OF HTML TO RETURN
    }

    //    @RequestMapping(value = "/view", method = {RequestMethod.GET})
//    public String view(Integer Id) {
//        projectService.getOne(Id);
//        return "redirect:/projects/getView";
//    }
    @RequestMapping("/getView") //RETURN TO HTML
    public String getViewModel(Model model, Integer Id) {
        projectService.getOne(Id);
        List<Project> projectsList = projectService.getAll();
        List<Ticket> ticketsList = ticketService.getAll();
        List<User> usersList = userService.getAll();

        model.addAttribute("projects", projectsList);
        model.addAttribute("ticketsInList", ticketsList);
        model.addAttribute("usersInList", usersList);

        return "selectProject"; //NAME OF HTML TO RETURN
    }
//    @RequestMapping("/getOneView")
//    @ResponseBody
//    public Optional<Project> getOneView(Integer Id) {
//        projectService.getOne(Id);
//        return projectService.getOne(Id);
//    }

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

package com.BugTrackerApp.BugTracker.controller;

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

    @RequestMapping("/getAll")
    public String getAllModel(Model model) {
        List<Project> projectsList = projectService.getAll();
        List<Ticket> ticketsList = ticketService.getAll();
        List<User> usersList = userService.getAll();

        model.addAttribute("projects", projectsList);
        model.addAttribute("ticketsInList", ticketsList);
        model.addAttribute("usersInList", usersList);

        return "projects";
    }

    @RequestMapping("/getOne")
    @ResponseBody
    public Optional<Project> getOne(Integer Id) {
        return projectService.getOne(Id);
    }

    @PostMapping(value = "/addNew")
    public String addNew(Project project) throws Exception {
            projectService.addNew(project);
        return "redirect:/projects/getAll";
    }

    @RequestMapping(value = "/update", method = { RequestMethod.PUT, RequestMethod.GET })
    public String update(Project project) {
        projectService.update(project);
        return "redirect:/projects/getAll";
    }

    @RequestMapping(value = "/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
    public String delete(Integer Id) {
        projectService.delete(Id);
        return "redirect:/projects/getAll";
    }

    // Selected Project page
    @RequestMapping("/expandProject")
    public String getViewModel(Model model, Integer Id) {
        List<User> membersList = projectService.getMembersByProject(Id);
        List<Ticket> projectTickets = projectService.getTicketsByProject(Id);
        List<Project> projectsList = projectService.getAll();

        Optional<Project> project = projectService.getOne(Id);

        model.addAttribute("usersInList", membersList);
        model.addAttribute("projectTickets", projectTickets);
        model.addAttribute("projectsList", projectsList);

        model.addAttribute("project", project);

        return "selectProject";
    }

    @RequestMapping("/edit")
    public String editProject(Model model, Integer Id) {
        Optional<Project> project = projectService.getOne(Id);
        model.addAttribute("project", project);

        List<Ticket> ticketsList = ticketService.getAll();
        model.addAttribute("ticketsInList", ticketsList);

        List<User> memberList = userService.getAll();
        model.addAttribute("memberList", memberList);

        return "project-edit";
    }
}

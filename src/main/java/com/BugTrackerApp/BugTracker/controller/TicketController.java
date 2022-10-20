package com.BugTrackerApp.BugTracker.controller;

import com.BugTrackerApp.BugTracker.model.Project;
import com.BugTrackerApp.BugTracker.model.Ticket;
import com.BugTrackerApp.BugTracker.model.Ticket;
import com.BugTrackerApp.BugTracker.model.User;
import com.BugTrackerApp.BugTracker.service.ProjectService;
import com.BugTrackerApp.BugTracker.service.TicketService;
import com.BugTrackerApp.BugTracker.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;
    @Autowired
    private ProjectService projectService;

    @RequestMapping("/getAll") // RETURN TO HTML
    public String getAllModel(Model model) {
        List<Ticket> tickets = ticketService.getAll();
        List<Project> projects = projectService.getAll();

        model.addAttribute("tickets", tickets);
        model.addAttribute("projects", projects);

        return "tickets"; // NAME OF HTML TO RETURN
    }

    @RequestMapping("/getOne")
    @ResponseBody
    public Optional<Ticket> getOne(Integer Id) {
        return ticketService.getOne(Id);
    }

    @PostMapping(value = "/addNew")
    public String addNew(Ticket ticket) {
        ticketService.addNew(ticket);
        return "redirect:/tickets/getAll";
    }

    @PostMapping(value = "/addNewInProject")
    public String addNewInProject(Ticket ticket) {
        ticketService.addNew(ticket);
        return "redirect:/projects/expandProject/?Id=" + ticket.getProject().getId();
    }

    @RequestMapping(value = "/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Ticket ticket) {
        ticketService.update(ticket);
        return "redirect:/tickets/getAll";
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer Id) {
        ticketService.delete(Id);
        return "redirect:/tickets/getAll";
    }

    @RequestMapping("/edit") // SELECTED PROJECT VIEW
    public String editTicket(Model model, Integer Id) {
        Optional<Ticket> ticket = ticketService.getOne(Id);
        model.addAttribute("ticket", ticket);

        List<Ticket> ticketsList = ticketService.getAll();
        model.addAttribute("ticketsInList", ticketsList);

        List<Project> projects = projectService.getAll();
        model.addAttribute("projects", projects);

        return "ticket-edit"; // NAME OF HTML TO RETURN
    }

    @RequestMapping("/view") // SELECTED PROJECT VIEW
    public String viewTicket(Model model, Integer Id) {
        Optional<Ticket> ticket = ticketService.getOne(Id);
        model.addAttribute("ticket", ticket);

        List<Ticket> ticketsList = ticketService.getAll();
        model.addAttribute("ticketsInList", ticketsList);

        List<Project> projects = projectService.getAll();
        model.addAttribute("projects", projects);

        return "ticket-view"; // NAME OF HTML TO RETURN
    }
}

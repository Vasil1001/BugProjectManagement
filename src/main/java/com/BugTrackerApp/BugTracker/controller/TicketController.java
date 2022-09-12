package com.BugTrackerApp.BugTracker.controller;

import com.BugTrackerApp.BugTracker.model.Ticket;
import com.BugTrackerApp.BugTracker.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @RequestMapping(value = "/Tickets")
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }
    @RequestMapping(value = "/Tickets/{id}")
    public Optional<Ticket> getTicket(@PathVariable String id) {
        return ticketService.getTicket(id);
    }
    @RequestMapping(value = "/Tickets", method = RequestMethod.POST)
    public void addTicket(@RequestBody Ticket Ticket) {
        ticketService.addTicket(Ticket);
    }
    @RequestMapping(value = "/Tickets/{id}", method = RequestMethod.PUT)
    public void updateTicket(@PathVariable String id, @RequestBody Ticket Ticket) {
        ticketService.updateTicket(id, Ticket);
    }
    @RequestMapping(value = "/Tickets/{id}", method = RequestMethod.DELETE)
    public void deleteTicket(@PathVariable String id) {
        ticketService.deleteTicket(id);
    }
}

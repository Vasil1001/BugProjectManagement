package com.BugTrackerApp.BugTracker.service;

import com.BugTrackerApp.BugTracker.model.Ticket;
import com.BugTrackerApp.BugTracker.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> getAll() {
        return (List<Ticket>) ticketRepository.findAll();
    }
    
    public List<Ticket> getAllTickets() {
        List<Ticket> tickets = new ArrayList<>();
        ticketRepository.findAll().forEach(tickets::add);
        return tickets;
    }

    public Optional<Ticket> getTicket(String id) {
        return ticketRepository.findById(id);
    }

    public void addTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }
    public void updateTicket(String id, Ticket ticket) {
        ticketRepository.save(ticket);
    }
    public void deleteTicket(String id) {
        ticketRepository.deleteById(id);
    }
}

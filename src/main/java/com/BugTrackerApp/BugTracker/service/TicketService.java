package com.BugTrackerApp.BugTracker.service;

import com.BugTrackerApp.BugTracker.model.Ticket;
import com.BugTrackerApp.BugTracker.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> getAll() {
        return (List<Ticket>) ticketRepository.findAll();
    }

    public Optional<Ticket> getOne(Integer Id) {
        return ticketRepository.findById(Id);
    }

    public void addNew(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    public void update(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    public void delete(Integer Id) {
        ticketRepository.deleteById(Id);
    }
}

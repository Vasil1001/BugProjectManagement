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

    public Optional<Ticket> getOne(Integer id) {
        return ticketRepository.findById(id);
    }

    public void addNew(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    public void update(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    public void delete(Integer id) {
        ticketRepository.deleteById(id);
    }


    ///


//    public List<Ticket> getAllTickets() {
//        List<Ticket> tickets = new ArrayList<>();
//        ticketRepository.findAll().forEach(tickets::add);
//        return tickets;
//    }

//    public void updateTicket(Integer id, Ticket ticket) {
//        ticketRepository.save(ticket);
//    }
//
//    public void deleteTicket(Integer id) {
//        ticketRepository.deleteById(id);
//    }


}

package com.BugTrackerApp.BugTracker.service;

import com.BugTrackerApp.BugTracker.model.Project;

import com.BugTrackerApp.BugTracker.model.Ticket;
import com.BugTrackerApp.BugTracker.model.User;
import com.BugTrackerApp.BugTracker.repository.ProjectRepository;
import com.BugTrackerApp.BugTracker.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;
    private TicketRepository ticketRepository;

    public List<Project> getAll() {
        return (List<Project>) projectRepository.findAll();
    }

    public List<Ticket> getTicketsByProject(Integer Id) {
        return projectRepository.getTicketsByProject(Id);
    }

    //    public List<User> getMembersByProject(Integer Id) {
//        return projectRepository.getMembersByProject(Id);
//    }
    public void update(Project project) {
        projectRepository.save(project);
    }

    public void addNew(Project project) {
        projectRepository.save(project);
    }

    public Optional<Project> getOne(Integer Id) {
        return projectRepository.findById(Id);
    }

    public void delete(Integer Id) {
        projectRepository.deleteById(Id);
    }


    public List<Ticket> getProjectTickets() {
        return (List<Ticket>) ticketRepository.findAll();
    }
}

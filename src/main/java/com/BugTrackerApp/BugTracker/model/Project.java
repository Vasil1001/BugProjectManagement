package com.BugTrackerApp.BugTracker.model;

import java.util.ArrayList;
import java.util.Date;

public class Project {
    private String id;
    private String name;
    private String description;
    private Date startDate;
    private Date finishDate;

    // * Project will show assigned team manager
    // * Project will show assigned team members
    // * Project will show assigned tickets
    private User user; // ? FOREIGN KEY
    private ArrayList<User> members;
    private ArrayList<Ticket> projectTickets;

    public Project(String id, String name, String description, Date startDate, Date finishDate, User user, ArrayList<User> members, ArrayList<Ticket> projectTickets) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.user = user;
        this.members = members;
        this.projectTickets = projectTickets;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<User> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<User> members) {
        this.members = members;
    }

    public ArrayList<Ticket> getProjectTickets() {
        return projectTickets;
    }

    public void setProjectTickets(ArrayList<Ticket> projectTickets) {
        this.projectTickets = projectTickets;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                ", user=" + user +
                ", members=" + members +
                ", projectTickets=" + projectTickets +
                '}';
    }
}

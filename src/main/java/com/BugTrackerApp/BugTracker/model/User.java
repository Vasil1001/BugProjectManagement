package com.BugTrackerApp.BugTracker.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private int phoneNumber;

    private ArrayList<Ticket> assignedTickets;

    public User() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Ticket> getAssignedTickets() {
        return assignedTickets;
    }

    public void setAssignedTickets(ArrayList<Ticket> assignedTickets) {
        this.assignedTickets = assignedTickets;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", assignedTickets=" + assignedTickets +
                '}';
    }
}

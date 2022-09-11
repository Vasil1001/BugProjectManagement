package com.BugTrackerApp.BugTracker.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

@Builder
@Getter
@Setter
@ToString
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private String id;
    private String name;
    private String description;
    @DateTimeFormat(pattern="yyyy-MM-dd")

    private Instant createdOn; //Project.setCreatedOn(Instant.now());
    @DateTimeFormat(pattern="yyyy-MM-dd")

    private Date finishDate;

    // * Project will show assigned team manager
    // * Project will show assigned team members
    // * Project will show assigned tickets
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // ? FOREIGN KEY
    private ArrayList<User> members;
    private ArrayList<Ticket> projectTickets;

    public Project() {
    }

    public Project(String id, String name, String description, Instant createdOn, Date finishDate, User user, ArrayList<User> members, ArrayList<Ticket> projectTickets) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdOn = createdOn;
        this.finishDate = finishDate;
        this.user = user;
        this.members = members;
        this.projectTickets = projectTickets;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdOn =" + createdOn +
                ", finishDate=" + finishDate +
                ", user=" + user +
                ", members=" + members +
                ", projectTickets=" + projectTickets +
                '}';
    }
}

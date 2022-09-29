package com.BugTrackerApp.BugTracker.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
public class Project {
    @Id
    private Integer Id;
    private String name;
    private String description;
    @DateTimeFormat(pattern="yyyy-MM-dd")

    private Date createdOn; //Project.setCreatedOn(Instant.now());
    @DateTimeFormat(pattern = "yyyy-MM-dd")

    private Date finishDate;

    // * Project will show assigned team manager
    // * Project will show assigned team members
    // * Project will show assigned tickets
    @ManyToOne
    @JoinColumn(name = "user_Id")
    private User user; // ? FOREIGN KEY

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket; // ? FOREIGN KEY

    private ArrayList<User> members;
    private ArrayList<Ticket> projectTickets;


}

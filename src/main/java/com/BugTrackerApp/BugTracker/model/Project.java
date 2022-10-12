package com.BugTrackerApp.BugTracker.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String name;
    private String description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "project", cascade = CascadeType.ALL)
    private List<Ticket> tickets;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "project", cascade = CascadeType.ALL)
//    private List<User> members;


//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private Date createdOn; // Project.setCreatedOn(Instant.now());
//
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private Date finishDate;

    // * Project will show assigned team manager
    // * Project will show assigned team members
    // * Project will show assigned tickets
//    @ManyToOne
//    @JoinColumn(name = "user_Id")
//    private User user; // ? FOREIGN KEY
//
//    @ManyToOne
//    private Ticket ticket; // ? FOREIGN KEY

//    private ArrayList<User> members;
//    private ArrayList<Ticket> projectTickets;

}

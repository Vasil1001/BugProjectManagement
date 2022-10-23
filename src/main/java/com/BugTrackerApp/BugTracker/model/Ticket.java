package com.BugTrackerApp.BugTracker.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String title;
    private String description;
    private String status;
    private String priority;
    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_Id")
    public Project project; // ? FOREIGN KEY



    // * Ticket will show assigned user
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user; // ? FOREIGN KEY


//    private int estimatedTime;
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private Date createdDate;
//
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private Date closedDate;
//
//    private String[] statusOptions = {"Issue", "Bug", "Feature request"};
//    private String[] priorityOptions = {"Immediate", "High", "Medium", "Low"};
//    private String[] typeOptions = {"New", "Unassigned", "In progress", "Resolved"};


}

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
}

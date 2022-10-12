package com.BugTrackerApp.BugTracker.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @Column(name = "first_name")
    private String firstname;
    @Column(name = "last_name")
    private String lastname;
    private String email;
    private Long phoneNumber;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_Id")
    private Project project; // ? FOREIGN KEY

}

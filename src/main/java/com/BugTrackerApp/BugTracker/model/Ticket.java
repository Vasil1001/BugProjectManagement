package com.BugTrackerApp.BugTracker.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String title;
    private String description;
    private int estimatedTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")

    private Date createdDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")

    private Date closedDate;
    private String status;
    private String priority;
    private String type;
    private String[] statusOptions = {"Issue", "Bug", "Feature request"};
    private String[] priorityOptions = {"Immediate", "High", "Medium", "Low"};
    private String[] typeOptions = {"New", "Unassigned", "In progress", "Resolved"};
    

    // * Ticket will show assigned user
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // ? FOREIGN KEY

    public Ticket(Integer id, String title, String description, int estimatedTime, String status, String priority, String type, User user) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.estimatedTime = estimatedTime;
        this.status = status;
        this.priority = priority;
        this.type = type;
        this.user = user;
    }

    public Ticket() {

    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", estimatedTime=" + estimatedTime +
                ", createdDate=" + createdDate +
                ", closedDate=" + closedDate +
                ", status='" + status + '\'' +
                ", priority='" + priority + '\'' +
                ", type='" + type + '\'' +
                ", statusOptions=" + Arrays.toString(statusOptions) +
                ", priorityOptions=" + Arrays.toString(priorityOptions) +
                ", typeOptions=" + Arrays.toString(typeOptions) +
                ", user=" + user +
                '}';
    }
}



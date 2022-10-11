package com.BugTrackerApp.BugTracker.model;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String title;
    private String description;
    private int estimatedTime;
    private String status;
    private String priority;
    private String type;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date closedDate;

    private String[] statusOptions = {"Issue", "Bug", "Feature request"};
    private String[] priorityOptions = {"Immediate", "High", "Medium", "Low"};
    private String[] typeOptions = {"New", "Unassigned", "In progress", "Resolved"};

    // * Ticket will show assigned user
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // ? FOREIGN KEY

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project; // ? FOREIGN KEY
}

package com.BugTrackerApp.BugTracker.model;

import lombok.Getter;

import java.util.Arrays;
import java.util.Date;

@Getter
public class Ticket {
    private String id;
    private String title;
    private String description;
    private int estimatedTime;
    private Date createdDate;
    private Date closedDate;
    private String status;
    private String priority;
    private String type;
    private String[] statusOptions = {"Issue", "Bug", "Feature request"};
    private String[] priorityOptions = {"Immediate", "High", "Medium", "Low"};
    private String[] typeOptions = {"New", "Unassigned", "In progress", "Resolved"};


    // * Ticket will show assigned user
    private User user; // ? FOREIGN KEY

    public Ticket(String id, String title, String description, int estimatedTime, String status, String priority, String type, User user) {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(int estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getStatusOptions() {
        return statusOptions;
    }

    public void setStatusOptions(String[] statusOptions) {
        this.statusOptions = statusOptions;
    }

    public String[] getPriorityOptions() {
        return priorityOptions;
    }

    public void setPriorityOptions(String[] priorityOptions) {
        this.priorityOptions = priorityOptions;
    }

    public String[] getTypeOptions() {
        return typeOptions;
    }

    public void setTypeOptions(String[] typeOptions) {
        this.typeOptions = typeOptions;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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



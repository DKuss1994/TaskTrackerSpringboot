package org.example.Task;

import org.example.Enum.Enum;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private String description;
    private org.example.Enum.Enum.Status status;
    private Timestamp time;
    private Timestamp update;

    public Task(String description, Enum.Status status, Timestamp time, Timestamp update) {
        this.description = description;
        this.status = status;
        this.time = time;
        this.update = update;
    }

    public Task(String description) {
        this.description = description;
        this.status = org.example.Enum.Enum.Status.TODO;
        this.time = Timestamp.valueOf("");
        this.update = Timestamp.valueOf("");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public org.example.Enum.Enum.Status getStatus() {
        return status;
    }

    public void setStatus(org.example.Enum.Enum.Status status) {
        this.status = status;
    }

    public String getPrintout() {
        return "Description: " + description + ", Status: " + status + ", Create Time: " + time + ", Last change time: " + update;
    }

    public void setTime() {
        LocalDateTime nowTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.yyyy");
        this.time = Timestamp.valueOf(nowTime.format(formatter));
    }

    public void setUpdate() {
        LocalDateTime nowTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.yyyy");
        this.update = Timestamp.valueOf(nowTime.format(formatter));
    }

}

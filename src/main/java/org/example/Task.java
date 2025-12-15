package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private String description;
    private Enum.Status status;
    private String time;
    private String update;
    private String printout;

    public Task(String description) {
        this.description = description;
        this.status = Enum.Status.TODO;
        this.time = "";//Muss noch eine classe angelegt werden.
        this.update = "";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Enum.Status getStatus() {
        return status;
    }

    public void setStatus(Enum.Status status) {
        this.status = status;
    }

    public String getUpdate() {
        return update;
    }

    public String getPrintout() {
        return "Description: " + description + ", Status: " + status + ", Create Time: " + time + ", Last change time: " + update;
    }

    public String getTime() {
        return time;
    }

    public void setTime() {
        LocalDateTime nowTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.yyyy");
        this.time = nowTime.format(formatter);
    }

    public void setUpdate() {
        LocalDateTime nowTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.yyyy");
        this.update = nowTime.format(formatter);
    }
}

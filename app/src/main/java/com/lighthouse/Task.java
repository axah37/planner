package com.lighthouse;

import java.time.LocalDate;
import java.util.UUID;

public class Task {

    private LocalDate dateEntered;
    private LocalDate dateToBeCompleted;
    private String description;
    private UUID id;
    private String fieldId;

    public Task(){
        this.dateEntered = LocalDate.now();
        this.id = UUID.randomUUID();
    }

    public Task(String fieldId, String description, LocalDate dateToBeCompleted){
        this.dateEntered = LocalDate.now();
        this.id = UUID.randomUUID();
        this.description = description;
        this.dateToBeCompleted = dateToBeCompleted;
        this.fieldId = fieldId;
    }

    public String getFieldId() {
        return fieldId;
    }

    public LocalDate getDateEntered() {
        return dateEntered;
    }

    public LocalDate getDateToBeCompleted() {
        return dateToBeCompleted;
    }

    public String getDescription() {
        return description;
    }

    public UUID getId() {
        return id;
    }

    public void setDateToBeCompleted(LocalDate dateToBeCompleted) {
        this.dateToBeCompleted = dateToBeCompleted;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package com.lighthouse.models;

import java.time.LocalDate;
import java.util.UUID;

public class TaskModel {

    private String dateEntered;
    private String dateToBeCompleted;
    private String description;
    private String id;
    private String fieldId;

    public TaskModel() {
    }

    public String getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(String dateEntered) {
        this.dateEntered = dateEntered;
    }

    public String getDateToBeCompleted() {
        return dateToBeCompleted;
    }

    public void setDateToBeCompleted(String dateToBeCompleted) {
        this.dateToBeCompleted = dateToBeCompleted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }
}

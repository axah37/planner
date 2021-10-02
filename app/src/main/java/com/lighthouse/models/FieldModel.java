package com.lighthouse.models;

import com.lighthouse.Field;

public class FieldModel {
    String id;
    String fieldName;

    public FieldModel(Field f){
        this.id = f.getId();
        this.fieldName = f.getFieldName();
    }

    public FieldModel(String id, String fieldName) {
        this.id = id;
        this.fieldName = fieldName;
    }

    public FieldModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}

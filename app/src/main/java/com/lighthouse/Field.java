package com.lighthouse;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class Field {

    DatabaseReference dbr;
    private String id;
    private String fieldName;

    public Field() {

    }

    public Field(String id, String fieldName) {
        this.fieldName = fieldName;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getFieldName() {
        return fieldName;
    }
}
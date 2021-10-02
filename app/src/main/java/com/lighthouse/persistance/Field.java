package com.lighthouse.persistance;
import com.google.firebase.database.DatabaseReference;
import com.lighthouse.models.FieldModel;

public class Field {

    private static DatabaseReference dbr = Firebase.getConnection();

    public static void saveField(com.lighthouse.Field field){
        FieldModel sField = new FieldModel(field);
        dbr.child("fields").child(sField.getId()).setValue(sField);
    }

//    public static com.lighthouse.Field getField(String id){
//        dbr.child("fields").child(id).get().addOnCompleteListener(task -> {
//            if (!task.isSuccessful()) {
//                Log.e("firebase", "Error getting data", task.getException());
//            }
//            else {
//                Log.d("firebase", String.valueOf(task.getResult().getValue()));
//                return task.getResult().getValue(com.lighthouse.Field.class);
//
//            }
//        }


    }

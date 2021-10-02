package com.lighthouse.persistance;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Firebase {

    private static DatabaseReference CONNECTION;

    public static boolean CONNECTED = false;

    public static DatabaseReference getConnection(){
        if (CONNECTION == null){
            CONNECTION = FirebaseDatabase.getInstance("https://planner-ff358-default-rtdb.firebaseio.com/").getReference();
        }
        return CONNECTION;
    }

    public boolean isConnected (){
        DatabaseReference connectedRef = FirebaseDatabase.getInstance().getReference(".info/connected");
        connectedRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                boolean connected = snapshot.getValue(Boolean.class);
                if (connected) {
                    Log.d("TAG", "connected");
                } else {
                    Log.d("TAG", "not connected");
                }
                CONNECTED = connected;
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.w("TAG", "Listener was cancelled");
                CONNECTED = false;
            }
        });
        return CONNECTED;
    }
}
package com.lighthouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i:Segments.disabled){
            Button btn = (Button) findViewById(i);
            btn.setEnabled(false);
            btn.setBackgroundColor(Color.GRAY);
        }

        for(int i: Segments.enabled){
            Button btn = (Button) findViewById(i);
            Field f = new Field(String.valueOf(i), btn.getText().toString());
            com.lighthouse.persistance.Field.saveField(f);
            btn.setOnClickListener(v -> {
                Intent intent = new Intent(this, EditTaskActivity.class);
                intent.putExtra("FIELD_ID", String.valueOf(i));
                startActivity(intent);
            });
        }

    }
}
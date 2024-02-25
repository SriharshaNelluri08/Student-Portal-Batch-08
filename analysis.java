package com.example.t2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class analysis extends AppCompatActivity {
    ImageButton b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);
        b=(ImageButton) findViewById(R.id.analysisback);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(analysis.this,home.class);
                startActivity(i);
            }
        });
    }
}
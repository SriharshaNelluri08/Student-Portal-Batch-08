package com.example.t2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.widget.ImageButton;

public class custom_tool_bar extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageButton buttonmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_tool_bar);

    }
}
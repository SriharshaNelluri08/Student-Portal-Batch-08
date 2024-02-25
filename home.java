package com.example.t2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageButton b;
    ImageButton logOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        b=(ImageButton) findViewById(R.id.attendance);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(home.this,Attendance.class);
                startActivity(i);
            }
        });
        b=(ImageButton) findViewById(R.id.assignment);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(home.this,assessment.class);
                startActivity(i);
            }
        });
        b=(ImageButton) findViewById(R.id.Analysis);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(home.this,analysis.class);
                startActivity(i);
            }
        });
        b=(ImageButton) findViewById(R.id.table);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(home.this,timetable.class);
                startActivity(i);
            }
        });
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout =findViewById(R.id.drawyerlayout);
        navigationView=findViewById(R.id.navgigationView);

        ActionBarDrawerToggle menu=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.nav_bar_open,R.string.nav_bar_close);
        drawerLayout.addDrawerListener(menu);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        logOut=(ImageButton) findViewById(R.id.homeLogout);
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(home.this,MainActivity.class);
                startActivity(i);
            }
        });

    }
    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}


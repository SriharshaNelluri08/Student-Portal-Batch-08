package com.example.t2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {


    Button b;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Reg_Num=findViewById(R.id.username);
        TextView pwd=findViewById(R.id.password);

        b = findViewById(R.id.button2);

        textView = findViewById(R.id.toregister);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Register.class);
                startActivity(i);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String renum=Reg_Num.getText().toString();
                String Rpwd=pwd.getText().toString();

                if(renum.length()==0 || Rpwd.length()==0 ){
                    Toast.makeText(getApplicationContext(),"fill all the details",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"click on Login Button",Toast.LENGTH_SHORT).show();
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(MainActivity.this, home.class);
                            startActivity(i);
                        }
                    });
                }
            }
        });
    }}

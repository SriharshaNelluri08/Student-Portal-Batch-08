package com.example.t2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    Button b;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        TextView Reg_Num=findViewById(R.id.username);
        TextView email =findViewById(R.id.Email);
        TextView pwd=findViewById(R.id.password);
        TextView cpwd=findViewById(R.id.confirm_password);


        b = findViewById(R.id.button2);

        textView = findViewById(R.id.toLogin);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Register.this, MainActivity.class);
                startActivity(i);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String renum=Reg_Num.getText().toString();
                String Email=email.getText().toString();
                String Rpwd=pwd.getText().toString();
                String CRpwd=cpwd.getText().toString();

                if(renum.length()==0 || Email.length()==0 || Rpwd.length()==0 || CRpwd.length()==0){
                    Toast.makeText(getApplicationContext(),"fill all the details",Toast.LENGTH_SHORT).show();
                }
                else{
                    if(Rpwd.compareTo(CRpwd)==0){
                        Toast.makeText(getApplicationContext(),"password and confirm password matched",Toast.LENGTH_SHORT).show();

                    }
                    else{
                        Toast.makeText(getApplicationContext(),"password and confirm password didnt match",Toast.LENGTH_SHORT).show();
                        b.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i = new Intent(Register.this, MainActivity.class);
                                startActivity(i);
                            }
                        });
                    }
                }
            }
        });
    }
}
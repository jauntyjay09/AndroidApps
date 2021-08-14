package com.example.mlab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4;
Intent pas1,pas2,pas3,pas4;
int t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        t1=0;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1==0){
                    pas1=new Intent(getApplicationContext(),music1.class);
                    startService(pas1);
                    t1=1;
                    Toast.makeText(getApplicationContext(),"Tone 1 playing",Toast.LENGTH_SHORT).show();
                }
                else{
                    if(t1==1){
                        t1=0;
                        stopService(pas1) ;
                    }
                    else if(t1==2){
                        t1=0;
                        stopService(pas2) ;
                    }
                    else if(t1==3){
                        t1=0;
                        stopService(pas3) ;
                    }
                    else if(t1==4){
                        t1=0;
                        stopService(pas4) ;
                    }

                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1==0){
                    pas2=new Intent(getApplicationContext(),music2.class);
                    startService(pas2);
                    t1=2;
                    Toast.makeText(getApplicationContext(),"Tone 2 playing",Toast.LENGTH_SHORT).show();
                }
                else{
                    if(t1==1){
                        t1=0;
                        stopService(pas1) ;
                    }
                    else if(t1==2){
                        t1=0;
                        stopService(pas2) ;
                    }
                    else if(t1==3){
                        t1=0;
                        stopService(pas3) ;
                    }
                    else if(t1==4){
                        t1=0;
                        stopService(pas4) ;
                    }

                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1==0){
                    pas3=new Intent(getApplicationContext(),music3.class);
                    startService(pas3);
                    t1=3;
                    Toast.makeText(getApplicationContext(),"Tone 3 playing",Toast.LENGTH_SHORT).show();
                }
                else{
                    if(t1==1){
                        t1=0;
                        stopService(pas1) ;
                    }
                    else if(t1==2){
                        t1=0;
                        stopService(pas2) ;
                    }
                    else if(t1==3){
                        t1=0;
                        stopService(pas3) ;
                    }
                    else if(t1==4){
                        t1=0;
                        stopService(pas4) ;
                    }

                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1==0){
                    pas4=new Intent(getApplicationContext(),music.class);
                    startService(pas4);
                    t1=4;
                    Toast.makeText(getApplicationContext(),"Tone 4 playing",Toast.LENGTH_SHORT).show();
                }
                else{
                    if(t1==1){
                        t1=0;
                        stopService(pas1) ;
                    }
                    else if(t1==2){
                        t1=0;
                        stopService(pas2) ;
                    }
                    else if(t1==3){
                        t1=0;
                        stopService(pas3) ;
                    }
                    else if(t1==4){
                        t1=0;
                        stopService(pas4) ;
                    }

                }
            }
        });
    }
}
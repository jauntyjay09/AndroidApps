package com.example.mlab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText e1;
TextView t1;
Button b1,b2,b3,b4,bc,be,bn0,bn1,bn2,bn3,bn4,bn5,bn6,bn7,bn8,bn9;
int a,b,c,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.e1);
        t1=findViewById(R.id.t1);
        bc=findViewById(R.id.bc);
        be=findViewById(R.id.be);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        bn0=findViewById(R.id.bn0);
        bn1=findViewById(R.id.bn1);
        bn2=findViewById(R.id.bn2);
        bn3=findViewById(R.id.bn3);
        bn4=findViewById(R.id.bn4);
        bn5=findViewById(R.id.bn5);
        bn6=findViewById(R.id.bn6);
        bn7=findViewById(R.id.bn7);
        bn8=findViewById(R.id.bn8);
        bn9=findViewById(R.id.bn9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 a=Integer.parseInt(e1.getText().toString());
                 c=1;
                 t1.setText("Adding...");
                 e1.setText("");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(e1.getText().toString());
                c=2;
                t1.setText("Subtracting...");
                e1.setText("");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(e1.getText().toString());
                c=3;
                t1.setText("Multiplying...");
                e1.setText("");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(e1.getText().toString());
                c=4;
                t1.setText("Dividing...");
                e1.setText("");
            }
        });
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 b=Integer.parseInt(e1.getText().toString());
                 switch (c){
                     case 1:d=a+b;
                     break;
                     case 2:d=a-b;
                     break;
                     case 3:d=a*b;
                     break;
                     case 4:d=a/b;
                     break;
                     default:d=0;

                 }
                t1.setText("Result");
                 e1.setText(String.valueOf(d));


            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=b=c=d=0;
                t1.setText("Cleared");
                e1.setText("");
            }
        });
        bn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=e1.getText().toString();
                e1.setText(res+"0");

            }
        });
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=e1.getText().toString();
                e1.setText(res+"1");

            }
        });
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=e1.getText().toString();
                e1.setText(res+"2");

            }
        });
        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=e1.getText().toString();
                e1.setText(res+"3");

            }
        });
        bn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=e1.getText().toString();
                e1.setText(res+"4");

            }
        });
        bn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=e1.getText().toString();
                e1.setText(res+"5");

            }
        });
        bn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=e1.getText().toString();
                e1.setText(res+"6");

            }
        });
        bn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=e1.getText().toString();
                e1.setText(res+"7");

            }
        });
        bn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=e1.getText().toString();
                e1.setText(res+"8");

            }
        });
        bn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=e1.getText().toString();
                e1.setText(res+"9");

            }
        });
    }
}
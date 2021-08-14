package com.example.mlab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.awt.font.TextAttribute;
import java.lang.reflect.Array;
import java.util.Arrays;

public class mlab4sort extends AppCompatActivity {
TextView t6,t7,t8,t9,t11,t12;
Button b5;
int sarr[] =new int[6];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mlab4sort2);
        t6=findViewById(R.id.t6);
        t7=findViewById(R.id.t7);
        t8=findViewById(R.id.t8);
        t9=findViewById(R.id.t9);
        t11=findViewById(R.id.t11);
        t12=findViewById(R.id.t12);
        b5=findViewById(R.id.b5);
        Intent so=getIntent();
        Bundle bo=so.getExtras();
        int a=Integer.parseInt(bo.getString("n0"));
        int b=Integer.parseInt(bo.getString("n1"));
        int c=Integer.parseInt(bo.getString("n2"));
        int d=Integer.parseInt(bo.getString("n3"));
        int e=Integer.parseInt(bo.getString("n4"));
        int f=Integer.parseInt(bo.getString("n5"));
        int sum=a+b+c+d+e+f;

        sarr[0]=a;
        sarr[1]=b;
        sarr[2]=c;
        sarr[3]=d;
        sarr[4]=e;
        sarr[5]=f;
        Arrays.sort(sarr);
        t11.setText(String.valueOf(sarr[0]));
        t9.setText(String.valueOf(sarr[1]));
        t8.setText(String.valueOf(sarr[2]));
        t7.setText(String.valueOf(sarr[3]));
        t6.setText(String.valueOf(sarr[4]));
        t12.setText(String.valueOf(sarr[5]));

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nh= new Intent();
                nh.putExtra("res",sum);
                setResult(RESULT_OK,nh);
                finish();
            }
        });


    }
}
package com.example.mlab4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Session2Command;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
TextView t0,t1,t2,t3,t4,t5,res;
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t0=findViewById(R.id.t0);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        res=findViewById(R.id.res);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("");
                t0.setText(String.valueOf(new Random().nextInt(9)));
                t1.setText(String.valueOf(new Random().nextInt(9)));
                t2.setText(String.valueOf(new Random().nextInt(9)));
                t3.setText(String.valueOf(new Random().nextInt(9)));
                t4.setText(String.valueOf(new Random().nextInt(9)));
                t5.setText(String.valueOf(new Random().nextInt(9)));

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sor=new Intent(getApplicationContext(),mlab4sort.class);
                Bundle bun=new Bundle();
                bun.putString("n0",t0.getText().toString());
                bun.putString("n1",t1.getText().toString());
                bun.putString("n2",t2.getText().toString());
                bun.putString("n3",t3.getText().toString());
                bun.putString("n4",t4.getText().toString());
                bun.putString("n5",t5.getText().toString());
                sor.putExtras(bun);
                startActivityForResult(sor,1);

            }
        });



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent nh) {
        res=findViewById(R.id.res);
        super.onActivityResult(requestCode, resultCode, nh);
        if(requestCode==1){
            if(resultCode== RESULT_OK){
                int re=nh.getIntExtra("res",0);
                res.setText(String.valueOf(re));
            }
        }

    }
}
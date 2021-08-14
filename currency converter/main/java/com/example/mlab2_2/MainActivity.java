package com.example.mlab2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText t1,t2;
Button b1;
RadioGroup rg;
RadioButton e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        b1=findViewById(R.id.b1);
        rg=findViewById(R.id.rg);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int i=rg.getCheckedRadioButtonId();
                e1=findViewById(i);
                if(e1.isChecked()){
                   if(e1.getText().toString().equals("USD")){
                       double a=0.014;
                       double r=Integer.parseInt(t1.getText().toString());
                       r=r*a;
                       t2.setText(String.valueOf(r));
                   }
                   if(e1.getText().toString().equals("EURO")){
                       double a=0.011;
                       double r=Integer.parseInt(t1.getText().toString());
                       r=r*a;
                       t2.setText(String.valueOf(r));
                   }
                   if(e1.getText().toString().equals("YEN")){
                       double a=1.44;
                       double r=Integer.parseInt(t1.getText().toString());
                       r=r*a;
                       t2.setText(String.valueOf(r));
                   }

                }
            }
        });


    }
}
package com.example.scientificcalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    EditText Num1,Num2;
    Button Sum ,sub,multi,divide,mod;
    TextView Result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Num1=findViewById(R.id.editTextText);
        Num2=findViewById(R.id.editTextText2);
        Result=findViewById(R.id.textView2);
        Sum=findViewById(R.id.button);
        sub=findViewById(R.id.button2);
        multi=findViewById(R.id.button3);
        divide=findViewById(R.id.button4);
        mod=findViewById(R.id.button5);


      Sum.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                int wt= Integer.parseInt( Num1.getText().toString());
                int in= Integer.parseInt(  Num2.getText().toString());
                int sum=wt+in;
                Result.setText(sum+" ");

        }

    });
        sub.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                int wt= Integer.parseInt( Num1.getText().toString());
                int in= Integer.parseInt(  Num2.getText().toString());
                int sub=wt-in;
                Result.setText(sub +" ");

            }

        });
        multi.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                int wt= Integer.parseInt( Num1.getText().toString());
                int in= Integer.parseInt(  Num2.getText().toString());
                int multi=wt*in;
                Result.setText(multi +" ");

            }

        });
        divide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                int wt= Integer.parseInt( Num1.getText().toString());
                int in= Integer.parseInt(  Num2.getText().toString());
                int divide=wt/in;
                Result.setText(divide +" ");

            }

        });
        mod.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                int wt= Integer.parseInt( Num1.getText().toString());
                int in= Integer.parseInt(  Num2.getText().toString());
                int mod=wt%in;
                Result.setText(mod +" ");

            }

        });
}
}
package com.example.eyadabdelrahmanfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText number1 = findViewById(R.id.editTextTextPersonName);
        EditText number2 = findViewById(R.id.editTextTextPersonName2);
        Button cal = findViewById(R.id.button);
        Button multiply = findViewById(R.id.mutiply);
        Button cal4 = findViewById(R.id.button4);
        Button cals = findViewById(R.id.buttons);
        TextView res = findViewById(R.id.textView3);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(number1.getText().toString());
                int b = Integer.parseInt(number2.getText().toString());
                int c = a + b;
                res.setText(c + " ");
            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(number1.getText().toString());
                int b = Integer.parseInt(number2.getText().toString());
                int x = a * b;
                res.setText(x + " ");
            }
        });

        cal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(number1.getText().toString());
                int b = Integer.parseInt(number2.getText().toString());
                int d = a / b;
                res.setText(d + " ");
            }

        });

        cals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(number1.getText().toString());
                int b = Integer.parseInt(number2.getText().toString());
                int s = a - b;
                res.setText(s + " ");
            }


        });


    }
}
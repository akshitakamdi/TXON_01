package com.example.txon_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class fift_MainActivity2 extends AppCompatActivity {
TextView    outputtoml;
Button converttoml;
EditText Enternumberl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fift_main2);
        outputtoml=findViewById(R.id.textViewtoml6);
        converttoml=findViewById(R.id.buttonml);
        Enternumberl=findViewById(R.id.editTextNumb2ml);
        converttoml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no=Enternumberl.getText().toString();
                int no1=Integer.parseInt(no);
                int convert=(no1*1000);
                outputtoml.setText("Value:" +convert);
            }
        });
    }
}
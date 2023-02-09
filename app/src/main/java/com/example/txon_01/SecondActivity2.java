package com.example.txon_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity2 extends AppCompatActivity {
TextView output;
EditText EnterNum;
Button convert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        output=findViewById(R.id.output1);
        EnterNum=findViewById(R.id.editTextNumber);
        convert=findViewById(R.id.coverter1);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
String num=EnterNum.getText().toString();
int number=Integer.parseInt(num);
float convert=(number*100);
output.setText("Value:"+convert);
            }
        });
    }
}
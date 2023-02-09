package com.example.txon_01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fourth_Activity extends AppCompatActivity {
TextView Output2;
EditText EnterNumber;
Button convert2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        Output2=findViewById(R.id.textView5);
        EnterNumber=findViewById(R.id.txtnumber);
        convert2=findViewById(R.id.converter3);
        convert2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String num=EnterNumber.getText().toString();
                int number=Integer.parseInt(num);
                double convert=(number*2.54);
                Output2.setText("Value : "+convert);
            }
        });
    }
}
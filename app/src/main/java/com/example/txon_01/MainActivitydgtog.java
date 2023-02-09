package com.example.txon_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivitydgtog extends AppCompatActivity {
EditText ennm;
TextView Outputingm;
Button convertogm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitydgtog);
        ennm=findViewById(R.id.editTextNumber2tog);
        Outputingm=findViewById(R.id.textView8gm);
        convertogm=findViewById(R.id.buttontogm);
        convertogm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numm=ennm.getText().toString();
                int nom=Integer.parseInt(numm);
                float convert=(nom*10);
                Outputingm.setText("Value:"+convert);
            }
        });
    }
}
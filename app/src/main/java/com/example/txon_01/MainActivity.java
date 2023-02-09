package com.example.txon_01;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
Button mtocm;
Button inchtocm;
Button ltoml;
Button dgtog;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtocm=findViewById(R.id.button1);
        inchtocm=findViewById(R.id.button3);
        ltoml=findViewById(R.id.button4);
        dgtog=findViewById(R.id.button5);

        mtocm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),SecondActivity2.class);
                startActivity(intent);
            }
        });
       inchtocm.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent in=new Intent(getApplicationContext(),Fourth_Activity.class);
               startActivity(in);
           }
       });
       ltoml.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent litoml=new Intent(getApplicationContext(),fift_MainActivity2.class);
               startActivity(litoml);
           }
       });
       dgtog.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent inttog=new Intent(getApplicationContext(),MainActivitydgtog.class);
               startActivity(inttog);

           }
       });

    }
}
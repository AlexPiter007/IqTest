package com.example.iqtest001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;


public class main extends AppCompatActivity {
    TextView iq1A, iq1B,iq1C,iq1D,textView;
   Utils Point;

    Intent sw;
    final Handler handler=new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        sw=new Intent(this, iq2.class);
        iq1A=findViewById(R.id.iq2aA);
        iq1B=findViewById(R.id.iq1aB);
        iq1C=findViewById(R.id.iq1aC);
        iq1D=findViewById(R.id.iq1aD);
        Point=new Utils();




    }


    public void run(){
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(sw);

            }
        },1000);
    }

    public void iq1aA(View view) {
       iq1A.setBackgroundResource(R.color.colorRed);
       run();
    }
    public void iq1aB(View view) {
        iq1B.setBackgroundResource(R.color.colorRed);
        run();
    }
    public void iq1aC(View view) {
        iq1C.setBackgroundResource(R.color.colorGreen);
        Point.points++;
        sw.putExtra("points",Point.points);
        run();
    }
    public void iq1aD(View view) {
        iq1D.setBackgroundResource(R.color.colorRed);
       run();
    }



}

package com.example.iqtest001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class iq15 extends AppCompatActivity {
    int point;
    ImageView iqA, iqB, iqC, iqD, iqE, iqF;
    Intent sw;
    final Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iq15);
        Intent q = getIntent();
        point = q.getIntExtra("points", 0);
        iqA = findViewById(R.id.iq15aA);
        iqB = findViewById(R.id.iq15aB);
        iqC = findViewById(R.id.iq15aC);
        iqD = findViewById(R.id.iq15aD);
        iqE = findViewById(R.id.iq15aE);
        iqF = findViewById(R.id.iq15aF);

        sw = new Intent(this, iq16.class);

    }


    public void run() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                sw.putExtra("points", point);
                startActivity(sw);

            }
        }, 1000);
    }

    public void iqA(View view) {
        iqA.setBackgroundResource(R.color.colorRed);
        run();
    }

    public void iqB(View view) {
        iqB.setBackgroundResource(R.color.colorRed);
        run();
    }

    public void iqC(View view) {
        iqC.setBackgroundResource(R.color.colorRed);
        run();
    }

    public void iqD(View view) {
        iqD.setBackgroundResource(R.color.colorRed);
        run();
    }

    public void iqE(View view) {
        iqE.setBackgroundResource(R.color.colorRed);

        run();
    }
    public void iqF(View view) {
        iqF.setBackgroundResource(R.color.colorGreen);
        point += 3;
        run();
    }


}




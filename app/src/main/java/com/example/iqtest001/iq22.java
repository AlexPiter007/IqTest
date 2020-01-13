package com.example.iqtest001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class iq22 extends AppCompatActivity {
    int point;
    TextView iqA, iqB, iqC, iqD, iqE, iqF,iqG,iqH,iqI;
    Intent sw;
    final Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iq22);
        Intent q = getIntent();
        point = q.getIntExtra("points", 0);
        iqA = findViewById(R.id.iq22aA);
        iqB = findViewById(R.id.iq22aB);
        iqC = findViewById(R.id.iq22aC);
        iqD = findViewById(R.id.iq22aD);
        iqE = findViewById(R.id.iq22aE);
        iqF = findViewById(R.id.iq22aF);
        iqG = findViewById(R.id.iq22aG);
        iqH = findViewById(R.id.iq22aH);
        iqI = findViewById(R.id.iq22aI);



        sw = new Intent(this, iqa.class);

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
        iqE.setBackgroundResource(R.color.colorGreen);
        point+=3;
        run();
    }
    public void iqF(View view) {
        iqF.setBackgroundResource(R.color.colorRed);
        run();
    }
    public void iqG(View view) {
        iqG.setBackgroundResource(R.color.colorRed);
        run();
    }
    public void iqH(View view) {
        iqH.setBackgroundResource(R.color.colorRed);
        run();
    }
    public void iqI(View view) {
        iqI.setBackgroundResource(R.color.colorRed);
        run();
    }




}



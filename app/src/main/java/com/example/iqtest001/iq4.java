package com.example.iqtest001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class iq4 extends AppCompatActivity {

    int point;
    ImageView iqA,iqB,iqC,iqD,iqE,iqF;
    Intent sw;
    final Handler handler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iq4);
        Intent q=getIntent();
        point=q.getIntExtra("points",0);
        iqA=findViewById(R.id.iq4aA);
        iqB=findViewById(R.id.iq4aB);
        iqC=findViewById(R.id.iq4aC);
        iqD=findViewById(R.id.iq4aD);
        iqE=findViewById(R.id.iq4aE);
        iqF=findViewById(R.id.iq4aF);
        sw=new Intent(this, iq5.class);

    }



    public void run(){
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                sw.putExtra("points",point);
                startActivity(sw);

            }
        },1000);}

    public void iq4aA(View view) {
        iqA.setBackgroundResource(R.color.colorRed);
        run();
    }
    public void iq4aB(View view) {
        iqB.setBackgroundResource(R.color.colorGreen);
        point++;
        run();
    }
    public void iq4aC(View view) {
        iqC.setBackgroundResource(R.color.colorRed);
        run();
    }
    public void iq4aD(View view) {
        iqD.setBackgroundResource(R.color.colorRed);
        run();
    }
    public void iq4aE(View view) {
        iqE.setBackgroundResource(R.color.colorRed);

        run();
    }
    public void iq4aF(View view) {
        iqF.setBackgroundResource(R.color.colorRed);
        run();
    }
    }


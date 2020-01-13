package com.example.iqtest001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class iq10 extends AppCompatActivity {
    int point;
    TextView iqA,iqB,iqC,iqD,iqE,iqF;
    Intent sw;
    final Handler handler=new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iq10);
        Intent q=getIntent();
        point=q.getIntExtra("points",0);
        iqA=findViewById(R.id.iq10aA);
        iqB=findViewById(R.id.iq10aB);
        iqC=findViewById(R.id.iq10aC);
        iqD=findViewById(R.id.iq10aD);
        iqE=findViewById(R.id.iq10aE);
        sw=new Intent(this, iq11.class);

    }



    public void run(){
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                sw.putExtra("points",point);
                startActivity(sw);

            }
        },1000);}

    public void iq10aA(View view) {
        iqA.setBackgroundResource(R.color.colorRed);

        run();
    }
    public void iq10aB(View view) {
        iqB.setBackgroundResource(R.color.colorRed);

        run();
    }
    public void iq10aC(View view) {
        iqC.setBackgroundResource(R.color.colorRed);

        run();
    }
    public void iq10aD(View view) {
        iqD.setBackgroundResource(R.color.colorRed);
        run();
    }
    public void iq10aE(View view) {
        iqE.setBackgroundResource(R.color.colorGreen);
        point+=5;
        run();
    }
    }


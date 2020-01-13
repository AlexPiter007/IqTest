package com.example.iqtest001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class iq6 extends AppCompatActivity {
    int point;
    TextView iqA,iqB,iqC,iqD,iqE,iqF;
    Intent sw;
    final Handler handler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iq6);
        Intent q=getIntent();
        point=q.getIntExtra("points",0);

        iqA=findViewById(R.id.iq6aA);
        iqB=findViewById(R.id.iq6aB);
        iqC=findViewById(R.id.iq6aC);
        iqD=findViewById(R.id.iq6aD);
        iqE=findViewById(R.id.iq6aE);
        sw=new Intent(this, iq7.class);

    }



    public void run(){
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                sw.putExtra("points",point);
                startActivity(sw);

            }
        },1000);}

    public void iq6aA(View view) {
        iqA.setBackgroundResource(R.color.colorRed);
        run();
    }
    public void iq6aB(View view) {
        iqB.setBackgroundResource(R.color.colorRed);

        run();
    }
    public void iq6aC(View view) {
        iqC.setBackgroundResource(R.color.colorRed);
        run();
    }
    public void iq6aD(View view) {
        iqD.setBackgroundResource(R.color.colorRed);

        run();
    }
    public void iq6aE(View view) {
        iqE.setBackgroundResource(R.color.colorGreen);
        point+=2;

        run();
    }


}


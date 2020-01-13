package com.example.iqtest001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class iq5 extends AppCompatActivity {
    int point;
    TextView iqA,iqB,iqC,iqD,iqE,iqF;
    Intent sw;
    final Handler handler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iq5);
        Intent q=getIntent();
        point=q.getIntExtra("points",0);

        iqA=findViewById(R.id.iq5aA);
        iqB=findViewById(R.id.iq5aB);
        iqC=findViewById(R.id.iq5aC);
        iqD=findViewById(R.id.iq5aD);
        iqE=findViewById(R.id.iq5aE);
        sw=new Intent(this, iq6.class);

    }



    public void run(){
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                sw.putExtra("points",point);
                startActivity(sw);

            }
        },1000);}

    public void iq5aA(View view) {
        iqA.setBackgroundResource(R.color.colorRed);
        run();
    }
    public void iq5aB(View view) {
        iqB.setBackgroundResource(R.color.colorRed);

        run();
    }
    public void iq5aC(View view) {
        iqC.setBackgroundResource(R.color.colorRed);
        run();
    }
    public void iq5aD(View view) {
        iqD.setBackgroundResource(R.color.colorGreen);
        point+=2;
        run();
    }
    public void iq5aE(View view) {
        iqE.setBackgroundResource(R.color.colorRed);

        run();
    }

    }


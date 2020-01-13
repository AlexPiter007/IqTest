package com.example.iqtest001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class iq7 extends AppCompatActivity {
    int point;
    ImageView iqA,iqB,iqC,iqD,iqE,iqF;
    Intent sw;
    final Handler handler=new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iq7);
        Intent q=getIntent();
        point=q.getIntExtra("points",0);
        iqA=findViewById(R.id.iq7aA);
        iqB=findViewById(R.id.iq7aB);
        iqC=findViewById(R.id.iq7aC);
        iqD=findViewById(R.id.iq7aD);
        iqE=findViewById(R.id.iq7aE);
        sw=new Intent(this, iq8.class);

    }



    public void run(){
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                sw.putExtra("points",point);
                startActivity(sw);

            }
        },1000);}

    public void iq7aA(View view) {
        iqA.setBackgroundResource(R.color.colorRed);
        run();
    }
    public void iq7aB(View view) {
        iqB.setBackgroundResource(R.color.colorRed);

        run();
    }
    public void iq7aC(View view) {
        iqC.setBackgroundResource(R.color.colorGreen);
        point+=3;
        run();
    }
    public void iq7aD(View view) {
        iqD.setBackgroundResource(R.color.colorRed);

        run();
    }
    public void iq7aE(View view) {
        iqE.setBackgroundResource(R.color.colorRed);
              run();
    }


}


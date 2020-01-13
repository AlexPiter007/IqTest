package com.example.iqtest001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class iq9 extends AppCompatActivity {
    int point;
    TextView iqA,iqB,iqC,iqD,iqE,iqF;
    Intent sw;
    final Handler handler=new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iq9);
        Intent q=getIntent();
        point=q.getIntExtra("points",0);
        iqA=findViewById(R.id.iq9aA);
        iqB=findViewById(R.id.iq9aB);
        iqC=findViewById(R.id.iq9aC);
        iqD=findViewById(R.id.iq9aD);
        iqE=findViewById(R.id.iq9aE);
        sw=new Intent(this, iq10.class);

    }



    public void run(){
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                sw.putExtra("points",point);
                startActivity(sw);

            }
        },1000);}

    public void iq9aA(View view) {
        iqA.setBackgroundResource(R.color.colorRed);

        run();
    }
    public void iq9aB(View view) {
        iqB.setBackgroundResource(R.color.colorRed);

        run();
    }
    public void iq9aC(View view) {
        iqC.setBackgroundResource(R.color.colorRed);

        run();
    }
    public void iq9aD(View view) {
        iqD.setBackgroundResource(R.color.colorGreen);
        point+=2;

        run();
    }
    public void iq9aE(View view) {
        iqE.setBackgroundResource(R.color.colorRed);
        run();
    }


}




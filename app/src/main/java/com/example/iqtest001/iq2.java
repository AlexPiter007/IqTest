package com.example.iqtest001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class iq2 extends AppCompatActivity {
    TextView iq2A, iq2B,iq2C,iq2D;
    int point;
    Intent sw;
    final Handler handler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iq2);
        Intent q=getIntent();
        point=q.getIntExtra("points",0);

    sw=new Intent(this, iq3.class);
    iq2A=findViewById(R.id.iq2aA);
    iq2B=findViewById(R.id.iq2aB);
    iq2C=findViewById(R.id.iq2aC);
    iq2D=findViewById(R.id.iq2aD);





}
    public void run(){
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                sw.putExtra("points",point);
                startActivity(sw);

            }
        },1000);
    }

    public void iq2aA(View view) {
        iq2A.setBackgroundResource(R.color.colorRed);
        run();
    }
    public void iq2aB(View view) {
        iq2B.setBackgroundResource(R.color.colorGreen);
        point+=2;

                run();
    }
    public void iq2aC(View view) {
        iq2C.setBackgroundResource(R.color.colorRed);
        run();
    }
    public void iq2aD(View view) {
        iq2D.setBackgroundResource(R.color.colorRed);
        run();
    }

}

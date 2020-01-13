package com.example.iqtest001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class iq3 extends AppCompatActivity {


    int point;
    ImageView iq3A,iq3B,iq3C,iq3D,iq3E,iq3F;
    Intent sw;
    final Handler handler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iq3);

        Intent q=getIntent();
        point=q.getIntExtra("points",0);
        iq3A=findViewById(R.id.iq3aA);
        iq3B=findViewById(R.id.iq3aB);
        iq3C=findViewById(R.id.iq3aC);
        iq3D=findViewById(R.id.iq3aD);
        iq3E=findViewById(R.id.iq3aE);
        iq3F=findViewById(R.id.iq3aF);
        sw=new Intent(this, iq4.class);

    }



    public void run(){
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                sw.putExtra("points",point);
                startActivity(sw);

            }
        },1000);}

    public void iq3aA(View view) {
        iq3A.setBackgroundResource(R.color.colorRed);
        run();
    }
    public void iq3aB(View view) {
        iq3B.setBackgroundResource(R.color.colorRed);
        run();
    }
    public void iq3aC(View view) {
        iq3C.setBackgroundResource(R.color.colorRed);
        run();
    }
    public void iq3aD(View view) {
        iq3D.setBackgroundResource(R.color.colorRed);
        run();
    }
    public void iq3aE(View view) {
        iq3E.setBackgroundResource(R.color.colorGreen);
        point+=3;
        run();
    }
    public void iq3aF(View view) {
        iq3F.setBackgroundResource(R.color.colorRed);
        run();
    }
}

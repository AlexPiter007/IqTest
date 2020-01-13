package com.example.iqtest001;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppThemeA);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    public void start(View view) {
        Intent sw=new Intent(this, main.class);
        startActivity(sw);
    }
    public void rateapp(View view) {
        Intent sw=new Intent(Intent.ACTION_VIEW);
        sw.setData(Uri.parse("market://details?id="+getPackageName()));
        startActivity(sw);
    }
    public void about(View view) {
        Intent sw=new Intent(this, iq23.class);
        startActivity(sw);
    }

    public void exitt(View view) {
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN)
            finishAffinity();
        else
            ActivityCompat.finishAffinity(this);
    }
}

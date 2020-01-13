package com.example.iqtest001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class iqa extends AppCompatActivity {
    int point;
    TextView ter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqa);
        Intent q = getIntent();
        point = q.getIntExtra("points", 0);
        ter=findViewById(R.id.textView);
        if(point==60)
            ter.setText("Вы набрали "+point+" баллов (из 60) в этом тесте. Вы перевосходно справились всеми вопросами. У вас очень развита логический мышления.");
        if(point>50&&point<60)
            ter.setText("Вы набрали "+point+" баллов (из 60) в этом тесте!! У вас очень развита логический мышления.");
        if(point>40&&point<50)
            ter.setText("Вы набрали "+point+" баллов (из 60) в этом тесте!! У вас достаточно развита логический мышления.");
        if(point>30&&point<40)
            ter.setText("Вы набрали "+point+" баллов (из 60) в этом тесте!! У вас нормально  развита логический мышления.(Вы среднестатистический человек)");
        if(point>20&&point<30)
            ter.setText("Вы набрали "+point+" баллов (из 60) в этом тесте!! У вас неочень развита логический мышления.(Вы немного не дотягиваетесь до среднестатистического человека)");
        if(point>10&&point<20)
            ter.setText("Вы набрали "+point+" баллов (из 60) в этом тесте!! У вас ест проблемы с логический мышлением.(Вы не среднестатистический человек(совет: Почитайте книги и тренируйте свой мозг))");
        if(point<10)
            ter.setText("Вы набрали "+point+" баллов (из 60) в этом тесте!! У вас ест больщие проблемы с логический мышлением(совет: Почитайте книги и тренируйте свой мозг).");

    }
}

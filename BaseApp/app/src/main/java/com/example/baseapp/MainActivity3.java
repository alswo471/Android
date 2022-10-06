package com.example.baseapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    //1단계 : 위젯 변수 선언
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //2단계 찾기
    tv1 =(TextView)findViewById(R.id.textView1);

    //3단계 : 자바에서 textView 속성 변경하기
        tv1.setText("안녕하세요");
        tv1.setTextColor(Color.RED);
        tv1.setTextSize(30);
        tv1.setBackgroundColor(Color.GREEN);
}
}
package com.example.baseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //1단계 : 위젯 변수 선언
    Button button1, button2, button3;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        text1 = (TextView) findViewById(R.id.text1);

        button1.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "버튼을 눌렀어요",
                        Toast.LENGTH_SHORT).show();
                //makeText(대상, 문자열, 길이) : 문자열 만들기
                //show() : 보이기
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "두번째 버튼을 눌렀어요",
                        Toast.LENGTH_SHORT).show();
                //makeText(대상, 문자열, 길이) : 문자열 만들기
                //show() : 보이기
            }
        });

        button3.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                text1.setText("Hello world 대신에 바뀜");
                //setText("문자열") : 문자열을 변경함
                return false;
            }
        });
    }
}
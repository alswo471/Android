package com.example.studentscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //1단계 : 변수들 선언

    EditText edit1, edit2 , edit3;
    Button btnCalc;// 버튼 위젯 변수
    TextView textResult;// 계산 결과를 보여줄 위젯 변수
    ImageView img;

    String bp, dl , sq; //eduttext 로 부터 입력받은 값을 저장할 변수
    int result; //bmi 수치를 저장할 변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studentscore_main);
        setTitle("3대 운동 학생 점수 - 지민재_2121002");
        //2단계 : ID 찾기
        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText)  findViewById(R.id.Edit2);
        edit3 = (EditText)  findViewById(R.id.Edit3);
        btnCalc = (Button)  findViewById(R.id.button);
        textResult = (TextView)  findViewById(R.id.textView4);
        img = (ImageView) findViewById(R.id.Img);

        //3단계 : 기능 부여
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bp = edit1.getText().toString();
                //getText():edit1에 입력된 값 가져오기
                dl = edit2.getText().toString();

                sq = edit3.getText().toString();

                result = Integer.parseInt(bp) + Integer.parseInt(dl) + Integer.parseInt(sq);
                double sum = (double) result / 3.0;

                if (sum >= 90) {
                    textResult.setText("총점 : " + result +  " 평균 : " + sum + " 학점 : A");
                    img.setImageResource(R.drawable.aimg);

                } else if (sum >= 80) {
                    textResult.setText("총점 : " + result +  " 평균 : " + sum + " 학점 : B");
                    img.setImageResource(R.drawable.bimg);
                } else if (sum >= 70) {
                    textResult.setText("총점 : " + result +  " 평균 : " + sum + " 학점 : C");
                    img.setImageResource(R.drawable.cimg);
                } else {
                    textResult.setText("총점 : " + result +  " 평균 : " + sum + " 학점 : D");
                }
            }

        });
        //1) 3과목 성적 입력 받고

        //2)총점 구하기

        //3) 평균 구하기
        //4) 평균값을 기준으로 평점 구하기
    }
}
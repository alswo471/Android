package com.example.bmi_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2; // 입력위젯 변수 선언
    Button btnCalc;// 버튼 위젯 변수
    TextView textResult;// 계산 결과를 보여줄 위젯 변수
    ImageView img;

    String weight, height; //eduttext 로 부터 입력받은 값을 저장할 변수
    Double result; //bmi 수치를 저장할 변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_main);
        setTitle("BMI계산 - 지민재_2121002");

        //2단계 : id찾기
        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText)  findViewById(R.id.Edit2);
        btnCalc = (Button)  findViewById(R.id.button);
        textResult = (TextView)  findViewById(R.id.textView4);
        img = (ImageView) findViewById(R.id.min);

        //3단계  : 기능부여
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weight = edit1.getText().toString();
                //getText():edit1에 입력된 값 가져오기
               height = edit2.getText().toString();

               //BMI 수치 = 몸무게/키*키
                result=Double.parseDouble(weight)/((Double.parseDouble(height)/100)*(Double.parseDouble(height)/100));

                //BMI 값 구하기
                if(result >= 30){
                    textResult.setText("계산 결과 : " + result.toString() + " - 고도 비만");

                    img.setImageResource(R.drawable.minjae);

                }else if (result >= 25){
                    textResult.setText("계산 결과 : " + result.toString() + " - 비만");
                }else if (result >= 23){
                    textResult.setText("계산 결과 : " + result.toString() + " - 과체중");
                }else if(result >= 18){
                    textResult.setText("계산 결과 : " + result.toString() + " - 정상");
                }
                else {
                    textResult.setText("계산 결과 : " + result.toString() + " - 저체중");
                }

            }
        });
    }
}
package com.example.layoutstudy_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//1단계 : 위젯변수선언, 계산에 이용될 변수
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRemain;
    TextView textResult;
    String num1, num2;
    Integer result;
    //추가된 변수 --> 숫자버튼을 다루기 위한 배열
    Button[] numButtons = new Button[10];
    Integer[] numBtnIDs = {R.id.BtnNum0, R.id.BtnNum1, R.id.BtnNum2, R.id.BtnNum3, R.id.BtnNum4, R.id.BtnNum5,
            R.id.BtnNum6, R.id.BtnNum7, R.id.BtnNum8, R.id.BtnNum9};

    int i; //반복할때 사용할 변수



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        setTitle("간단계산기-2121002_지민재");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnRemain = (Button) findViewById(R.id.btnRemain);

        textResult = (TextView) findViewById(R.id.textView4);


        //각 숫자 버튼 id 찾기
        for(int i = 0; i<numBtnIDs.length; i++) {
            numButtons[i]=(Button) findViewById(numBtnIDs[i]);
        }

        //1> 각 버튼을 클릭할 때 클릭한 숫자가 edit에 보여지기
        for(int i = 0; i<numBtnIDs.length; i++) {
            final int index;
            index = i;

            numButtons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(edit1.isFocused() == true) {
                        num1 = edit1.getText().toString() + numButtons[index].getText().toString();
                        edit1.setText(num1);
                    } else if(edit2.isFocused() == true) {
                        num2 = edit2.getText().toString() + numButtons[index].getText().toString();
                        edit2.setText(num2);
                    }
                }
            });
        }

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                textResult.setText("계산 결과 : " + result.toString());
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                textResult.setText("계산 결과 : " + result.toString());
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                textResult.setText("계산 결과 : " + result.toString());
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                textResult.setText("계산 결과 : " + result.toString());
            }
        });

        btnRemain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) % Integer.parseInt(num2);
                textResult.setText("계산 결과 : " + result.toString());
            }
        });
        }
    }

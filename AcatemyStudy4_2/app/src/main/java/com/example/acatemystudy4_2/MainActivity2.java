package com.example.acatemystudy4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        String userId = intent.getStringExtra("userId");
        String userpassword = intent.getStringExtra("password");
        textView.append("\n"+"아이디 : " + userId + "\n");
        textView.append("비밀번호 : " + userpassword + "\n");
    }
}
package com.example.acatemystudy4_4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivityForResult(intent, 100);
            }
        });
    }

    /**
     *
     * @param requestCode - 현재 엑티비티에서 보낸 코드
     * @param resultCode - 화면 전환된 액티비티에서 전달한 코드
     * @param data - 화면 전환된 액티비티에서 전달한 인텐트
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    if(requestCode == 100){
        if(resultCode == 200){
            String message = data.getStringExtra("message");
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
    }
    }
}
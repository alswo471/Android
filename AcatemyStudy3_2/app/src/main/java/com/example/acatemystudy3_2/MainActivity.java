package com.example.acatemystudy3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    View view;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(R.id.view);
        textView = findViewById(R.id.textView);

        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {


                int action = motionEvent.getAction();
                float xpos = motionEvent.getX();
                float ypos = motionEvent.getY();

                switch (action) {
                    case MotionEvent.ACTION_DOWN:
                        appendLog("손가락 눌림 : " + xpos + "," + ypos);
                        break;
                    case MotionEvent.ACTION_UP:
                        appendLog("손가락 땜 : " + xpos + "," + ypos);
                        break;
                    case MotionEvent.ACTION_MOVE:
                        appendLog("손가락 움직임 : " + xpos + "," + ypos);

                }
                return true;
            }
        });
    }

    private void appendLog(String message) {
        textView.append(message + "\n");
    }
}
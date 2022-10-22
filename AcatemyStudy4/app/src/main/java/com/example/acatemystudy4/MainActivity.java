package com.example.acatemystudy4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    FrameLayout container;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        container = (FrameLayout) findViewById(R.id.container);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                inflater.inflate(R.layout.sub, container, true); // sub.xml - > 객체화(메모리 올라감)

              textView = container.findViewById(R.id.textView);
                RadioButton radioButton = container.findViewById(R.id.radioButton);
                RadioButton radioButton2 = container.findViewById(R.id.radioButton2);

                radioButton.setChecked(true);
                radioButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showSelection(view);

                    }
                });

                radioButton2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showSelection(view);
                    }
                });
            }
        });


    }

    private void showSelection(View view){
     String text = ((Button)view).getText().toString();
        textView.setText(text + "클릭!");
    }
}
package com.example.acatemystudy4_2;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButton;
    CheckBox checkBox;
    EditText editText;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        radioButton = findViewById(R.id.radioButton);
        /**
         * isChecked() - > 체크 되어 있는지
         * setChecked() - > 체크 상태로 변경
         * toggle() - > 체크 되어 있으면 해제 , 안되어 있으면 체크
         */

        radioButton.setChecked(true);

        checkBox = findViewById(R.id.checkBox);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String message = b ? "체크됨" : "체크 안됨";
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        });

        editText = findViewById(R.id.editText);
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                String text = editText.getText().toString();
                Log.i("TEXT", text);

                return false;
            }
        });
    }
}

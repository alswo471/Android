package com.example.date_time_reserved;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
//단계 : 변수 선언
    Chronometer chrono;
    Button btnStart, btnEnd;
    RadioButton rdoCal, rdoTime;
    CalendarView calView;
    TimePicker tPicker;
    TextView textResult;
    //냔 , 월 , 일을 보관할 변수
    int selectYear, selectMonth, selectDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("예약");

        //2단계 : id찾기

        chrono = (Chronometer) findViewById(R.id.chronometer1);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnEnd = (Button) findViewById(R.id.btnEnd);
        rdoCal = (RadioButton)findViewById(R.id.rdoCal);
        rdoTime = (RadioButton)findViewById(R.id.rdoTime);
        calView = (CalendarView) findViewById(R.id.calendarView1);
        tPicker = (TimePicker) findViewById(R.id.tPicker);
        textResult = (TextView) findViewById(R.id.textResult);

        tPicker.setVisibility(View.INVISIBLE);
        calView.setVisibility(View.INVISIBLE);

        rdoCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tPicker.setVisibility(View.INVISIBLE);
                calView.setVisibility(View.VISIBLE);
            }
        });

        rdoTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tPicker.setVisibility(View.VISIBLE);
                calView.setVisibility(View.INVISIBLE);
            }
        });

    //예약 시작
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.setBase(SystemClock.elapsedRealtime());
                chrono.start();
            }
        });
    //예약 중지 --> 크로노미 중지 와 선택한 결과 출력
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.stop();
                //결과
                textResult.setText(Integer.toString(selectYear) + "년"
                        + Integer.toString(selectMonth) + "월"
                        + Integer.toString(selectDay) + "일"
                        + Integer.toString(tPicker.getCurrentHour()) + "시");
            }
        });

        //달력에 날짜 변경했을 때 년, 월 추출
        calView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                selectYear = i; // 년
                selectMonth = i1 + 1; //월
                selectDay = i2; //일
            }
        });

    }
}
package com.santosh.eggtimerapp;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void buttonClicked(View view) {

        CountDownTimer countDownTimer = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {


 
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBarTimer = (SeekBar) findViewById(R.id.seekBarTimer);
        final TextView timerClock = (TextView) findViewById(R.id.timerClock);

        seekBarTimer.setMax(600);
        seekBarTimer.setProgress(30);

        seekBarTimer.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int minute = progress/60;
                int second = progress - (minute*60);

                String secondString = Integer.toString(second);

                if(secondString.equals("0")
                 ) {
                    secondString = "00";
                }

                timerClock.setText(Integer.toString(minute) + ":" + secondString);


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}

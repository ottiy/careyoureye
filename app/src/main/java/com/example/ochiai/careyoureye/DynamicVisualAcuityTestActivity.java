package com.example.ochiai.careyoureye;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class DynamicVisualAcuityTestActivity extends ActionBarActivity {

    int time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dynamic_visual_acuity_test);

    }

    public void start(View v) {
        Random a = new Random();

        Intent  EnterTheAnswer= new Intent(getApplicationContext(),DynamicVisualAcuityTestNumActivity.class);
        EnterTheAnswer.putExtra("NUM",a);

        Intent put =getIntent();
        int score = put.getIntExtra("SCORE");
        switch (score){
            case
        time = 100;
        }
        Timer timer = new Timer(true);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    public void run() {
                        time--;
                        if (0 == time){
                        }

                    }
                });
            }
        },0, 1);
    }
    private Handler handler = new Handler();


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_color_blindness, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

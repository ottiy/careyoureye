package com.example.ochiai.careyoureye;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.security.PublicKey;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //視力検査ボタン
    public void visionTest(View v){
        // インテントのインスタンス生成
        Intent intent = new Intent(this, VisionTestActivity.class);
        // 次画面のアクティビティ起動
        startActivity(intent);
    }

    //色盲ボタン
    /*public void colorBlindnessTest(View v){
        Intent intent = new Intent(this,ここに色盲検査アクティビティーの名前を記入.class);
        // 次画面のアクティビティ起動
        startActivity(intent);
    }

    //動体視力ボタン
    public void dynamicVisualAcuity(View v){
        Intent intent = new Intent(this,ここに動体視力のアクティビティー指定.class);
        // 次画面のアクティビティ起動
        startActivity(intent);
    }*/

    //周りの明るさボタン
    public void brightanceAround(View v){
        Intent intent = new Intent(this,BrightnessAroundActivity.class);
        startActivity(intent);
    }

    //記録ボタン
    /*   public void record(View v){
    Intent intent = new Intent(this,記録アクテビティー指定.class);
    startActivity(intent);
    }*/


    //スマホからの距離ボタン
    public void distanace(View v){
        Intent intent = new Intent(this,DistanceActivity.class);
        startActivity(intent);
    }

    //起動時間ボタン
    public void operatingTime(View v){
        Intent intent = new Intent(this,OperatingTimeActivity.class);
        startActivity(intent);
    }

    //ブルーライトカットボタン
    public void buleLightCut(View v){
        Intent intent = new Intent(this,BlueLightCutActivity.class);
        startActivity(intent);
    }

    /*public void sns(View v){
        //暗示的インテントでSNSを指定もしくはダイアログでSNSを選ぶ
    }*/

    public void trivia(View v){
        Intent intent = new Intent(this,TriviaActivity.class);
        startActivity(intent);
    }

    //ヘルプボタン
    /*public void help(View v){
        Intent intent = new Intent(this,ヘルプアクテビティを指定.class);
        startActivity(intent);
    }*/


    //これを作った人の自己紹介ボタン
    /*public void macker(View v){
    作った人のホームページを指定
    }*/




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

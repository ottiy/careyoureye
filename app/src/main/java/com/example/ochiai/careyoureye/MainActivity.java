package com.example.ochiai.careyoureye;

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
    public void visionTest(View v){
        // インテントのインスタンス生成
        Intent intent = new Intent(this, VisionTestActivity.class);
        // 次画面のアクティビティ起動
        startActivity(intent);
    }

    /*public void colorBlindnessTest(View v){
        // インテントのインスタンス生成
        Intent intent = new Intent(this,ここに色盲検査アクティビティーの名前を記入.class);
        // 次画面のアクティビティ起動
        startActivity(intent);
    }

    public void dynamicVisualAcuity(View v){
        // インテントのインスタンス生成
        Intent intent = new Intent(this,ここに動体視力のアクティビティー指定.class);
        // 次画面のアクティビティ起動
        startActivity(intent);
    }
*/
    public void brightanceAround(View v){
        // インテントのインスタンス生成
        Intent intent = new Intent(this,BrightnessAroundActivity.class);
        // 次画面のアクティビティ起動
        startActivity(intent);
    }


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

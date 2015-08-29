package com.example.ochiai.careyoureye;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class VisionTsetLevel09Activity extends ActionBarActivity {
    TextView level;
    TextView trueNumText;
    TextView falseNumText;

    int trueNum;
    int falseNum;
    double levelNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision_tset_level09);

        level = (TextView)findViewById(R.id.level);
        trueNumText = (TextView)findViewById(R.id.trueNumText);
        falseNumText = (TextView)findViewById(R.id.falseNumText);

        trueNum = 0;
        falseNum = 0;
    }

    public void trueButton(View v){
        trueNum=trueNum+1;
        level.setText("視力"+levelNum);
        trueNumText.setText(trueNum+"回");
        if (trueNum>=3){

            Intent intent = new Intent(this,VisionTsetLevel07Activity.class);
            startActivity(intent);

        }
    }

    public void falseButton(View v){
        falseNum=falseNum+1;
        falseNumText.setText(falseNum + "回");

        if (falseNum >= 2){

            //ダイアログボックスを表示
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("視力検査が終わりました");
            builder.show();
            builder.setTitle("あなたの視力は約0.9です。");

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_vision_tset_level09, menu);
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

package com.example.ochiai.careyoureye;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;


public class VisionTsetActivity extends ActionBarActivity {

    TextView level;
    TextView trueNumText;
    TextView falseNumText;
    ImageView randallRingImageView;
    int trueNum;
    int falseNum;
    double lingsSize;
    double levelNum;
    int[] rundleRing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision_tset);

        level = (TextView)findViewById(R.id.level);
        trueNumText = (TextView)findViewById(R.id.trueNumText);
        falseNumText = (TextView)findViewById(R.id.falseNumText);
        randallRingImageView= (ImageView)findViewById(R.id.randallRing);
        trueNum = 0;
        falseNum = 0;
        lingsSize = 0;
        levelNum = 0.1;
        rundleRing = new int[5];

    }

    public void trueButton(View v){

        trueNum=trueNum+1;
        level.setText("視力"+levelNum);
        trueNumText.setText(trueNum+"回");
        if (trueNum>=2){
            levelNum=levelNum+0.1;
            lingsSize=7.5/levelNum;
            //randallRingImageView.setLayoutParams(new FrameLayout.LayoutParams(lingsSize, lingsSize));
            trueNum=0;falseNum=0;//正解数と不正解数をリセット
        }

    }

    public void falseButton(View v){
        falseNum=falseNum+1;
        falseNumText.setText(falseNum+"回");


        if (falseNum >= 2){
            //ダイアログボックスを表示
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("視力検査を終了しますか？");
            builder.show();
            builder.setTitle("あなたの視力は" + levelNum + "です。");
            DialogInterface.OnClickListener listener = 
                    new DialogInterface.OnClickListener(){
                        @Override
                    public void onClick(DialogInterface dialog, int which){
                         String msg ="";
                            switch (which){
                                case DialogInterface.BUTTON_POSITIVE:
                                    msg ="もう一回する";
                                    //Intent intentPo = new Intent(this..class);
                                    //startActivity(intentPo);
                                    break;
                                case DialogInterface.BUTTON_NEGATIVE:
                                    msg = "視力検査をやめる";
                                    //Intenthis.sionTsetActivity.class));
                                    //startActivity(intentNe);
                                    break;

                            }
                        }
                    };

        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_vision_tset, menu);
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

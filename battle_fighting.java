package com.example.jyxem.myapplication;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import java.util.Random;


public class battle_fighting extends AppCompatActivity {

    static  int A;
    static  int B;


    boolean RUN_THREAD = true;
    Thread ocrThread;

    ProgressBar pb;
    ProgressBar pbAuto;
    private boolean isRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_fighting);


        //A=RED
        //B=BLUE
        //C=YELLOW
        //D=GREEN
        //E=ORANGE
        //F=PURPLE


        //pb = (ProgressBar) findViewById(R.id.progressBar);
        pbAuto = (ProgressBar) findViewById(R.id.progressbar);
        setProgressBarVisibility(true);
        //＝＝＝＝持續移動進度條 ＳＴＡＲＴ＝＝＝＝
        // 設定Handler類別
        final Handler handler = new Handler();
        // 次要顯示處理程式
        final Runnable callback1 = new Runnable() {
            @Override
            public void run() {
                pbAuto.incrementSecondaryProgressBy(1);
                setSecondaryProgress(pbAuto.getSecondaryProgress() * 600);
            }
        };
        final Runnable callback2 = new Runnable() {
            @Override
            public void run() {
                pbAuto.incrementProgressBy(1);
                setProgress(pbAuto.getProgress() * 600);
            }
        };


        ocrThread = new Thread() {

            @Override
            public void run() {
                // 讓進度條不斷自動跑

                try {
                    while (true) {


                        // 進度條滿

                        if (pbAuto.getProgress() == pbAuto.getMax()) {

                            over();
                            //onDestroy();
                            //Message message=new Message();
                            //message.what=1;
                            //handler.sendMessage(message);//發送消息



                            /*setContentView(R.layout.rs);
                            Button button2 = (Button) findViewById(R.id.button_rs);
                            button2.setOnClickListener(new Button.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    setContentView(R.layout.content_battle_fighting);
                                    Intent intent = new Intent();
                                    battle_fighting.this.finish();
                                    startActivity(intent);

                                }
                            });*/

                        }
                        // 先跑SecondaryProgress
                        handler.post(callback1);
                        // 休息200 milliseconds
                        Thread.sleep(200);
                        // 在跑Progress
                        handler.post(callback2);
                        // 休息200 milliseconds
                        Thread.sleep(200);

                    }

                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }


            private Handler handler =  new Handler(){

                @Override
                public void handleMessage(Message msg) {
                    // TODO Auto-generated method stub
                    super.handleMessage(msg);

                    TextView myTextView0 = (TextView)findViewById(R.id.textView7);
                    myTextView0.setText("FAIL");

                    onDestroy();

                    //over();

                    /*Count_i--;

                    if (Count_i<=0)
                    {
                        TextView myTextView0 = (TextView)findViewById(R.id.textView7);
                        myTextView0.setText("A0");
                    }else {
                        ocrThread.start();
                    }*/
                }
            };

        };
        ocrThread.start();

        random_gemerator();


}


    private void destorythread(){
        RUN_THREAD = false;
        if(ocrThread != null){
            if(!ocrThread.isInterrupted()) {
                ocrThread.interrupt();
            }
        }
        ocrThread = null;
    }

    public void random_gemerator(){

        int color=(int)(Math.random()* 6);
        if(color==0)  {
            colorA();
        }if(color==1) {
            colorB();
        }if(color==2) {
            colorC();
        }if(color==3) {
            colorD();
        }if(color==4) {
            colorE();
        }if(color==5) {
            colorF();
        }

    }
    public void colorA(){
        int number=(int)(Math.random()* 5);
        A=0;//red
        ImageView imageView;
        imageView = (ImageView) findViewById(R.id.imageView9);


        if(number==0){
            imageView.setImageResource(R.drawable.red1);
            button_match();
        }if(number==1) {
            imageView.setImageResource(R.drawable.red2);
            button_match();
        }if(number==2) {
            imageView.setImageResource(R.drawable.red3);
            button_match();
        }if(number==3) {
            imageView.setImageResource(R.drawable.red4);
            button_match();
        }if(number==4) {
            imageView.setImageResource(R.drawable.red5);
            button_match();
        }if(number==5) {
            imageView.setImageResource(R.drawable.red6);
            button_match();
        }
    }
    public void colorB(){
        int number=(int)(Math.random()* 5);
        A=1;
        ImageView imageView;
        imageView = (ImageView) findViewById(R.id.imageView9);


        if(number==0){
            imageView.setImageResource(R.drawable.blue6);
            button_match();
        }if(number==1) {
            imageView.setImageResource(R.drawable.blue1);
            button_match();
        }if(number==2) {
            imageView.setImageResource(R.drawable.blue2);
            button_match();
        }if(number==3) {
            imageView.setImageResource(R.drawable.blue3);
            button_match();
        }if(number==4) {
            imageView.setImageResource(R.drawable.blue4);
            button_match();
        }if(number==5) {
            imageView.setImageResource(R.drawable.blue5);
            button_match();
        }
    }
    public void colorC(){
        int number=(int)(Math.random()* 5);
        A=2;
        ImageView imageView;
        imageView = (ImageView) findViewById(R.id.imageView9);


        if(number==0){
            imageView.setImageResource(R.drawable.yellow6);
            button_match();
        }if(number==1) {
            imageView.setImageResource(R.drawable.yellow1);
            button_match();
        }if(number==2) {
            imageView.setImageResource(R.drawable.yellow2);
            button_match();
        }if(number==3) {
            imageView.setImageResource(R.drawable.yellow3);
            button_match();
        }if(number==4) {
            imageView.setImageResource(R.drawable.yellow4);
            button_match();
        }if(number==5) {
            imageView.setImageResource(R.drawable.yellow5);
            button_match();
        }
    }
    public void colorD(){
        int number=(int)(Math.random()* 5);
        A=3;
        ImageView imageView;
        imageView = (ImageView) findViewById(R.id.imageView9);


        if(number==0){
            imageView.setImageResource(R.drawable.green7);
            button_match();
        }if(number==1) {
            imageView.setImageResource(R.drawable.green1);
            button_match();
        }if(number==2) {
            imageView.setImageResource(R.drawable.green2);
            button_match();
        }if(number==3) {
            imageView.setImageResource(R.drawable.green3);
            button_match();
        }if(number==4) {
            imageView.setImageResource(R.drawable.green4);
            button_match();
        }if(number==5) {
            imageView.setImageResource(R.drawable.green5);
            button_match();
        }
    }
    public void colorE(){
        int number=(int)(Math.random()* 5);
        A=4;
        ImageView imageView;
        imageView = (ImageView) findViewById(R.id.imageView9);


        if(number==0){
            imageView.setImageResource(R.drawable.orange6);
            button_match();
        }if(number==1) {
            imageView.setImageResource(R.drawable.orange1);
            button_match();
        }if(number==2) {
            imageView.setImageResource(R.drawable.orange2);
            button_match();
        }if(number==3) {
            imageView.setImageResource(R.drawable.orange3);
            button_match();
        }if(number==4) {
            imageView.setImageResource(R.drawable.orange4);
            button_match();
        }if(number==5) {
            imageView.setImageResource(R.drawable.orange5);
            button_match();
        }
    }
    public void colorF(){
        int number=(int)(Math.random()* 5);
        A=5;
        ImageView imageView;
        imageView = (ImageView) findViewById(R.id.imageView9);


        if(number==0){
            imageView.setImageResource(R.drawable.purple6);
            button_match();
        }if(number==1) {
            imageView.setImageResource(R.drawable.purple1);
            button_match();
        }if(number==2) {
            imageView.setImageResource(R.drawable.purple2);
            button_match();
        }if(number==3) {
            imageView.setImageResource(R.drawable.purple3);
            button_match();
        }if(number==4) {
            imageView.setImageResource(R.drawable.purple4);
            button_match();
        }if(number==5) {
            imageView.setImageResource(R.drawable.purple5);
            button_match();
        }
    }
    public void button_match(){

        int number=(int)(Math.random()* 5);
        if(number==0){
            MediaPlayer mediaPlayer = MediaPlayer.create(battle_fighting.this,R.raw.red);
            mediaPlayer.start();
        }if(number==1) {
            MediaPlayer mediaPlayer = MediaPlayer.create(battle_fighting.this,R.raw.blue);
            mediaPlayer.start();
            button_match();
        }if(number==2) {
            MediaPlayer mediaPlayer = MediaPlayer.create(battle_fighting.this,R.raw.yellow);
            mediaPlayer.start();
        }if(number==3) {
            MediaPlayer mediaPlayer = MediaPlayer.create(battle_fighting.this,R.raw.green);
            mediaPlayer.start();
        }if(number==4) {
            MediaPlayer mediaPlayer = MediaPlayer.create(battle_fighting.this,R.raw.orange);
            mediaPlayer.start();
        }if(number==5) {
            MediaPlayer mediaPlayer = MediaPlayer.create(battle_fighting.this,R.raw.purple);
            mediaPlayer.start();
        }

        Button buttonA = (Button) findViewById(R.id.button4);
        buttonA.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                B=0;
                AB();
            }

        });

        Button buttonB = (Button) findViewById(R.id.button5);
        buttonB.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                B=1;
                AB();
            }

        });

        Button buttonC = (Button) findViewById(R.id.button6);
        buttonC.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                B=2;
                AB();
            }

        });

        Button buttonD = (Button) findViewById(R.id.button7);
        buttonD.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                B=3;
                AB();
            }

        });

        Button buttonE = (Button) findViewById(R.id.button8);
        buttonE.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                B=4;
                AB();
            }

        });

        Button buttonF = (Button) findViewById(R.id.button9);
        buttonF.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                B=5;
                AB();
            }

        });

    }
    public void AB(){
        pbAuto.incrementSecondaryProgressBy(-400);
        pbAuto.incrementProgressBy(-400);
        if(B==A){
            random_gemerator();
        }else {

            over();

        }

    }
    public void over(){

        destorythread();

        //setContentView(R.layout.content_main2);
        Intent intent = new Intent();
        intent.setClass(battle_fighting.this,Main2Activity.class);
        startActivity(intent);
        battle_fighting.this.finish();



    }



            public enum Days {

                A,
                B,
                C,
                D,
                E,
                F,
                G
            }

        }

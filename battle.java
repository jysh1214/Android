package com.example.jyxem.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.os.Handler;

public class battle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);


        Button button2 = (Button) findViewById(R.id.button_start_speak);
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {setContentView(R.layout.battle1);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        speak1();
                    }
                }, 2000);
            }
        });
    }

    public void speak1(){
        try{
            Thread.sleep(2000);
            setContentView(R.layout.battle2);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        speak2();
    }
    public void speak2(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                speak3();
            }
        }, 2000);
    }
    public void speak3(){
        try{
            Thread.sleep(2000);
            setContentView(R.layout.battle3);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        speak4();
    }
    public void speak4(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                speak5();
            }
        }, 2000);
    }
    public void speak5(){
        try{
            Thread.sleep(2000);
            setContentView(R.layout.battle4);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        speak6();
    }
    public void speak6(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                speak7();
            }
        }, 2000);
    }
    public void speak7(){
        try{
            Thread.sleep(2000);
            setContentView(R.layout.battle6);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        speak8();
    }
    public void speak8(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                speak9();
            }
        }, 2000);
    }
    public void speak9(){
        try{
            Thread.sleep(2000);
            setContentView(R.layout.space1);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        speak10();
    }
    public void speak10(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                speak11();
            }
        }, 2000);
    }
    public void speak11(){
        try{
            Thread.sleep(2000);
            setContentView(R.layout.content_battle_fighting);
            Intent intent = new Intent();
            intent.setClass(battle.this, battle_fighting.class);
            startActivity(intent);
            battle.this.finish();
           } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

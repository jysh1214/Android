package com.example.jyxem.rs;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                jumpTors();
            }
        });

    }

    public void jumpTors(){

        setContentView(R.layout.rs);

        Button button02= (Button)findViewById(R.id.button2);

        button02.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v) {

                jumpToLayout1();

            }

        });

    }

    public void jumpToLayout1(){

        setContentView(R.layout.activity_main);

        Button button01 = (Button)findViewById(R.id.button);

        button01.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v) {

                jumpTors();

            }

        });

    }
    
}

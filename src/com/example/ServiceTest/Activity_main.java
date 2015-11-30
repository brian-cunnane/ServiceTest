package com.example.ServiceTest;

import android.app.Activity;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by brian on 30/11/2015.
 */
public class Activity_main extends Activity{
    Button startButton;
    Button endButton;
    EditText info;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        startButton = (Button)findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                Intent intent = new Intent(context, randomNumberService.class);
                context.startService(intent);
                Toast.makeText(getApplicationContext(),"Starting service.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
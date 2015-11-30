package com.example.ServiceTest;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by brian on 30/11/2015.
 */
public class randomNumberService extends Service {
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        Context context = getApplicationContext();
        Toast.makeText(context,"Generating Numbers",Toast.LENGTH_LONG).show();
        int[] array = new int[5];
        for(int i = 0; i < 5; i ++){
            array[i] = randomNumber();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("values",array);
        intent.putExtras(bundle);
        sendBroadcast(intent);
        return Service.START_NOT_STICKY;
    }
    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }

    public int randomNumber(){
        Random rand = new Random();
        int number = rand.nextInt(100);
        return number;
    }
}

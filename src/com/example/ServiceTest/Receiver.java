package com.example.ServiceTest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by brian on 30/11/2015.
 */
public class Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"received broadcast, doing something",Toast.LENGTH_LONG).show();
        int[] values = intent.getIntArrayExtra("values");
        if (values != null){
            Toast.makeText(context,"Got something",Toast.LENGTH_LONG).show();
        }

    }
}

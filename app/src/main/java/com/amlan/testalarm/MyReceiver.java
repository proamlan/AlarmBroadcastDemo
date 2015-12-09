package com.amlan.testalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        if (intent != null && intent.getAction().equals(Utils.ACTION)) {

            String receivedData = intent.getExtras().getString("test");

            Log.d("amlan", "received something" + receivedData);

            Toast.makeText(context, "hey Buddy!!! You send me " + receivedData, Toast.LENGTH_LONG).show();
        }
//        throw new UnsupportedOperationException("Not yet implemented");
    }
}

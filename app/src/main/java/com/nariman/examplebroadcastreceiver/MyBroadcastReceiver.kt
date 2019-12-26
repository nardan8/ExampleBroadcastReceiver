package com.nariman.examplebroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        StringBuilder().apply {
            append("Action: ${intent.action}\n")
            append("URI: ${intent.getBooleanExtra("state", false).toString()}")
            toString().also {
                Log.i("mybroadcast", it)
                Toast.makeText(context, it, Toast.LENGTH_LONG).show()
            }
        }
    }
}

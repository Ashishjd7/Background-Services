package com.example.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyServices extends Service //in service we can manually start and stop
{

    //we extend the service class & over ride the method onBind
    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        String name = intent.getExtras().getString("name");
        Toast.makeText(this,"Service Starts " +name,Toast.LENGTH_SHORT).show();
       //return super.onStartCommand(intent, flags, startId);
     //   return START_STICKY;
        return START_REDELIVER_INTENT; //will restart the service & redeliver the data in intent
    }

    @Override
    public void onDestroy()
    {
        Toast.makeText(this,"Service Destroyed",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}

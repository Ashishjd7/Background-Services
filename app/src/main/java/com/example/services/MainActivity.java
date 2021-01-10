package com.example.services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//Arpit gupta
//Ashish Dhull
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view)
    {
      //intent is use to communicate to other components
        Intent i = new Intent(this,MyServices.class);
        i.putExtra("name","ASHISH DHULL");
        startService(i);
    }

    public void stop(View view)
    {
        Intent i = new Intent(this,MyServices.class);
        stopService(i);
    }
}

package com.surya.iterableapptest;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.iterable.iterableapi.IterableApi;
import com.iterable.iterableapi.IterableConfig;

public class CustomInitialization extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Iterable", "Application onCreate: Initializing ");
        //Toast.makeText(this, "reached application initialization",Toast.LENGTH_LONG).show();
        //initialize sdk with email
        IterableConfig config = new IterableConfig.Builder().build();
        IterableApi.initialize(this, "349dcc9373c74c6699c5d1204a271695", config);

        IterableApi.getInstance().setEmail("surya950302@gmail.com");
        IterableApi.getInstance().registerForPush();
        Log.d("Iterable", "Application onCreate: Initialized ");
    }


}

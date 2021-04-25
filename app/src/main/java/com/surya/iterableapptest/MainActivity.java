package com.surya.iterableapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.iterable.iterableapi.IterableAction;
import com.iterable.iterableapi.IterableApi;
import com.iterable.iterableapi.IterableConfig;
import com.iterable.iterableapi.IterableInAppManager;
import com.iterable.iterableapi.IterableInAppMessage;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting up in-app manager to get and show messages
        IterableInAppManager manager = IterableApi.getInstance().getInAppManager();
        List<IterableInAppMessage> messages= manager.getMessages();

        // looping through messages to show them.
        for(IterableInAppMessage message : messages){
            manager.showMessage(message);
            manager.setRead(message,false);
        }

    }

    public void onClickButton1(View view) {

        JSONObject datafields = new JSONObject();

        try {
            datafields.put("firstName", "Suryanarayan");
            datafields.put("isRegisteredUser", true);
            datafields.put("SA_User_Test_Key", "completed");

        } catch (JSONException e) {
            Log.d("Iterable", "onClickButton1: JSON Exception ");
            e.printStackTrace();
        }
        IterableApi.getInstance().updateUser(datafields);
        Log.d("Iterable", "onClickButton1: data sent ");
        Toast.makeText(this,"Data updated",Toast.LENGTH_SHORT).show();
    }
    public void onClickButton2(View view) {
        JSONObject datafields = new JSONObject();
        String eventName = "mobileSATestEvent";
        try {
            datafields.put("platform", "Android");
            datafields.put("isTestEvent", true);
            datafields.put("url", "https://iterable.com/sa-test/Suryanarayan");
            datafields.put("secret_code_key","Code_123");

        } catch (JSONException e) {
            Log.d("Iterable", "onClickButton1: JSON Exception ");
            e.printStackTrace();
        }
        IterableApi.getInstance().track(eventName,datafields);
    }
}
package com.appscraftbd.ntechlocaljson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Localjson localjson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        localjson = new Localjson();
        String json = localjson.loadJSONFromAsset(this,"");


    }
}
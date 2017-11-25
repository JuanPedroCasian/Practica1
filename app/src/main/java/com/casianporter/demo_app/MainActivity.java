package com.casianporter.demo_app;

import android.support.v7.app.AppCompatActivity; // Makes the app compatible with other versions of android
import android.os.Bundle; // operating system bundle = what lets you operate in android

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

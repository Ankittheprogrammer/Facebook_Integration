package com.example.facebook_integration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment f = new MainFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.maincontext,f).addToBackStack(null).commit();
    }
}

package com.example.pip_robot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CommandsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commands);
        getSupportActionBar().hide();
    }
}
package com.example.pip_robot;

import androidx.appcompat.app.AppCompatActivity;

import java.net.*;
import java.io.*;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class ConnectActivity extends AppCompatActivity {

    static String IP = null;
    static int PORT = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);
        getSupportActionBar().hide();

        Button connect = (Button)findViewById(R.id.connect);
        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.println(Log.INFO,"aaa", GetIp());
                IP=GetIp();
                PORT= GetPort();
            }
        });
    }

    public String GetIp() {
        EditText ip = (EditText) findViewById(R.id.ipid);
        String message = ip.getText().toString();
        return message;
    }

    public int GetPort() {
        EditText ip = (EditText) findViewById(R.id.portid);
        String message = ip.getText().toString();
        return Integer.parseInt(message);
    }

}
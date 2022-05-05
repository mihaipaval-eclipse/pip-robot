package com.example.pip_robot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import java.net.*;
import java.io.*;

public class ControlsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controls);
        getSupportActionBar().hide();

        Button art1 = (Button)findViewById(R.id.art1);
        art1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { replaceFragment(new art1fragment());

                doInBackground();

            }
        });
        Button art2 = (Button)findViewById(R.id.art2);
        art2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { replaceFragment(new art2fragment()); }
        });
        Button art3 = (Button)findViewById(R.id.art3);
        art3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { replaceFragment(new art3fragment()); }
        });
        Button art4 = (Button)findViewById(R.id.art4);
        art4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { replaceFragment(new art4fragment()); }
        });
        Button art5 = (Button)findViewById(R.id.art5);
        art5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { replaceFragment(new art5fragment()); }
        });
    }
    private void replaceFragment(Fragment fragment) {
        FragmentManager fg = getSupportFragmentManager();
        FragmentTransaction ft = fg.beginTransaction();
        ft.replace(R.id.flFragment, fragment);
        ft.commit();
    }

    protected String doInBackground(String... data)
    {
        // establish a connection
        try {

            Socket socket = new Socket("192.168.0.112", 30002); //Server IP and PORT

            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            printWriter.write("set_digital_out(0,True )"+"\n"); // Send Data
            printWriter.flush();

            socket.close();
            printWriter.close();

        }
        catch(UnknownHostException e){
            System.err.println("Don't know about host: ");
        }catch (IOException e){
            System.err.println("Couldn't get I/O for the connection to: ");
        }

        return null;
    }
}
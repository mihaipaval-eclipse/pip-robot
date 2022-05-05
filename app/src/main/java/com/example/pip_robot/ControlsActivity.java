package com.example.pip_robot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.tabs.TabItem;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ControlsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controls);
        getSupportActionBar().hide();

        Button art1 = (Button)findViewById(R.id.art1);
        art1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new art1fragment());
                Client(ConnectActivity.IP, ConnectActivity.PORT);
                Log.println(Log.INFO,"test", "IP: " + ConnectActivity.IP + " & PORT: " + ConnectActivity.PORT);
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
    public void Client(String address, int port){
        Socket socket = null;
        PrintWriter out = null;
        try {
            socket = new Socket(InetAddress.getByName(address), port);
            Log.println(Log.INFO,"c_s", "Connected");
            out = new PrintWriter(socket.getOutputStream(),true);
        } catch(UnknownHostException e){
            Log.println(Log.INFO,"c_uhe", "Don't know about host: " + address);
        } catch (IOException e){
            Log.println(Log.INFO,"c_e", "Couldn't get I/O for the connection to: " + address);
        }
        if (socket == null || out == null) {
            Log.println(Log.INFO,"c_e_s", "Something is wrong. One variable is null.");
            return;
        }

        out.write("set_digital_out(0,True)"+"\n");
        out.flush();

        // close the connection

        out.close();
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean verificam_inchidere_conexiune = socket.isClosed();
        Log.println(Log.INFO,"verificare", "Socket closed: "+ verificam_inchidere_conexiune);
    }
}
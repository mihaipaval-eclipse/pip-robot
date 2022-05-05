package com.example.pip_robot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

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
                IP = GetIP();
                PORT = GetPort();
                Client(IP, PORT);
            }
        });
    }
    public String GetIP() {
        EditText ipBox = (EditText) findViewById(R.id.ipBox);
        return ipBox.getText().toString();
    }
    public int GetPort() {
        EditText portBox = (EditText) findViewById(R.id.portBox);
        return Integer.parseInt(portBox.getText().toString());
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
package com.example.pip_robot;

import android.os.AsyncTask;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class CommandSender extends AsyncTask<String,Void,Void> {

    Socket socket;
    PrintWriter printWriter;
    @Override
    protected Void doInBackground(String... data)
    {
        // establish a connection
        String command = data[0];
        try {

            socket = new Socket("192.168.0.112", 30002); //Server IP and PORT
            printWriter = new PrintWriter(socket.getOutputStream());

            printWriter.write(command+"\n"); // Send Data
            printWriter.flush();

            printWriter.close();
            socket.close();
        }
        catch(UnknownHostException e){
            System.err.println("Don't know about host: ");
        }catch (IOException e){
            System.err.println("Couldn't get I/O for the connection to: ");
        }

        return null;
    }
}

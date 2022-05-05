package com.example.pip_robot;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class art1fragment extends Fragment {
    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_art1fragment, container, false);
        ImageButton up_button = (ImageButton) v.findViewById(R.id.up_button);
        up_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String command = "set_digital_out(0,True)";
                ConnectActivity.Client(ConnectActivity.IP, ConnectActivity.PORT, command);
            }
        });
        return v;
    }
}
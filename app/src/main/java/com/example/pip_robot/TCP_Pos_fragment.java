package com.example.pip_robot;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class TCP_Pos_fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_t_c_p__pos_fragment, container, false);
        ImageButton tcp_pos_up = (ImageButton)v.findViewById(R.id.tcp_pos_up);
        ImageButton tcp_pos_left_45 = (ImageButton)v.findViewById(R.id.tcp_pos_left_45);
        ImageButton tcp_pos_right_45 = (ImageButton)v.findViewById(R.id.tcp_pos_right_45);
        ImageButton tcp_pos_down = (ImageButton)v.findViewById(R.id.tcp_pos_down);
        ImageButton tcp_pos_down_45 = (ImageButton)v.findViewById(R.id.tcp_pos_down_45);
        ImageButton tcp_pos_up_45 = (ImageButton)v.findViewById(R.id.tcp_pos_up_45);
        tcp_pos_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommandSender cs = new CommandSender();
                cs.execute("set_digital_out(1,True )");
            }
        });
        tcp_pos_left_45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommandSender cs = new CommandSender();
                cs.execute("set_digital_out(1,True )");
            }
        });
        tcp_pos_right_45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommandSender cs = new CommandSender();
                cs.execute("set_digital_out(1,True )");
            }
        });
        tcp_pos_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommandSender cs = new CommandSender();
                cs.execute("set_digital_out(1,True )");
            }
        });
        tcp_pos_down_45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommandSender cs = new CommandSender();
                cs.execute("set_digital_out(1,True )");
            }
        });
        tcp_pos_up_45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommandSender cs = new CommandSender();
                cs.execute("set_digital_out(1,True )");
            }
        });
        return v;
    }
}
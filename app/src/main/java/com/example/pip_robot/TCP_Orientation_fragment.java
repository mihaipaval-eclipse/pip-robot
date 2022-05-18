package com.example.pip_robot;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class TCP_Orientation_fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_t_c_p__orientation_fragment, container, false);

        ImageButton tcp_or_up = (ImageButton)v.findViewById(R.id.tcp_or_up);
        ImageButton tcp_or_down = (ImageButton)v.findViewById(R.id.tcp_or_down);
        ImageButton tcp_or_left = (ImageButton)v.findViewById(R.id.tcp_or_left);
        ImageButton tcp_or_right = (ImageButton)v.findViewById(R.id.tcp_or_right);
        ImageButton tcp_or_curved_right = (ImageButton)v.findViewById(R.id.tcp_or_curved_right);
        ImageButton tcp_or_curved_left = (ImageButton)v.findViewById(R.id.tcp_or_curved_left);

        tcp_or_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommandSender cs = new CommandSender();
                cs.execute("movel(pose_trans(get_forward_kin(), PickPos),a=0.3, v=0.25)");
            }
        });
        tcp_or_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommandSender cs = new CommandSender();
                cs.execute("set_digital_out(1,False )");
            }
        });
        tcp_or_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommandSender cs = new CommandSender();
                cs.execute("set_digital_out(1,True )");
            }
        });
        tcp_or_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommandSender cs = new CommandSender();
                cs.execute("set_digital_out(1,True )");
            }
        });
        tcp_or_curved_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommandSender cs = new CommandSender();
                cs.execute("set_digital_out(1,True )");
            }
        });
        tcp_or_curved_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommandSender cs = new CommandSender();
                cs.execute("set_digital_out(1,True )");
            }
        });
        return v;
    }
}
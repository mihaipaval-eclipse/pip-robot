package com.example.pip_robot;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;

public class Joint_Pos_fragment extends Fragment {
    EditText et1, et2, et3, et4, et5, et6;
    ProgressBar pb1, pb2, pb3, pb4, pb5, pb6;
    ImageButton ib1, ib2, ib3, ib4, ib5, ib6, ib7, ib8, ib9, ib10, ib11, ib12;
    Button jointhome, poshome, orhome;
    @SuppressLint("CutPasteId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_joint__pos_fragment, container, false);
        et1 = (EditText) v.findViewById(R.id.nD1);
        et2 = (EditText) v.findViewById(R.id.nD2);
        et3 = (EditText) v.findViewById(R.id.nD3);
        et4 = (EditText) v.findViewById(R.id.nD4);
        et5 = (EditText) v.findViewById(R.id.nD5);
        et6 = (EditText) v.findViewById(R.id.nD6);
        pb1 = (ProgressBar) v.findViewById(R.id.pB1);
        pb2 = (ProgressBar) v.findViewById(R.id.pB2);
        pb3 = (ProgressBar) v.findViewById(R.id.pB3);
        pb4 = (ProgressBar) v.findViewById(R.id.pB4);
        pb5 = (ProgressBar) v.findViewById(R.id.pB5);
        pb6 = (ProgressBar) v.findViewById(R.id.pB6);
        ib1 = (ImageButton) v.findViewById(R.id.base_left);
        ib2 = (ImageButton) v.findViewById(R.id.base_right);
        ib3 = (ImageButton) v.findViewById(R.id.shoulder_left);
        ib4 = (ImageButton) v.findViewById(R.id.shoulder_right);
        ib5 = (ImageButton) v.findViewById(R.id.elbow_left);
        ib6 = (ImageButton) v.findViewById(R.id.elbow_right);
        ib7 = (ImageButton) v.findViewById(R.id.wrist1_left);
        ib8 = (ImageButton) v.findViewById(R.id.wrist1_right);
        ib9 = (ImageButton) v.findViewById(R.id.wrist2_left);
        ib10 = (ImageButton) v.findViewById(R.id.wrist2_right);
        ib11 = (ImageButton) v.findViewById(R.id.wrist3_left);
        ib12 = (ImageButton) v.findViewById(R.id.wrist3_right);

        jointhome = (Button) v.findViewById(R.id.joint_home);
        poshome = (Button) v.findViewById(R.id.pos_home);
        orhome = (Button) v.findViewById(R.id.or_home);

        et1.setText(String.valueOf(pb1.getProgress()));
        et2.setText(String.valueOf(pb2.getProgress()));
        et3.setText(String.valueOf(pb3.getProgress()));
        et4.setText(String.valueOf(pb4.getProgress()));
        et5.setText(String.valueOf(pb5.getProgress()));
        et6.setText(String.valueOf(pb6.getProgress()));

        jointhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb1.setProgress(pb1.getMin());
                et1.setText(String.valueOf(pb1.getProgress()));
                pb2.setProgress(pb2.getMin());
                et2.setText(String.valueOf(pb2.getProgress()));
                pb3.setProgress(pb3.getMin());
                et3.setText(String.valueOf(pb3.getProgress()));
                pb4.setProgress(pb4.getMin());
                et4.setText(String.valueOf(pb4.getProgress()));
                pb5.setProgress(pb5.getMin());
                et5.setText(String.valueOf(pb5.getProgress()));
                pb6.setProgress(pb6.getMin());
                et6.setText(String.valueOf(pb6.getProgress()));
            }
        });

        int pas = 1;
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb1.setProgress(pb1.getProgress() - pas);
                et1.setText(String.valueOf(pb1.getProgress()));
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb1.setProgress(pb1.getProgress() + pas);
                et1.setText(String.valueOf(pb1.getProgress()));
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb2.setProgress(pb2.getProgress() - pas);
                et2.setText(String.valueOf(pb2.getProgress()));
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb2.setProgress(pb2.getProgress() + pas);
                et2.setText(String.valueOf(pb2.getProgress()));
            }
        });
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb3.setProgress(pb3.getProgress() - pas);
                et3.setText(String.valueOf(pb3.getProgress()));
            }
        });
        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb3.setProgress(pb3.getProgress() + pas);
                et3.setText(String.valueOf(pb3.getProgress()));
            }
        });
        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb4.setProgress(pb4.getProgress() - pas);
                et4.setText(String.valueOf(pb4.getProgress()));
            }
        });
        ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb4.setProgress(pb4.getProgress() + pas);
                et4.setText(String.valueOf(pb4.getProgress()));
            }
        });
        ib9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb5.setProgress(pb5.getProgress() - pas);
                et5.setText(String.valueOf(pb5.getProgress()));
            }
        });
        ib10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb5.setProgress(pb5.getProgress() + pas);
                et5.setText(String.valueOf(pb5.getProgress()));
            }
        });
        ib11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb6.setProgress(pb6.getProgress() - pas);
                et6.setText(String.valueOf(pb6.getProgress()));
            }
        });
        ib12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb6.setProgress(pb6.getProgress() + pas);
                et6.setText(String.valueOf(pb6.getProgress()));
            }
        });
        et1.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if (keyCode == KeyEvent.KEYCODE_ENTER) {
                    // Perform action on key press
                    pb1.setProgress(Integer.parseInt(et1.getText().toString()));
                    return true;
                }
                return false;
            }
        });
        et1.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if (keyCode == KeyEvent.KEYCODE_ENTER) {
                    // Perform action on key press
                    pb1.setProgress(Integer.parseInt(et1.getText().toString()));
                    return true;
                }
                return false;
            }
        });
        et2.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if (keyCode == KeyEvent.KEYCODE_ENTER) {
                    // Perform action on key press
                    pb2.setProgress(Integer.parseInt(et2.getText().toString()));
                    return true;
                }
                return false;
            }
        });
        et3.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if (keyCode == KeyEvent.KEYCODE_ENTER) {
                    // Perform action on key press
                    pb3.setProgress(Integer.parseInt(et3.getText().toString()));
                    return true;
                }
                return false;
            }
        });
        et4.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if (keyCode == KeyEvent.KEYCODE_ENTER) {
                    // Perform action on key press
                    pb4.setProgress(Integer.parseInt(et4.getText().toString()));
                    return true;
                }
                return false;
            }
        });
        et5.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if (keyCode == KeyEvent.KEYCODE_ENTER) {
                    // Perform action on key press
                    pb5.setProgress(Integer.parseInt(et5.getText().toString()));
                    return true;
                }
                return false;
            }
        });
        et6.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if (keyCode == KeyEvent.KEYCODE_ENTER) {
                    // Perform action on key press
                    pb6.setProgress(Integer.parseInt(et6.getText().toString()));
                    return true;
                }
                return false;
            }
        });
        return v;
    }
}
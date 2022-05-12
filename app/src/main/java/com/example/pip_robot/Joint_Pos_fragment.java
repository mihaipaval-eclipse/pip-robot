package com.example.pip_robot;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;

public class Joint_Pos_fragment extends Fragment {
    EditText et1, et2, et3, et4, et5, et6;
    ProgressBar pb1, pb2, pb3, pb4, pb5, pb6;
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
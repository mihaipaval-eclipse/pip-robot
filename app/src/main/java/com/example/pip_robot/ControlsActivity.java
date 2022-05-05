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
}
package com.example.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.listviewexample.ui.customadapter.CustomAdapterFragment;

public class customAdapterActivit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_adapter_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, CustomAdapterFragment.newInstance())
                    .commitNow();
        }
    }
}

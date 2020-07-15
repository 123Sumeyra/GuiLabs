package com.example.listviewexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   Button arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayAdapter = findViewById(R.id.arrayadapter);
        AdapterButtonListener listener = new AdapterButtonListener();
        arrayAdapter.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Log.d("AddapterButtonLisyener", "Clicked");
                Intent intent = new Intent(MainActivity.this, ArrayAdapterActivity.class);
                startActivity(intent);

            }
        });

        arrayAdapter = findViewById(R.id.arrayadapter);
        AdapterButtonListener listener = new AdapterButtonListener();
        arrayAdapter.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Log.d("AddapterButtonLisyener", "Clicked");
                Intent intent = new Intent(MainActivity.this, ArrayAdapterActivity.class);
                startActivity(intent);

            }
        });





    }

    private class AdapterButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Log.d("AddapterButtonLisyener", "Clicked");
           Intent intent =new Intent(MainActivity.this, ArrayAdapterActivity.class);
           startActivity(intent);

        }
    }
}

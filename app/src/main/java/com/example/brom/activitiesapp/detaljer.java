package com.example.brom.activitiesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class detaljer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaljer);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String name = intent.getStringExtra("BERG_NAMN" );
        int height = intent.getIntExtra("BERG_HEIGHT", -1 );
        String location = intent.getStringExtra("BERG_LOCATION" );
        Log.d("WAQAR", "Fick följande från main activity: "+name);
        Log.d("WAQAR", "Fick följande från main activity: "+height);
        Log.d("WAQAR", "Fick följande från main activity: "+location);
        TextView textView = findViewById(R.id.textFromMain);
        TextView textView1 = findViewById(R.id.mountainHeight);
        TextView textView2 = findViewById(R.id.mountainLocation);
        textView.setText(name);
        textView1.setText(""+height);
        textView2.setText(location);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}

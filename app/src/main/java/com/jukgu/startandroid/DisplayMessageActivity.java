package com.jukgu.startandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String massage =  intent.getStringExtra(EXTRA_MESSAGE);

        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(massage);
    }
}

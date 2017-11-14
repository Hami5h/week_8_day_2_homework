package com.example.hamishstewart.wordcounter.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.hamishstewart.wordcounter.R;

public class CountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int words = extras.getInt("wordCount");

        TextView wordCountTextView = findViewById(R.id.wordCount);
        wordCountTextView.setText(Integer.toString(words));
    }
}

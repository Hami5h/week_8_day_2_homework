package com.example.hamishstewart.wordcounter.Controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.hamishstewart.wordcounter.R;

public class AboutActivity extends AppCompatActivity {
    private TextView aboutMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        this.aboutMe = (TextView) findViewById(R.id.aboutApp);

        this.aboutMe.setText("Hi I am an Android App developed by Hamish");
    }
}

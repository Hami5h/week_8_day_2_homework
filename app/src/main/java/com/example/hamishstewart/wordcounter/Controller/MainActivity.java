package com.example.hamishstewart.wordcounter.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hamishstewart.wordcounter.Model.Counter;
import com.example.hamishstewart.wordcounter.R;

public class MainActivity extends AppCompatActivity {

    private TextView WordCountAnswer;
    private EditText EnterSentenceText;
    private Button AnswerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.WordCountAnswer = (TextView) findViewById(R.id.sentence);
        this.EnterSentenceText = (EditText) findViewById(R.id.input_sentence);
        this.AnswerButton = (Button) findViewById(R.id.answer_button);
    }

    public void onButtonClicked(View button) {
        String wordsToCount = this.EnterSentenceText.getText().toString();
//        Log.d("WordCounter", "Counting words in : " + wordsToCount + "");
//        Integer words = Counter.getWordCount(wordsToCount);
//        this.WordCountAnswer.setText(words.toString());

        Intent intent = new Intent(this, CountActivity.class);
        int words = Counter.getWordCount(wordsToCount);
        intent.putExtra("wordCount", words );
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.action_about) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.action_settings) {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
        }

        return true;
    }


}

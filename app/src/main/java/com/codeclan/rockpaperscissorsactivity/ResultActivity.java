package com.codeclan.rockpaperscissorsactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView resultsText;
    GameModel gameModel;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        resultsText = (TextView)findViewById(R.id.results_text);

        String humanHand = extras.getString("choice");
        System.out.println(humanHand);
        gameModel = new GameModel(humanHand);
        result = gameModel.whoWon();

        resultsText.setText(result);
    }
}

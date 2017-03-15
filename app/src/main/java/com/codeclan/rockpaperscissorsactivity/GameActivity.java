package com.codeclan.rockpaperscissorsactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        rockButton = (Button)findViewById(R.id.rock_button);
        paperButton = (Button)findViewById(R.id.paper_button);
        scissorsButton = (Button)findViewById(R.id.scissors_button);

    }

    public void onRockButtonClicked(View button){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("choice", "Rock");
        startActivity(intent);
    }

    public void onPaperButtonClicked(View button){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("choice", "Paper");
        startActivity(intent);
    }

    public void onScissorsButtonClicked(View button){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("choice", "Scissors");
        startActivity(intent);
    }

}

package com.dmns.americanfootball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class Activity extends AppCompatActivity {


    int scoreTeamRed = 0;
    int scoreTeamBlue = 0;

    int touchdownBlue = 0;
    int fieldBlue = 0;
    int convertionBlue = 0;
    int safetyBlue = 0;
    int kickBlue = 0;

    int touchdownRed = 0;
    int fieldRed = 0;
    int convertionRed = 0;
    int safetyRed = 0;
    int kickRed = 0;
    // point values
    int touchdownPoints = 6;
    int fieldGoalPoints = 3;
    int kickGoalPoints = 1;
    int convertionPoints = 2;
    int safetyPoints = 2;
    int dis = 0;
    TextView outView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_catalog, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_newGame:
                // TODO
                this.finish();
                Intent newGame = new Intent(Activity.this, Activity.class);
                startActivity(newGame);
                return true;
            case R.id.action_about:
                //TODO
                Toast.makeText(this, R.string.toast, Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_endGame:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void displayScoreForTeamRed(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamRedScore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoreForTeamBlue(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamBlueScore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTimes(int score) {
        outView.setText(String.valueOf(score));
    }


    public void Score(View v) {
        switch (v.getId()) {
            case R.id.touchdownBlue:
                scoreTeamBlue += touchdownPoints;
                touchdownBlue += 1;
                dis = touchdownBlue;
                outView = (TextView) findViewById(R.id.boardTouchdownBlue);
                break;
            case R.id.safetyBlue:
                scoreTeamBlue += safetyPoints;
                safetyBlue += 1;
                dis = safetyBlue;
                outView = (TextView) findViewById(R.id.boardSafetyBlue);
                break;
            case R.id.conversionBlue:
                scoreTeamBlue += convertionPoints;
                convertionBlue += 1;
                dis = convertionBlue;
                outView = (TextView) findViewById(R.id.boardConversionBlue);
                break;
            case R.id.goalKickBlue:
                scoreTeamBlue += kickGoalPoints;
                kickBlue += 1;
                dis = kickBlue;
                outView = (TextView) findViewById(R.id.boardKickBlue);
                break;
            case R.id.fieldGoalBlue:
                scoreTeamBlue += fieldGoalPoints;
                fieldBlue += 1;
                dis = fieldBlue;
                outView = (TextView) findViewById(R.id.boardFieldBlue);
                break;

            case R.id.touchdownRed:
                scoreTeamRed += touchdownPoints;
                touchdownRed += 1;
                dis = touchdownRed;
                outView = (TextView) findViewById(R.id.boardTouchdownRed);
                break;
            case R.id.safetyRed:
                scoreTeamRed += safetyPoints;
                safetyRed += 1;
                dis = safetyRed;
                outView = (TextView) findViewById(R.id.boardSafetyRed);
                break;
            case R.id.conversionRed:
                scoreTeamRed += convertionPoints;
                convertionRed += 1;
                dis = convertionRed;
                outView = (TextView) findViewById(R.id.boardConversionRed);
                break;
            case R.id.goalKickRed:
                scoreTeamRed += kickGoalPoints;
                kickRed += 1;
                dis = kickRed;
                outView = (TextView) findViewById(R.id.boardKickRed);
                break;
            case R.id.fieldGoalRed:
                scoreTeamRed += fieldGoalPoints;
                fieldRed += 1;
                dis = fieldRed;
                outView = (TextView) findViewById(R.id.boardFieldRed);
                break;
            default:
                break;
        }

        displayScoreForTeamBlue(scoreTeamBlue);
        displayScoreForTeamRed(scoreTeamRed);
        displayTimes(dis);
        if (scoreTeamRed > 100 || scoreTeamBlue > 100) {
            Toast.makeText(this, "That was a long game. Was it?", Toast.LENGTH_SHORT).show();
        }

    }


}


package com.example.android.geographyquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score1 = 1;
    int score2 = 1;
    int score3 = 1;
    int score4 = 1;
    int score5 = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String submit(View view) {

            // Figure out if the user selected crust.
            CheckBox crust = (CheckBox) findViewById(R.id.crust);

            //score1 to always start from 1
            //score1 goes to 0 if user does not choose crust for Q1
            if (crust.isChecked()) {
            score1 = score1;
            } else {
                score1 = 0;
            }

            // Figure out if the user selected inner core.
            CheckBox innerCore = (CheckBox) findViewById(R.id.inner_core);
            // score1 goes to 1 if user does choose Inner Core for Q1
            if (innerCore.isChecked()) {
                score1 = score1;
            } else {
                score1 = 0;
            }

            // Figure out if the user selected mantle.
            CheckBox mantle = (CheckBox) findViewById(R.id.mantle);

            // score1 goes to 1 if user does choose Inner Core for Q1
            if (mantle.isChecked()) {
                score1 = score1;
            } else {
                score1 = 0;
            }

            // Figure out if the user selected sea.
            CheckBox sea = (CheckBox) findViewById(R.id.sea);
            // score1 goes to 1 if user does not choose Inner Core for Q1
            if (sea.isChecked()) {
                score1 = 0;
            } else {
                score1 = score1;
            }


            // Figure out if the user selected pacific plate.
            RadioButton pacificPlate = (RadioButton) findViewById(R.id.pacific_plate);
            //score2 goes to 0 if user does not choose Pacific Plate for Q2
            if (pacificPlate.isChecked()) {
                score2 = score2;
            } else {
                score2 = 0;
            }

            // Figure out if the user selected south american plate.
            RadioButton southAmericanPlate = (RadioButton) findViewById(R.id.south_american_plate);
            // score2 goes to 0 if user chooses South American Plate for Q2
            if (southAmericanPlate.isChecked()) {
                score2 = 0;
            }

            // Figure out if the user selected eurasian plate.
            RadioButton eurasianPlate = (RadioButton) findViewById(R.id.eurasian_plate);
            // score2 goes to 0 if user chooses Eurasian Plate for Q2
            if (eurasianPlate.isChecked()) {
                score2 = 0;
            }

            // Figure out if the user selected hawaii.
            RadioButton hawaii = (RadioButton) findViewById(R.id.hawaii);
            //score3 goes to 0 if user does not choose Hawaii for Q3
            if (hawaii.isChecked()) {
                score3 = score3;
            } else {
                score3 = 0;
            }

            // Figure out if the user selected British Isles.
            RadioButton britishIsles = (RadioButton) findViewById(R.id.british_isles);
            // score3 goes to 0 if user chooses British Isles for Q3
            if (britishIsles.isChecked()) {
                score3 = 0;
            }

            // Figure out if the user selected maldives.
            RadioButton maldives = (RadioButton) findViewById(R.id.maldives);
            // score3 goes to 0 if user chooses maldives for Q3
            if (maldives.isChecked()) {
                score3 = 0;
            }

            // Figure out if the user selected fetch.
            CheckBox fetch = (CheckBox) findViewById(R.id.fetch);
            // score4 goes to 1 if user does chooses fetch for Q4
            if (fetch.isChecked()) {
                score4 = score4;
            } else {
                score4 = 0;
            }
            // Figure out if the user selected wind speed.
            CheckBox windSpeed = (CheckBox) findViewById(R.id.wind_speed);
            // score4 goes to 1 if user does chooses wind speed for Q4
            if (windSpeed.isChecked()) {
                score4 = score4;
            } else {
                score4 = 0;
            }
            // Figure out if the user selected wind duration.
            CheckBox windDuration = (CheckBox) findViewById(R.id.wind_duration);
            // score4 goes to 1 if user chooses wind duration for Q4
            if (windDuration.isChecked()) {
                 score4 = score4;
            } else {
                score4 = 0;
            }


            // Figure out if the user selected constructive Waves.
            CheckBox constructiveWaves = (CheckBox) findViewById(R.id.constructive_waves);

            //score5 goes to 0 if user does not choose constructive waves for Q5
            if (constructiveWaves.isChecked()) {
                    score5 = score5;
                } else {
                score5 = 0;
            }

            // Figure out if the user selected destructive waves.
            CheckBox destructiveWaves = (CheckBox) findViewById(R.id.destructive_waves);
            //score5 goes to 0 if user does not choose destructive waves for Q5
            if (destructiveWaves.isChecked()) {
                score5 = score5;
            } else {
                score5 = 0;
            }

            // Figure out if the user selected transform waves.
            CheckBox transformWaves = (CheckBox) findViewById(R.id.transform_waves);
            //score5 goes to 0 if user does not choose transformWaves for Q5
            if (transformWaves.isChecked()) {
                score5 = score5;
            } else {
                score5 = 0;
            }

            int result = score1 + score2 + score3 + score4 + score5;
            String score = createScoreSummary(result);
            displayMessage(score);
            //shows score temporarily
            Toast.makeText(this, score, Toast.LENGTH_SHORT).show();
        return score;
    }

            // shows the score where the TextView is
            private String createScoreSummary (int result){
                String score = "Score: " +  result + "/5";
                return score;
            }

            // tells where the score should be shown which is at the Score TextView
            private void displayMessage (String score){
                TextView ScoreTextView = (TextView) findViewById(R.id.Score);
                ScoreTextView.setText(score);
            }
        }
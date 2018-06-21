package com.example.android.cricketscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreA = 0;
    int scoreB = 0;
    int wicketsA = 0;
    int wicketsB = 0;

    public void sixA(View view) {
        scoreA = scoreA + 6;
        displayA(scoreA);
    }
    public void fourA(View view) {
        scoreA += 4;
        displayA(scoreA);
    }
    public void threeA(View view) {
        scoreA += 3;
        displayA(scoreA);
    }
    public void twoA(View view) {
        scoreA +=2;
        displayA(scoreA);
    }
    public void oneA(View view) {
        scoreA += 1;
        displayA(scoreA);
    }
    public void wicketA(View view) {
        if(wicketsA !=10){
            wicketsA += 1;
        }
        displayWA(wicketsA);
    }
    public void displayWA(int wickA) {
        TextView wicA = (TextView) findViewById(R.id.wicketsA);
        wicA.setText("" + wickA);
    }
    public void displayA(int totalScoreA){
        TextView totalA = (TextView) findViewById(R.id.display_score_a);
        totalA.setText("" + totalScoreA);
    }




    public void sixB(View view) {
        scoreB += 6;
        displayB(scoreB);
    }
    public void fourB(View view) {
        scoreB += 4;
        displayB(scoreB);
    }
    public void threeB(View view) {
        scoreB += 3;
        displayB(scoreB);
    }
    public void twoB(View view) {
        scoreB +=2;
        displayB(scoreB);
    }
    public void oneB(View view) {
        scoreB += 1;
        displayB(scoreB);
    }
    public void displayB(int totalScoreB){
        TextView totalB = (TextView) findViewById(R.id.display_score_b);
        totalB.setText("" + totalScoreB);
    }
    public void wicketB(View view) {
        if(wicketsB ==10){
            wicketsB = 10;
        }
        else {
            wicketsB += 1;
        }
        displayWB(wicketsB);
    }
    public void displayWB(int wickB) {
        TextView wicB = (TextView) findViewById(R.id.wicketsB);
        wicB.setText("" + wickB);
    }
    public void reset(View view) {
        displayA(scoreA = 0);
        displayB(scoreB = 0);
        displayWA(wicketsA = 0);
        displayWB(wicketsB = 0);
    }
}

package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView winText = findViewById(R.id.winText);
        final TextView drawText = findViewById(R.id.drawText);
        final TextView loseText = findViewById(R.id.loseText);
        final Button button1 = findViewById( R.id.button1 );
        final Button button2 = findViewById( R.id.button2 );
        final Button button3 = findViewById( R.id.button3 );
        final Button button4 = findViewById( R.id.button4 );
        final Button button5 = findViewById( R.id.button5 );
        final Button button6 = findViewById( R.id.button6 );
        final Button button7 = findViewById( R.id.button7 );
        final Button button8 = findViewById( R.id.button8 );
        final Button button9 = findViewById( R.id.button9 );
        final Button[] buttons = {button1,button2,button3,button4,button5,button6,button7,button8,button9};
        clearBoard(buttons);

        button1.setOnClickListener(new View.OnClickListener() {
            Button[] buttonList = {button1,button2,button3,button4,button5,button6,button7,button8,button9};
            @Override
            public void onClick(View view) {

                if(button1.getText().toString().equals("")){
                    button1.setText("X");
                    String winString = checkWinner(buttonList);

                    if (winString.equals("X")){
                        clearBoard(buttonList);
                        String s = winText.getText().toString();
                        int wins = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        winText.setText("Wins: "+(wins+1));
                    }
                    if (winString.equals("D")){
                        clearBoard(buttonList);
                        String s = drawText.getText().toString();
                        int draws = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        drawText.setText("Draws: "+(draws+1));
                    }
                    pickSpot(buttonList);
                    String winString1 = checkWinner(buttonList);
                    if (winString1.equals("O")){
                        clearBoard(buttonList);
                        String s = loseText.getText().toString();
                        int loses = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        loseText.setText("Loses: "+(loses+1));
                    }
                    if (winString1.equals("D")){
                        clearBoard(buttonList);
                        String s = drawText.getText().toString();
                        int draws = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        drawText.setText("Draws: "+(draws+1));
                    }
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            Button[] buttonList = {button1,button2,button3,button4,button5,button6,button7,button8,button9};
            @Override
            public void onClick(View view) {

                if(button2.getText().toString().equals("")){
                    button2.setText("X");
                    String winString = checkWinner(buttonList);
                    if (winString.equals("X")){
                        clearBoard(buttonList);
                        String s = winText.getText().toString();
                        int wins = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        winText.setText("Wins: "+(wins+1));
                    }
                    if (winString.equals("D")){
                        clearBoard(buttonList);
                        String s = drawText.getText().toString();
                        int draws = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        drawText.setText("Draws: "+(draws+1));
                    }
                    pickSpot(buttonList);
                    String winString1 = checkWinner(buttonList);
                    if (winString1.equals("O")){
                        clearBoard(buttonList);
                        String s = loseText.getText().toString();
                        int loses = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        loseText.setText("Loses: "+(loses+1));
                    }
                    if (winString1.equals("D")){
                        clearBoard(buttonList);
                        String s = drawText.getText().toString();
                        int draws = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        drawText.setText("Draws: "+(draws+1));
                    }
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            Button[] buttonList = {button1,button2,button3,button4,button5,button6,button7,button8,button9};
            @Override
            public void onClick(View view) {

                if(button3.getText().toString().equals("")){
                    button3.setText("X");
                    String winString = checkWinner(buttonList);
                    if (winString.equals("X")){
                        clearBoard(buttonList);
                        String s = winText.getText().toString();
                        int wins = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        winText.setText("Wins: "+(wins+1));
                    }
                    if (winString.equals("D")){
                        clearBoard(buttonList);
                        String s = drawText.getText().toString();
                        int draws = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        drawText.setText("Draws: "+(draws+1));
                    }
                    pickSpot(buttonList);
                    String winString1 = checkWinner(buttonList);
                    if (winString1.equals("O")){
                        clearBoard(buttonList);
                        String s = loseText.getText().toString();
                        int loses = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        loseText.setText("Loses: "+(loses+1));
                    }
                    if (winString1.equals("D")){
                        clearBoard(buttonList);
                        String s = drawText.getText().toString();
                        int draws = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        drawText.setText("Draws: "+(draws+1));
                    }
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            Button[] buttonList = {button1,button2,button3,button4,button5,button6,button7,button8,button9};
            @Override
            public void onClick(View view) {

                if(button4.getText().toString().equals("")){
                    button4.setText("X");
                    String winString = checkWinner(buttonList);
                    if (winString.equals("X")){
                        clearBoard(buttonList);
                        String s = winText.getText().toString();
                        int wins = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        winText.setText("Wins: "+(wins+1));
                    }
                    if (winString.equals("D")){
                        clearBoard(buttonList);
                        String s = drawText.getText().toString();
                        int draws = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        drawText.setText("Draws: "+(draws+1));
                    }
                    pickSpot(buttonList);
                    String winString1 = checkWinner(buttonList);
                    if (winString1.equals("O")){
                        clearBoard(buttonList);
                        String s = loseText.getText().toString();
                        int loses = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        loseText.setText("Loses: "+(loses+1));
                    }
                    if (winString1.equals("D")){
                        clearBoard(buttonList);
                        String s = drawText.getText().toString();
                        int draws = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        drawText.setText("Draws: "+(draws+1));
                    }
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            Button[] buttonList = {button1,button2,button3,button4,button5,button6,button7,button8,button9};
            @Override
            public void onClick(View view) {

                if(button5.getText().toString().equals("")){
                    button5.setText("X");
                    String winString = checkWinner(buttonList);
                    if (winString.equals("X")){
                        clearBoard(buttonList);
                        String s = winText.getText().toString();
                        int wins = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        winText.setText("Wins: "+(wins+1));

                    }
                    if (winString.equals("D")){
                        clearBoard(buttonList);
                        String s = drawText.getText().toString();
                        int draws = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        drawText.setText("Draws: "+(draws+1));
                    }
                    pickSpot(buttonList);
                    String winString1 = checkWinner(buttonList);
                    if (winString1.equals("O")){
                        clearBoard(buttonList);
                        String s = loseText.getText().toString();
                        int loses = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        loseText.setText("Loses: "+(loses+1));
                    }
                    if (winString1.equals("D")){
                        clearBoard(buttonList);
                        String s = drawText.getText().toString();
                        int draws = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        drawText.setText("Draws: "+(draws+1));
                    }
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            Button[] buttonList = {button1,button2,button3,button4,button5,button6,button7,button8,button9};
            @Override
            public void onClick(View view) {

                if(button6.getText().toString().equals("")){
                    button6.setText("X");
                    String winString = checkWinner(buttonList);
                    if (winString.equals("X")){
                        clearBoard(buttonList);
                        String s = winText.getText().toString();
                        int wins = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        winText.setText("Wins: "+(wins+1));
                    }
                    if (winString.equals("D")){
                        clearBoard(buttonList);
                        String s = drawText.getText().toString();
                        int draws = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        drawText.setText("Draws: "+(draws+1));
                    }
                    pickSpot(buttonList);
                    String winString1 = checkWinner(buttonList);
                    if (winString1.equals("O")){
                        clearBoard(buttonList);
                        String s = loseText.getText().toString();
                        int loses = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        loseText.setText("Loses: "+(loses+1));
                    }
                    if (winString1.equals("D")){
                        clearBoard(buttonList);
                        String s = drawText.getText().toString();
                        int draws = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        drawText.setText("Draws: "+(draws+1));
                    }
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            Button[] buttonList = {button1,button2,button3,button4,button5,button6,button7,button8,button9};
            @Override
            public void onClick(View view) {

                if(button7.getText().toString().equals("")){
                    button7.setText("X");
                    String winString = checkWinner(buttonList);
                    if (winString.equals("X")){
                        clearBoard(buttonList);
                        String s = winText.getText().toString();
                        int wins = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        winText.setText("Wins: "+(wins+1));
                    }
                    if (winString.equals("D")){
                        clearBoard(buttonList);
                        String s = drawText.getText().toString();
                        int draws = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        drawText.setText("Draws: "+(draws+1));
                    }
                    pickSpot(buttonList);
                    String winString1 = checkWinner(buttonList);
                    if (winString1.equals("O")){
                        clearBoard(buttonList);
                        String s = loseText.getText().toString();
                        int loses = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        loseText.setText("Loses: "+(loses+1));
                    }
                    if (winString1.equals("D")){
                        clearBoard(buttonList);
                        String s = drawText.getText().toString();
                        int draws = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        drawText.setText("Draws: "+(draws+1));
                    }
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            Button[] buttonList = {button1,button2,button3,button4,button5,button6,button7,button8,button9};
            @Override
            public void onClick(View view) {

                if(button8.getText().toString().equals("")){
                    button8.setText("X");
                    String winString = checkWinner(buttonList);
                    if (winString.equals("X")){
                        clearBoard(buttonList);
                        String s = winText.getText().toString();
                        int wins = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        winText.setText("Wins: "+(wins+1));
                    }
                    if (winString.equals("D")){
                        clearBoard(buttonList);
                        String s = drawText.getText().toString();
                        int draws = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        drawText.setText("Draws: "+(draws+1));
                    }
                    pickSpot(buttonList);
                    String winString1 = checkWinner(buttonList);
                    if (winString1.equals("O")){
                        clearBoard(buttonList);
                        String s = loseText.getText().toString();
                        int loses = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        loseText.setText("Loses: "+(loses+1));
                    }
                    if (winString1.equals("D")){
                        clearBoard(buttonList);
                        String s = drawText.getText().toString();
                        int draws = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        drawText.setText("Draws: "+(draws+1));
                    }
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            Button[] buttonList = {button1,button2,button3,button4,button5,button6,button7,button8,button9};
            @Override
            public void onClick(View view) {

                if(button9.getText().toString().equals("")){
                    button9.setText("X");
                    String winString = checkWinner(buttonList);
                    if (winString.equals("X")){
                        clearBoard(buttonList);
                        String s = winText.getText().toString();
                        int wins = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        winText.setText("Wins: "+(wins+1));
                    }
                    if (winString.equals("D")){
                        clearBoard(buttonList);
                        String s = drawText.getText().toString();
                        int draws = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        drawText.setText("Draws: "+(draws+1));
                    }
                    pickSpot(buttonList);
                    String winString1 = checkWinner(buttonList);
                    if (winString1.equals("O")){
                        clearBoard(buttonList);
                        String s = loseText.getText().toString();
                        int loses = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        loseText.setText("Loses: "+(loses+1));
                    }
                    if (winString1.equals("D")){
                        clearBoard(buttonList);
                        String s = drawText.getText().toString();
                        int draws = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                        drawText.setText("Draws: "+(draws+1));
                    }
                }
            }
        });

    }
    public static void pickSpot(Button[] buttonList){
        for (int i = 0; i<buttonList.length;i++){
            if(buttonList[i].getText().toString().equals("")){
                buttonList[i].setText("O");
                break;
            }
            else
                continue;
        }
        }
        public static void clearBoard(Button[] buttonList){
            for(int i = 0; i<buttonList.length;i++){
                buttonList[i].setText("");
            }
        }
    public static String checkWinner(Button[] buttonList){

        String[][] buttonStrings = new String[3][3];
        for(int i = 0; i<buttonList.length;i++){
            buttonStrings[i/3][i%3] = buttonList[i].getText().toString();
        }
        //check rows for winner
        for(int i = 0; i<buttonStrings.length;i++){
            boolean winner = true;
            for(int j=0; j<buttonStrings[i].length;j++){
                if(!buttonStrings[i][j].equals("X")){
                    winner = false;
                }
            }
            if(winner){
                return "X";
            }
        }
        for(int i = 0; i<buttonStrings.length;i++){
            boolean winner = true;
            for(int j=0; j<buttonStrings[i].length;j++){
                if(!buttonStrings[i][j].equals("O")){
                    winner = false;
                }
            }
            if(winner){
                return "O";
            }
        }
        //check columns for winner X
        int i,j;
        for( i = 0; i<buttonStrings.length;i++){
            boolean winner = true;
            for( j=0; j<buttonStrings[i].length;j++){
                if(!buttonStrings[j][i].equals("X")){
                    winner=false;
                }
            }
            if(winner){
                return "X";
            }
        }
        //check columns for winner O
        for( i = 0; i<buttonStrings.length;i++){
            boolean winner = true;
            for( j=0; j<buttonStrings[i].length;j++){
                if(!buttonStrings[j][i].equals("O")){
                    winner=false;
                }
            }
            if(winner){
                return "O";
            }
        }
        //check diagnols
        if(buttonStrings[0][0].equals(buttonStrings[1][1])&&buttonStrings[2][2].equals(buttonStrings[1][1])){
            return buttonStrings[0][0];
        }
        if(buttonStrings[2][0].equals(buttonStrings[1][1])&&buttonStrings[0][2].equals(buttonStrings[1][1])){
            return buttonStrings[2][0];
        }
        //check for draws
        boolean draw = true;
        for( i = 0; i<buttonList.length;i++){
            if(buttonList[i].getText().equals("")) {
                draw = false;
                break;
            }
        }
        if(draw){
            return "D";
        }
        return "";
    }
}

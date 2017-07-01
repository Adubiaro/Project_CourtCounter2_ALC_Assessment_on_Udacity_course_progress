package yemi.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int Acount = 0;
    int Bcount = 0;
    int maxCount = 99;
    String winner4 = "Winner shows here";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    this line of code affects the score of each team durring the match.. where the maximum score for the match is 99
    @param maxCount
     */
    public void increment3(View view) {
        Acount += 3;
        if(Acount <= 99) {
            display(Acount);
        }
        else{
            display(maxCount);
        }
    }

    public void increment2(View view) {
        Acount += 2;
        if(Acount <= 99) {
            display(Acount);
        }
        else{
            display(maxCount);
        }
    }

    public void increment1(View view) {
        Acount += 1;
        if(Acount <= 99) {
            display(Acount);
        }
        else{
            display(maxCount);
        }
    }


    public void reset(View view) {
        Acount = 0;
        Bcount = 0;
        display(Acount);
        displayA(Bcount);
        displayWinner(winner4);

    }

    public void Bincrement3(View view) {
        Bcount += 3;
        if(Bcount <= 99) {
            displayA(Bcount);
        }
        else{
            displayA(maxCount);
        }
    }

    public void Bincrement2(View view) {
        Bcount += 2;
        if(Bcount <= 99) {
            displayA(Bcount);
        }
        else{
            displayA(maxCount);
        }
    }

    public void Bincrement1(View view) {
        Bcount += 1;
        if(Bcount <= 99) {
            displayA(Bcount);
        }
        else{
            displayA(maxCount);
        }
    }

    public void winner(View view) {
        String winner1 = "Nigeria wins with " + Acount + " points";
        String winner2 = "England wins with " + Bcount + " points";
        String winner3 = "no winner yet";
        String noWinner = "Both teams have equal points \n \t \t \t \t \t \t its a draw game";
        String end = "End of Game";
        if(Acount >= Bcount && Acount >= 80 && Acount <= 99) {
            displayWinner(winner1);
        }
         else if(Bcount > Acount && Bcount > 80 && Bcount <=99) {
            displayWinner(winner2);
        }
        else if(Bcount == Acount) {
            displayWinner(noWinner);
        }
        else if(Bcount >= 99 || Acount >= 99) {
            displayWinner(end);
        }
        else{
            displayWinner(winner3);
        }
    }




    public void display(int number) {
        TextView teamACountTextView = (TextView) findViewById(R.id.teamACount_text_view);
        teamACountTextView.setText("" + number);
    }

    public void displayA(int number) {
        TextView teamBCountTextView = (TextView) findViewById(R.id.teamBCount_text_view);
        teamBCountTextView.setText("" + number);
    }

    public void displayWinner(String win) {
        TextView winnerTextView = (TextView) findViewById(R.id.winner_text_view);
        winnerTextView.setText("" + win);
    }
}

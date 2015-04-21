package com.example.dhruvi.pig;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;


public class Player2 extends ActionBarActivity {

    private FrameLayout die1, die2;
    private Button roll, hold;
    private int score1=0,score2,count = 0;
    private TextView p1,p2,round,roundscore;
    private int p2temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player2);

        roll = (Button)findViewById(R.id.button);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();

            }
        });

        hold = (Button)findViewById(R.id.hold);
        hold.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent intent = new Intent(Player2.this,MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
            }
        });

        round = (TextView)findViewById(R.id.round);
        roundscore = (TextView)findViewById(R.id.roundscore);

        p1 = (TextView)findViewById(R.id.p1);
        p1.setText("P1:"+score1);

        p2 = (TextView)findViewById(R.id.p2);
        p2.setText("P2:"+score2);

        die1 = (FrameLayout)findViewById(R.id.die1);
        die2 = (FrameLayout)findViewById(R.id.die2);

    }
    public void rollDice(){
        int num1 = 1 + (int)(6*Math.random());
        int num2 = 1 + (int)(6*Math.random());

        setDie(num1,die1);
        setDie(num2,die2);

        if(num1 == 1 && num2 == 1){

            score2= 0;
            round.setText("Round:"+count);
             Intent intent = new Intent(Player2.this,MainActivity.class);
             intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
             startActivity(intent);


        }else if (num1 == 1 || num2 == 1){

            round.setText("Round:"+count);
            Intent intent = new Intent(Player2.this,MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            startActivity(intent);

        }else{
            int temp = num1+num2;
            p2temp =p2temp+(num1+num2);
            round.setText("Round:"+count++);
            roundscore.setText("RS:"+temp);

            p2.setText("P2:"+(score2+p2temp));

            if ((score2+p2temp) > 99){

                AlertDialog alertDialog = new AlertDialog.Builder(Player2.this).create();
                alertDialog.setTitle("You Won Player2");
                alertDialog.setMessage("Yipeeaieahhh!");

                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL,"OK",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                        Intent i = getBaseContext().getPackageManager().getLaunchIntentForPackage(getBaseContext().getPackageName());
                        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(i);
                    }
                });

                alertDialog.show();

            }
        }
    }
    public void setDie(int value, FrameLayout layout){
        Drawable pic =null;

        switch (value){
            case 1:
                pic = getResources().getDrawable(R.drawable.die_face_1);
                break;
            case 2:
                pic = getResources().getDrawable(R.drawable.die_face_2);
                break;
            case 3:
                pic = getResources().getDrawable(R.drawable.die_face_3);
                break;
            case 4:
                pic = getResources().getDrawable(R.drawable.die_face_4);
                break;
            case 5:
                pic = getResources().getDrawable(R.drawable.die_face_5);
                break;
            case 6:
                pic = getResources().getDrawable(R.drawable.die_face_6);
                break;
        }

        layout.setBackground(pic);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

package com.example.dhruvi.pairodice;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;


public class MainActivity extends ActionBarActivity {

    private FrameLayout die1, die2;
    private Button roll,hold;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        roll = (Button)findViewById(R.id.rollbutton);

    roll.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
      rollDice();
            /*Uri number = Uri.parse("tel:6262972028");
            Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
            startActivity(callIntent);*/

        }
    });
        hold = (Button)findViewById(R.id.hold);
        hold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Player2.class);

                intent.putExtra("score",99L);
                startActivity(intent);
            }
        });
        die1 = (FrameLayout)findViewById(R.id.die1);
        die2  =(FrameLayout)findViewById(R.id.die2);
    }

public void rollDice() {
    int num1 = 1 + (int) (6 * Math.random());
    int num2 = 1 + (int) (6 * Math.random());

    setDie(num1, die1);
    setDie(num2,die2);

}
    public void setDie(int num, FrameLayout layout) {
        Drawable pic=null;
        switch (num) {
            case 1:
                pic = getResources().getDrawable(R.drawable.die_face_1);
                layout.setBackground(pic);
                break;
            case 2:
                pic = getResources().getDrawable(R.drawable.die_face_2);
                layout.setBackground(pic);
                break;
            case 3:
                pic = getResources().getDrawable(R.drawable.die_face_3);
                layout.setBackground(pic);
                break;
            case 4:
                pic = getResources().getDrawable(R.drawable.die_face_4);
                layout.setBackground(pic);
                break;
            case 5:
                pic = getResources().getDrawable(R.drawable.die_face_5);
                layout.setBackground(pic);
                break;
            case 6:
                pic = getResources().getDrawable(R.drawable.die_face_6);
                layout.setBackground(pic);
                break;
            default:
                android.util.Log.i("my code", "Something Went Wrong");
        }
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

package com.example.dhruvi.calculatorhw1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Activity2 extends ActionBarActivity {

    Button sin,cos,tan,bclr,ln,log,pie,e,percent,fact,power,sqrt,br1,br2;
    EditText ans;
    float onefloat=0,twofloat=0,ansfloat=0;
    int flag=0,operations=0,intorfloat=0,onetime=0;
    String activity1,num1,num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        Intent intent=getIntent();
        activity1=intent.getStringExtra("activity1");

        ans = (EditText) findViewById(R.id.editText);
        sin = (Button) findViewById(R.id.buttonsin);
        cos = (Button) findViewById(R.id.buttoncos);
        tan=  (Button) findViewById(R.id.buttontan);
        sin = (Button) findViewById(R.id.buttonsin);
        fact = (Button)findViewById(R.id.buttonfact);
        ln = (Button) findViewById(R.id.buttonln);
        log = (Button) findViewById(R.id.buttonlog);
        pie = (Button) findViewById(R.id.buttonpie);
        percent = (Button) findViewById(R.id.buttonper);
        sqrt = (Button) findViewById(R.id.buttonsqrt);
        power = (Button) findViewById(R.id.buttonpower);
        bclr = (Button) findViewById(R.id.buttonC);
        e=(Button)findViewById(R.id.buttone);
        br1 = (Button) findViewById(R.id.buttonbr1);
        br2 = (Button) findViewById(R.id.buttonbr2);

        bclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                onefloat=0;twofloat=0;ansfloat=0;
                flag=0;operations=0;intorfloat=0;onetime=0;
                ans.setText("");
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                    double temp = Double.parseDouble(String.valueOf(activity1));
                    System.out.println(temp);
                    onefloat = Float.parseFloat(String.valueOf(num1));
                    onefloat = (float) Math.sin(temp);
                    ansfloat = onefloat;
                    ans.setText(Double.toString(ansfloat));

            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                double temp = Double.parseDouble(activity1);
                System.out.println(temp);
                onefloat=Float.parseFloat(num1);
                onefloat = (float) Math.cos(temp);
                ansfloat = onefloat;
                ans.setText(Double.toString(ansfloat));
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                double temp = Double.parseDouble(activity1);
                System.out.println(temp);
                onefloat=Float.parseFloat(num1);
                onefloat = (float) Math.tan(temp);
                ansfloat=onefloat;
                ans.setText(Double.toString(ansfloat));
            }
        });

        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                double temp = Double.parseDouble(activity1);
                System.out.println(temp);
                onefloat=Float.parseFloat(num1);
                onefloat = (float) Math.log(temp);
                ansfloat=onefloat;
                ans.setText(Double.toString(ansfloat));
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                double temp = Double.parseDouble(activity1);
                System.out.println(temp);
                onefloat=Float.parseFloat(num1);
                onefloat = (float) Math.log10(temp);
                ansfloat=onefloat;
                ans.setText(Double.toString(ansfloat));
            }
        });
       sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                double temp = Double.parseDouble(activity1);
                System.out.println(temp);
                onefloat=Float.parseFloat(num1);
                onefloat = (float) Math.sqrt(temp);
                ansfloat=onefloat;
                ans.setText(Double.toString(ansfloat));
            }
        });

        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                int temp = Integer.parseInt(activity1);
                System.out.println(temp);
                int fact = factorial(temp);
                ans.setText(Double.toString(fact));
            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                double temp = Double.parseDouble(activity1);
                System.out.println(temp);
                onefloat = Float.parseFloat(num1);
                twofloat = Float.parseFloat(num2);
                if (onefloat != 0) {
                    if (twofloat != 0) {
                        onefloat = (float) Math.pow(onefloat, twofloat);
                        ansfloat=onefloat;
                        ans.setText(Double.toString(ansfloat));
                    }
                }
            }
        });


        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                double e = Math.E;

                ans.setText(Double.toString(e));
            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                double temp = Double.parseDouble(activity1);
                System.out.println(temp);
                double percents = temp / 100;
                ans.setText(Double.toString(percents));
            }
        });
        pie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                double pi = Math.PI;
                ans.setText(Double.toString(pi));
            }
        });
        br1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                ans.setText("(");
            }
        });

        br2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                ans.setText(")");
            }
        });
    }
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact =fact*i;
        }
        return fact;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){


       int id = item.getItemId();

         if (id == R.id.action_settings) {
            return true;
        }

        if(id == R.id.S){

            Intent intent = new Intent(Activity2.this,MainActivity.class);
            intent.putExtra("activity2", ans.getText().toString());
            startActivity(intent);
            return true;
        }

        else {
            return super.onOptionsItemSelected(item);
        }
        }


}
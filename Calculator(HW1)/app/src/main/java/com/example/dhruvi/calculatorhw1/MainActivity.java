package com.example.dhruvi.calculatorhw1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends ActionBarActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button bclr,bdot,bequal,bplu,bmin,bmul,bdiv;
    EditText ans;

    float onefloat=0,twofloat=0,ansfloat=0;
    int flag=0,operations=0,intorfloat=0,onetime=0;
    String num1,num2,activity2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        activity2 = intent.getStringExtra("activity2");


        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b0 = (Button) findViewById(R.id.button0);
        bclr = (Button) findViewById(R.id.buttonC);
        bdot = (Button) findViewById(R.id.buttonDot);
        bequal = (Button) findViewById(R.id.buttonEq);
        bplu = (Button) findViewById(R.id.buttonAdd);
        bmin = (Button) findViewById(R.id.buttonSub);
        bmul = (Button) findViewById(R.id.buttonMul);
        bdiv = (Button) findViewById(R.id.buttonDiv);
        ans = (EditText) findViewById(R.id.editText);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag==0)
                {
                    num1="1";
                    flag=1;
                    ans.setText(num1);
                }
                else if(flag==1)
                {
                    num1 = num1.concat("1");
                    ans.setText(num1);
                }
                else if(flag==3)
                {
                    num2="1";
                    flag=4;
                    ans.setText(num2);
                }
                else if(flag==4)
                {
                    num2 = num2.concat("1");
                    ans.setText(num2);
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag==0)
                {
                    num1="2";
                    flag=1;
                    ans.setText(num1);
                }
                else if(flag==1)
                {
                    num1 = num1.concat("2");
                    ans.setText(num1);
                }
                else if(flag==3)
                {
                    num2="2";
                    flag=4;
                    ans.setText(num2);
                }
                else if(flag==4)
                {
                    num2 = num2.concat("2");
                    ans.setText(num2);
                }

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag==0)
                {
                    num1="3";
                    flag=1;
                    ans.setText(num1);
                }
                else if(flag==1)
                {
                    num1 = num1.concat("3");
                    ans.setText(num1);
                }
                else if(flag==3)
                {
                    num2="3";
                    flag=4;
                    ans.setText(num2);
                }
                else if(flag==4)
                {
                    num2 = num2.concat("3");
                    ans.setText(num2);
                }

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag==0)
                {
                    num1="4";
                    flag=1;
                    ans.setText(num1);
                }
                else if(flag==1)
                {
                    num1 = num1.concat("4");
                    ans.setText(num1);
                }
                else if(flag==3)
                {
                    num2="4";
                    flag=4;
                    ans.setText(num2);
                }
                else if(flag==4)
                {
                    num2 = num2.concat("4");
                    ans.setText(num2);
                }

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag==0)
                {
                    num1="5";
                    flag=1;
                    ans.setText(num1);
                }
                else if(flag==1)
                {
                    num1 = num1.concat("5");
                    ans.setText(num1);
                }
                else if(flag==3)
                {
                    num2="5";
                    flag=4;
                    ans.setText(num2);
                }
                else if(flag==4)
                {
                    num2 = num2.concat("5");
                    ans.setText(num2);
                }

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag==0)
                {
                    num1="6";
                    flag=1;
                    ans.setText(num1);
                }
                else if(flag==1)
                {
                    num1 = num1.concat("6");
                    ans.setText(num1);
                }
                else if(flag==3)
                {
                    num2="6";
                    flag=4;
                    ans.setText(num2);
                }
                else if(flag==4)
                {
                    num2 = num2.concat("6");
                    ans.setText(num2);
                }

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag==0)
                {
                    num1="7";
                    flag=1;
                    ans.setText(num1);
                }
                else if(flag==1)
                {
                    num1 = num1.concat("7");
                    ans.setText(num1);
                }
                else if(flag==3)
                {
                    num2="7";
                    flag=4;
                    ans.setText(num2);
                }
                else if(flag==4)
                {
                    num2 = num2.concat("7");
                    ans.setText(num2);
                }

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag==0)
                {
                    num1="8";
                    flag=1;
                    ans.setText(num1);
                }
                else if(flag==1)
                {
                    num1 = num1.concat("8");
                    ans.setText(num1);
                }
                else if(flag==3)
                {
                    num2="8";
                    flag=4;
                    ans.setText(num2);
                }
                else if(flag==4)
                {
                    num2 = num2.concat("8");
                    ans.setText(num2);
                }

            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag==0)
                {
                    num1="9";
                    flag=1;
                    ans.setText(num1);
                }
                else if(flag==1)
                {
                    num1 = num1.concat("9");
                    ans.setText(num1);
                }
                else if(flag==3)
                {
                    num2="9";
                    flag=4;
                    ans.setText(num2);
                }
                else if(flag==4)
                {
                    num2 = num2.concat("9");
                    ans.setText(num2);
                }

            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag==0)
                {
                    num1="0";
                    flag=1;
                    ans.setText(num1);
                }
                else if(flag==1)
                {
                    num1 = num1.concat("0");
                    ans.setText(num1);
                }
                else if(flag==3)
                {
                    num2="0";
                    flag=4;
                    ans.setText(num2);
                }
                else if(flag==4)
                {
                    num2 = num2.concat("0");
                    ans.setText(num2);
                }

            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(flag==0)
                {
                    num1=".";
                    flag=1;
                    ans.setText(num1);
                }
                else if(flag==1)
                {
                    num1 = num1.concat(".");
                    ans.setText(num1);
                }
                else if(flag==3)
                {
                    num2=".";
                    flag=4;
                    ans.setText(num2);
                }
                else if(flag==4)
                {
                    num2 = num2.concat(".");
                    ans.setText(num2);
                }

              }
        });

        bplu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag!=0)
                {
                    operations=1;
                    flag=3;
                    ans.setText("+");
                }

            }
        });

        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag!=0)
                {
                    operations=2;
                    flag=3;
                    ans.setText("-");
                }

            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag!=0)
                {
                    operations=3;
                    flag=3;
                    ans.setText("*");
                }
             }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag!=0)
                {
                    operations=4;
                    flag=3;
                    ans.setText("/");
                }

            }
        });

        bclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                onefloat=0;twofloat=0;ansfloat=0;
                flag=0;operations=0;intorfloat=0;onetime=0;
                ans.setText("");
            }
        });




        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag == 4)
                {

                    if(num1.length() < 10 && num2.length() < 10 )
                    {

                        switch(operations)
                        {
                            case 1:

                                onefloat=Float.parseFloat(num1);
                                twofloat=Float.parseFloat(num2);
                                ansfloat=onefloat+twofloat;
                                ans.setText(" "+String.valueOf(ansfloat));
                                break;

                            case 2:

                                onefloat=Float.parseFloat(num1);
                                twofloat=Float.parseFloat(num2);
                                ansfloat=onefloat-twofloat;
                                ans.setText(" "+String.valueOf(ansfloat));
                                break;

                            case 3:

                                onefloat=Float.parseFloat(num1);
                                twofloat=Float.parseFloat(num2);
                                ansfloat=onefloat*twofloat;
                                ans.setText(" "+String.valueOf(ansfloat));
                                break;

                            case 4:
                                onefloat=Float.parseFloat(num1);
                                twofloat=Float.parseFloat(num2);
                                ansfloat=onefloat/twofloat;
                                ans.setText(" "+String.valueOf(ansfloat));
                                break;

                        }
                    }
                    else
                        ans.setText("Invalid");

                }
                else
                    ans.setText("Invalid");
            }

        });

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

            Intent intent = new Intent(MainActivity.this,Activity2.class);
            intent.putExtra("activity1", ans.getText().toString());
            startActivity(intent);
            return true;
        }
        else
        {
            return super.onOptionsItemSelected(item);
        }
        }
}
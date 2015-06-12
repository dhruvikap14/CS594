package com.vinnig.tams;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.vinnig.tams.function.Function;

public class TabGroup2Activity extends TabGroupActivity {

	TextView tvmessage;
	AlertDialog alertDialog_message;
	Button bt_ok;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
		
		/*
		// alert dialog for internet connection
				AlertDialog.Builder builder = new AlertDialog.Builder(this);
				builder.setCancelable(true);

				
				LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
				View layout = inflater.inflate(R.layout.map2,null);//change
				tvmessage = (TextView) layout.findViewById(R.id.current_loc);
				builder.setView(layout);
				alertDialog_message = builder.create();
				alertDialog_message.setCanceledOnTouchOutside(true);
				alertDialog_message.setCancelable(true);
				bt_ok = (Button) layout.findViewById(R.id.bt_ok);
				bt_ok.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						alertDialog_message.dismiss();
					}
				});
				
				*/
	NetworkConnections nt=new NetworkConnections(this);
		
		if(nt.internetConnection){
			startChildActivity("OptionsActivity2",new Intent(this,MapshowActivity.class));
		}
		else{
			Log.i("internet","not working");
//			 if(alertDialog_message.isShowing()){}
//			 else{
//				 tvmessage.setText("Please check your internet connection!!");
//				 alertDialog_message.show();
//			 }
		}
		
		
	}
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		Function.showMessagedailog(this,"Do you want to Exit",TabGroup2Activity.this);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return this.getCurrentActivity().onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		return this.getCurrentActivity().onOptionsItemSelected(item);
	}

}

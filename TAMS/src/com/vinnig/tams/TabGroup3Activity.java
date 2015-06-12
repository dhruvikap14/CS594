package com.vinnig.tams;

import com.vinnig.tams.function.Function;

import android.content.Intent;
import android.os.Bundle;

public class TabGroup3Activity extends TabGroupActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		startChildActivity("OptionsActivity3",new Intent(this,Compass.class));
	}
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		Function.showMessagedailog(this,"Do you want to Exit",TabGroup3Activity.this);
	}


}

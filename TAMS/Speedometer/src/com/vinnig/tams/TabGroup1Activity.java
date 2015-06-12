package com.vinnig.tams;


import com.vinnig.tams.function.Function;

import android.content.Intent;
import android.os.Bundle;

public class TabGroup1Activity extends TabGroupActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		startChildActivity("OptionsActivity1",new Intent(this,SpeedActivity.class));
	}
	
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		Function.showMessagedailog(this,"Do you want to Exit",TabGroup1Activity.this);
	}

}

package com.vinnig.tams;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.vinnig.tams.function.Function;

public class TabGroup2Activity extends TabGroupActivity {

	TextView tvmessage;
	AlertDialog alertDialog_message;
	Button bt_ok;
	ConnectionDetector cd;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		cd = new ConnectionDetector(TabGroup2Activity.this);

		if (cd.isConnectingToInternet()) {
			startChildActivity("OptionsActivity2", new Intent(this,
					MapshowActivity.class));
		} else {
			Toast.makeText(TabGroup2Activity.this,
					"Internet not connected properly", Toast.LENGTH_LONG)
					.show();
		}

		//

	}

	@Override
	public void onBackPressed() {
		super.onBackPressed();
		Function.showMessagedailog(this, "Do you want to Exit",
				TabGroup2Activity.this);
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

package com.vinnig.tams;

import com.vinnig.tams.R;
import com.vinnig.tams.function.Function;
import com.vinnig.tams.function.GetMap;
import com.vinnig.tams.function.ImgSpeedCustom;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;

public class SpeedActivity extends Activity {
	private LocationManager mlocManager;
	private LocationListener mlocListener;
	private ImgSpeedCustom img;
	private Button btnLoc;
	private double speed, lat, longi;
	int i = 0;
	private boolean gp;
	private RelativeLayout rLspeed;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getParent().getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		img = new ImgSpeedCustom(getParent());
		img.setallImage(getParent(),i, getResources());
		setContentView(R.layout.speedactivity);
		rLspeed = (RelativeLayout) findViewById(R.id.rLspeed);
		rLspeed.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER);
		rLspeed.addView(img);
		btnLoc = (Button) findViewById(R.id.btnmap);
		btnLoc.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				img.setallImage(v.getContext(),i, getResources());
				Function.StartSound(v.getContext(), i);
				i++;
			}
		});
		mlocManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		mlocListener = new MyLocationListener();
		mlocManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0,
				mlocListener);
		gp = mlocManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
		if (!gp == true) {
			turnGPSOn();
		}
	}
	private void turnGPSOn() {
		// TODO Auto-generated method stub
		String provider = Settings.Secure.getString(getParent()
				.getContentResolver(),
				Settings.Secure.LOCATION_PROVIDERS_ALLOWED);
		if (!provider.contains("gps")) {
			final Intent poke = new Intent();
			poke.setClassName("com.android.settings",
					"com.android.settings.widget.SettingsAppWidgetProvider");
			poke.addCategory(Intent.CATEGORY_ALTERNATIVE);
			poke.setData(Uri.parse("3"));
			sendBroadcast(poke);
		}
		
	}
	public class MyLocationListener implements LocationListener
	{

		
		public void onLocationChanged(Location location) {
			// TODO Auto-generated method stub
			speed = location.getSpeed();
			img.setallImage(getParent(),speed,getResources());
			lat = location.getLatitude();
			longi = location.getLongitude();
			GetMap.setLat(lat);
			GetMap.setLongi(longi);
			
		}

		@Override
		public void onProviderDisabled(String provider) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onProviderEnabled(String provider) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStatusChanged(String provider, int status, Bundle extras) {
			// TODO Auto-generated method stub
			
		}
		
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		turnOffGps();
		mlocManager.removeUpdates(mlocListener);
		Intent intent = new Intent();
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		finish();
		
	}
	private void turnOffGps() {
		// TODO Auto-generated method stub
		String provider = Settings.Secure.getString(getParent()
				.getContentResolver(),
				Settings.Secure.LOCATION_PROVIDERS_ALLOWED);
		if (provider.contains("gps")) {
			final Intent poke = new Intent();
			poke.setClassName("com.android.settings",
					"com.android.settings.widget.SettingsAppWidgetProvider");
			poke.addCategory(Intent.CATEGORY_ALTERNATIVE);
			poke.setData(Uri.parse("3"));
			sendBroadcast(poke);
		}
		
	}
	
	
	

}

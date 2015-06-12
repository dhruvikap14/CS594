package com.vinnig.tams;

import com.vinnig.tams.R;
import com.vinnig.tams.MyLocation.LocationResult;
import com.vinnig.tams.function.GetMap;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;

public class Splash extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		setContentView(R.layout.splash);
		 MyLocation myLocation = new MyLocation();
	     myLocation.getLocation(Splash.this, locationResult);
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(3000);
					Intent i = new Intent(Splash.this, Main.class);
					startActivity(i);
					finish();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}).start();
	}
	
	 public LocationResult locationResult = new LocationResult(){
	        @Override
	        public void gotLocation(final Location location){
	            try{
	        	String loc=location.toString();
	        	String[] temp_loc_data=loc.split(",");
	        	String[] lat = null,lon = null;
	        	double cut_lat_val = 0,cut_lon_val = 0;
	        	for(int lc=0;lc<temp_loc_data.length;lc++)
	        	{
	        		if(temp_loc_data[lc].contains("mLatitude")){
	        			lat=temp_loc_data[lc].split("=");
	        			cut_lat_val=Double.valueOf(lat[1]).doubleValue();
	        			
	        		}
	        		if(temp_loc_data[lc].contains("mLongitude")){
	        			lon=temp_loc_data[lc].split("=");
	        			cut_lon_val=Double.valueOf(lon[1]).doubleValue();
	        			
	        		}
	        		
	        	}
	        	
	        	
	        	GetMap.setLat(Double.valueOf(lat[1]).doubleValue());
	        	GetMap.setLongi(Double.valueOf(lon[1]).doubleValue());
	        	Log.i("latt",""+Double.valueOf(lat[1]).doubleValue());
	        	Log.i("lonn",""+Double.valueOf(lon[1]).doubleValue());
	        	
	            }catch(Exception e){
	            	
	            }
	        }
	    };
}
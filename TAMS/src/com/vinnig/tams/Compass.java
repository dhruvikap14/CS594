package com.vinnig.tams;

import com.vinnig.tams.R;
import com.vinnig.tams.function.Function;
import com.vinnig.tams.function.ImageCustome;

import android.app.Activity;
import android.hardware.SensorListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.RelativeLayout;

@SuppressWarnings("deprecation")
public class Compass extends Activity implements SensorListener {
	ImageCustome imagecustome;
	private RelativeLayout rL;
	private static final int sensor = SensorManager.SENSOR_ORIENTATION;
	private SensorManager sensorManager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		super.onCreate(savedInstanceState);

		imagecustome = new ImageCustome(getParent());

		setContentView(R.layout.compass);
		rL=(RelativeLayout)findViewById(R.id.l);
		rL.addView(imagecustome);
		
		sensorManager=(SensorManager)getSystemService(SENSOR_SERVICE);

	}

	
	public void onAccuracyChanged(int sensor, int accuracy) {
		// TODO Auto-generated method stub

	}

	
	public void onSensorChanged(int sensor, float[] values) {
		// TODO Auto-generated method stub
		if(sensor!=Compass.sensor)
		return;
		float orientation=values[0];
		imagecustome.setDirection(orientation);

	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		sensorManager.registerListener(this, sensor);
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		sensorManager.unregisterListener(this);
	}


	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		getParent().finishFromChild(Compass.this);
		
	}


	
	
	
	
	
	
	

}

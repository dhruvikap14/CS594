package com.vinnig.tams.function;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.vinnig.tams.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.BitmapFactory.Options;
import android.media.MediaPlayer;
import android.preference.PreferenceManager;
import android.util.Log;

public class Function {
	private static Options moption;
	private static MediaPlayer mp = null;

	public static double SpeedChanger(Context contex, double speed) {

		SharedPreferences mpefrence = PreferenceManager
				.getDefaultSharedPreferences(contex);
		String speedType = mpefrence.getString("speedunit", "Kms/Hr");
		if (speedType.equals("Kms/Hr")) {
			speed = speed * 3.6f;

		} else if (speedType.equals("M/s")) {

			speed = speed * 1;

		}

		return speed;
	}

	public static Bitmap DigitalConveter(String speed, Resources rs) {

		Bitmap bt = null, bt1 = null;
		String temp[] = speed.replace(".", " ").split(" ");
		moption = new BitmapFactory.Options();
		moption.inSampleSize = 2;
		moption.inPurgeable = true;
		for (int i = 0; i < temp[0].length(); i++) {
			if (i == 0) {
				if (temp[0].charAt(i) == '0') {
					bt = BitmapFactory.decodeResource(rs, R.drawable.zahl0,
							moption);
				} else if (temp[0].charAt(i) == '1') {
					bt = BitmapFactory.decodeResource(rs, R.drawable.zahl1,
							moption);
				} else if (temp[0].charAt(i) == '2') {
					bt = BitmapFactory.decodeResource(rs, R.drawable.zahl2,
							moption);
				} else if (temp[0].charAt(i) == '3') {
					bt = BitmapFactory.decodeResource(rs, R.drawable.zahl3,
							moption);
				} else if (temp[0].charAt(i) == '4') {
					bt = BitmapFactory.decodeResource(rs, R.drawable.zahl4,
							moption);
				} else if (temp[0].charAt(i) == '5') {
					bt = BitmapFactory.decodeResource(rs, R.drawable.zahl5,
							moption);
				} else if (temp[0].charAt(i) == '6') {
					bt = BitmapFactory.decodeResource(rs, R.drawable.zahl6,
							moption);
				} else if (temp[0].charAt(i) == '7') {
					bt = BitmapFactory.decodeResource(rs, R.drawable.zahl7,
							moption);
				} else if (temp[0].charAt(i) == '8') {
					bt = BitmapFactory.decodeResource(rs, R.drawable.zahl8,
							moption);
				} else if (temp[0].charAt(i) == '9') {
					bt = BitmapFactory.decodeResource(rs, R.drawable.zahl9,
							moption);
				}
			} else if (i == 1) {
				if (temp[0].charAt(i) == '0') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl0,
							moption);
					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '1') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl1,
							moption);
					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '2') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl2,
							moption);
					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '3') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl3,
							moption);
					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '4') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl4,
							moption);
					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '5') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl5,
							moption);
					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '6') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl6,
							moption);
					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '7') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl7,
							moption);
					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '8') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl8,
							moption);
					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '9') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl9,
							moption);
					bt = combineImage(bt, bt1);
				}
			} else if (i == 2) {
				if (temp[0].charAt(i) == '0') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl0,
							moption);
					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '1') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl1,
							moption);

					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '2') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl2,
							moption);

					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '3') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl3,
							moption);

					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '4') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl4,
							moption);

					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '5') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl5,
							moption);

					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '6') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl6,
							moption);

					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '7') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl7,
							moption);

					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '8') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl8,
							moption);

					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '9') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl9,
							moption);

					bt = combineImage(bt, bt1);
				}
			} else if (i == 3) {

				if (temp[0].charAt(i) == '0') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl0,
							moption);

					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '1') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl1,
							moption);

					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '2') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl2,
							moption);

					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '3') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl3,
							moption);

					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '4') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl4,
							moption);

					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '5') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl5,
							moption);

					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '6') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl6,
							moption);

					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '7') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl7,
							moption);

					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '8') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl8,
							moption);
					bt = combineImage(bt, bt1);
				} else if (temp[0].charAt(i) == '9') {
					bt1 = BitmapFactory.decodeResource(rs, R.drawable.zahl9,
							moption);
					bt = combineImage(bt, bt1);
				}

			}
		}

		return bt;
	}

	private static Bitmap combineImage(Bitmap bt, Bitmap bt1) {
		// TODO Auto-generated method stub
		Bitmap cs = null;
		int width, height = 0;
		if (bt.getWidth() > bt1.getWidth()) {
			width = bt.getWidth() + bt1.getWidth();
			height = bt.getHeight();
		} else {
			width = bt1.getWidth() + bt1.getWidth();
			height = bt.getHeight();

		}
		cs = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
		Canvas comboImage = new Canvas(cs);
		comboImage.drawBitmap(bt, 0f, 0f, null);
		comboImage.drawBitmap(bt1, bt.getWidth(), 0f, null);

		return cs;
	}

	public static void StartSound(Context contex, double speed) {
		// TODO Auto-generated method stub
		SharedPreferences pref = PreferenceManager
				.getDefaultSharedPreferences(contex);
		double restricNumber = Double.parseDouble(pref.getString("speednumber",
				"2000"));
		String sound = pref.getString("speedsound", "No sound");
		if (sound.equals("Tone1") && speed > restricNumber) {
			if (mp != null) {
				if (mp.isPlaying()) {
					mp.stop();

				}
				mp = MediaPlayer.create(contex, R.raw.beep);
				mp.setLooping(true);
				mp.start();

			}
		} else if (sound.equals("Tone2") && speed > restricNumber) {

			if (mp != null) {
				if (mp.isPlaying()) {
					mp.stop();
				}
			}
			mp = MediaPlayer.create(contex, R.raw.beep2);
			mp.setLooping(true);
			mp.start();
		} else if (sound.equals("No sound") && speed > restricNumber) {
			if (mp != null) {
				if (mp.isPlaying()) {
					mp.stop();
				}
			} else {
				mp = null;
			}

		} else if (speed < restricNumber) {
			if (mp != null) {
				if (mp.isPlaying()) {
					mp.stop();
				}
			} else {
				mp = null;
			}
		}

	}

	public static ArrayList<DBAdapter> getLocationInfo(String address) {
		// TODO Auto-generated method stub
		ArrayList<DBAdapter> aList=new ArrayList<DBAdapter>();
		StringBuilder stringBuilder = new StringBuilder();
		try {
		address = address.replaceAll(" ", "%20");
		HttpPost httppost = new HttpPost(
				"http://maps.google.com/maps/api/geocode/json?address="
						+ address + "&sensor=false");
		HttpClient client = new DefaultHttpClient();
		HttpResponse response;
		stringBuilder = new StringBuilder();
		
			response = client.execute(httppost);
			HttpEntity entity = response.getEntity();
			InputStream stream = entity.getContent();
			int b;
			while ((b = stream.read()) != -1) {
				stringBuilder.append((char) b);
			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			Log.i("getLocationInfo ClientProtocolException", e.toString());
			} catch (IOException e) {
			// TODO Auto-generated catch block
				Log.i("getLocationInfo IOException", e.toString());
			}
			JSONObject jsonObject = new JSONObject();
			try {
				jsonObject = new JSONObject(stringBuilder.toString());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				Log.i("getLocationInfo JSONException", e.toString());
			}
			aList = getLatLong(jsonObject);
		return aList;
	}

	private static ArrayList<DBAdapter> getLatLong(JSONObject jsonObject) {
		// TODO Auto-generated method stub
		ArrayList<DBAdapter> aList = new ArrayList<DBAdapter>();
		double longitute, latitude;
		try {
			longitute = ((JSONArray) jsonObject.get("results"))
			.getJSONObject(0).getJSONObject("geometry").getJSONObject(
					"location").getDouble("lng");
			latitude = ((JSONArray) jsonObject.get("results")).getJSONObject(0)
			.getJSONObject("geometry").getJSONObject("location")
			.getDouble("lat");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			longitute = 0;
			latitude = 0;
			Log.i("log_tag", e.getMessage());
		}
		DBAdapter db = new DBAdapter();
		db.setB(true);
		db.setLati(latitude);
		db.setLongi(longitute);
		aList.add(db);
		return aList;
	}
	public static void showMessagedailog(Context c,
			String string, final Activity ac) {
		// TODO Auto-generated method stub
	
		Dialog aleartDialog=new Dialog(c);
		AlertDialog.Builder custome=new AlertDialog.Builder(c);
		custome.setTitle("Alert");
		custome.setMessage(string);
		custome.setPositiveButton("Ok", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
				dialog.dismiss();
				ac.finish();
				
			}
		});
		custome.setNegativeButton("Cancel", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.dismiss();
			}
		});
		aleartDialog=custome.create();
		aleartDialog.setCancelable(true);
		aleartDialog.show();
		
	}
}

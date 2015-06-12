package com.vinnig.tams;

import java.util.ArrayList;
import java.util.Arrays;

import com.vinnig.tams.R;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.Preference.OnPreferenceClickListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Setting extends PreferenceActivity {
	ArrayList<String> speedunitlist= new ArrayList<String>();
	ArrayList<String> speednamelist= new ArrayList<String>();
	ArrayList<String> soundunit= new ArrayList<String>();
	ArrayList<String> soundname= new ArrayList<String>();
	TextView tvmessage;
	AlertDialog alertDialog_message;
	Button bt_ok;
	Context mContext;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preference);
		mContext=Setting.this;
		
		// alert dialog for info
		AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
		builder.setCancelable(true);

		
		LayoutInflater inflater = (LayoutInflater) mContext	.getSystemService(LAYOUT_INFLATER_SERVICE);
		View layout = inflater.inflate(R.layout.info, null);
		alertDialog_message = builder.create();
		alertDialog_message.setView(layout,0,0,0,0);
		alertDialog_message.setCanceledOnTouchOutside(true);
		alertDialog_message.setCancelable(true);
		
		String[] speedunit=getResources().getStringArray(R.array.values);
		String [] speedname=getResources().getStringArray(R.array.getvalues);
		String [] Soundunit=getResources().getStringArray(R.array.Soundvalues);
		String [] Soundname=getResources().getStringArray(R.array.getSoundvalue);
		
		speedunitlist.addAll(Arrays.asList(speedunit));
		speednamelist.addAll(Arrays.asList(speedname));
		soundunit.addAll(Arrays.asList(Soundunit));
		soundname.addAll(Arrays.asList(Soundname));
		
		
		final Preference pr1=(Preference)findPreference("speedunit");
		pr1.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
			
			@Override
			public boolean onPreferenceChange(Preference preference, Object newValue) {
				// TODO Auto-generated method stub
				pr1.setSummary(speednamelist.get(speednamelist.indexOf(newValue.toString())));
				
				return true;
			}
		});
		final Preference pr2=(Preference)findPreference("exit");
		pr2.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference preference) {
				// TODO Auto-generated method stub
				Setting.this.finish();
				return false;
			}
		});
		final Preference pr_info=(Preference)findPreference("info");
		pr_info.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
			@Override
			public boolean onPreferenceClick(Preference preference) {
				// TODO Auto-generated method stub
				if(!alertDialog_message.isShowing()){
					alertDialog_message.show();
				}
				return false;
			}
		});
		final Preference pr3=(Preference)findPreference("speedsound");
		pr3.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
			
			@Override
			public boolean onPreferenceChange(Preference preference, Object newValue) {
				// TODO Auto-generated method stub
				pr3.setSummary(soundname.get(soundunit.indexOf(newValue.toString())));
				
				return true;
			}
		});
		final Preference pr4=(Preference)findPreference("speedunit");
		pr4.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
			
			@Override
			public boolean onPreferenceChange(Preference preference, Object newValue) {
				// TODO Auto-generated method stub
				pr4.setSummary(newValue.toString());
				
				return true;
			}
		});
	}

}

package com.vinnig.tams;



import com.vinnig.tams.R;

import android.app.TabActivity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.LinearLayout.LayoutParams;

public class Main extends TabActivity {
	public static TabHost tabHost;
	public final static int HOME = 1;
	public final static int DIARY = 2;
	public final static int PROGRESS = 3;
	public final static int FRIENDS = 4;
	public final static int SHARE = 5;
	long transactionID = -1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mytab);
		MyView view;

		tabHost = getTabHost();
		TabHost.TabSpec spec;
		Intent intent;

		intent = new Intent().setClass(this, TabGroup1Activity.class);
		view=new MyView(this, R.drawable.speed_select, R.drawable.speed, "");
		view.setFocusable(true);
		spec=tabHost.newTabSpec("Main").setIndicator(view).setContent(intent);
		tabHost.addTab(spec);
		
		intent = new Intent().setClass(this, TabGroup2Activity.class);
		view=new MyView(this, R.drawable.map_select, R.drawable.map, "");
		view.setFocusable(true);
		spec=tabHost.newTabSpec("Map").setIndicator(view).setContent(intent);
		tabHost.addTab(spec);
		
		intent = new Intent().setClass(this, TabGroup3Activity.class);
		view=new MyView(this, R.drawable.compass_select, R.drawable.compass, "");
		view.setFocusable(true);
		spec=tabHost.newTabSpec("Compass").setIndicator(view).setContent(intent);
		tabHost.addTab(spec);
		
		intent = new Intent().setClass(this, AndroidFacebookConnectActivity.class);
		view=new MyView(this, R.drawable.setting_select, R.drawable.btn_login, "");
		view.setFocusable(true);
		spec=tabHost.newTabSpec("fb").setIndicator(view).setContent(intent);
		tabHost.addTab(spec);
		
		intent = new Intent().setClass(this, Setting.class);
		view=new MyView(this, R.drawable.setting_select, R.drawable.setting, "");
		view.setFocusable(true);
		spec=tabHost.newTabSpec("Setting").setIndicator(view).setContent(intent);
		tabHost.addTab(spec);
		
		
		tabHost.setCurrentTab(0);
		tabHost.getTabWidget().getChildAt(0).getLayoutParams().height = LayoutParams.WRAP_CONTENT;
		tabHost.getTabWidget().getChildAt(1).getLayoutParams().height = LayoutParams.WRAP_CONTENT;
		tabHost.getTabWidget().getChildAt(2).getLayoutParams().height = LayoutParams.WRAP_CONTENT;
		tabHost.getTabWidget().getChildAt(3).getLayoutParams().height = LayoutParams.WRAP_CONTENT;
		tabHost.getTabWidget().getChildAt(4).getLayoutParams().height = LayoutParams.WRAP_CONTENT;
		
		if (MyApplication.getFrom().equals("Main")) {
			tabHost.setCurrentTab(0);
		} else if (MyApplication.getFrom().equals("Map")) {
			tabHost.setCurrentTab(1);
		} else if (MyApplication.getFrom().equals("Compass")) {
			tabHost.setCurrentTab(2);
		} else if (MyApplication.getFrom().equals("Settings")) {
			tabHost.setCurrentTab(3);
		}
		else if (MyApplication.getFrom().equals("fb")) {
			tabHost.setCurrentTab(4);
		}
		
		int type=0;
		
		if(getIntent().getExtras()!=null)
		{	
			if(getIntent().getExtras().containsKey("from"))
			{
				type=getIntent().getExtras().getInt("from");
				
				switch(type)
				{
				case HOME:
					tabHost.setCurrentTab(0);
				case DIARY:
					tabHost.setCurrentTab(1);
				case PROGRESS:
					tabHost.setCurrentTab(2);
				case FRIENDS:
					tabHost.setCurrentTab(3);
				case SHARE:
					tabHost.setCurrentTab(4);
				default:
					tabHost.setCurrentTab(0);
				}
			}
			
		}
		

			
	}

	public  long getTransactionID()
	{
		return transactionID;
		
	}
	public void setTransactionID(long l)
	{
		transactionID = l;
	}
	public void switchTabSpecial(int tab)
	{
		tabHost.setCurrentTab(tab);
	}
	class ChangeTabReceiver extends BroadcastReceiver {
		@Override
		public void onReceive(Context context, Intent intent) {
			tabHost = getTabHost();
			tabHost.setCurrentTab(1);
		}
	}
	private class MyView extends LinearLayout {
		ImageView iv;

		public MyView(Context c, int drawable, int drawableselec, String label) {
			super(c);
			// TODO Auto-generated constructor stub
			iv = new ImageView(c);
			StateListDrawable listDrawable = new StateListDrawable();
			listDrawable.addState(SELECTED_STATE_SET, this.getResources()
					.getDrawable(drawable));
			listDrawable.addState(ENABLED_STATE_SET, this.getResources()
					.getDrawable(drawableselec));
			iv.setImageDrawable(listDrawable);
			iv.setBackgroundColor(Color.TRANSPARENT);
			iv.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
					LayoutParams.WRAP_CONTENT, (float) 0.0));
			iv.setPadding(0, 0, 0, 0);
			setGravity(Gravity.CENTER);
			addView(iv);
		}

	}
	@Override
	protected void onDestroy() {
		super.onDestroy();
		finish();
	}

}

package com.vinnig.tams;

import android.app.Application;

public class MyApplication extends Application {

	private static String from = "Home";

	public static String getFrom() {
		return from;
	}

	public static void setFrom(String from) {
		MyApplication.from=from;
	}

}

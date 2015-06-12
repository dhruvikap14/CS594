package com.vinnig.tams;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;

public class NetworkConnections{
	int status;
	public boolean internetConnection=false;
	Context mcontext;

public NetworkConnections(Context context){
	mcontext=context;
	internetConnection=checkInternetConnection();
	Log.i("NetworkManager",""+internetConnection);
}

public boolean checkInternetConnection(){
	 Boolean b=isUsingWiFi();
	 Boolean m=isUsingMobileData();
	 
		
	
	 if(b==false && m==false ){
		 return false;
	 }else{
		 
		 HttpResponse r=null;
		 HttpClient httpclient = new DefaultHttpClient();
	     HttpGet http = new HttpGet("http://www.google.co.in/");
	    
	     try {
			
			r =httpclient.execute(http);
			status=r.getStatusLine().getStatusCode();
			 if(status==200){
				 return true;
		     }
			 else{
				 return false;
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 return false;
			
		}
	    
	 }
	
	
}


public boolean isUsingMobileData() {
    ConnectivityManager connectivity = (ConnectivityManager) mcontext.getSystemService(Context.CONNECTIVITY_SERVICE);

    NetworkInfo mobileInfo = connectivity
            .getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

    if (mobileInfo.getState() == NetworkInfo.State.CONNECTED
            || mobileInfo.getState() == NetworkInfo.State.CONNECTING) {
        return true;
    }

    return false;
}
public boolean isUsingWiFi() {
    ConnectivityManager connectivity = (ConnectivityManager) mcontext.getSystemService(Context.CONNECTIVITY_SERVICE);

    NetworkInfo wifiInfo = connectivity
            .getNetworkInfo(ConnectivityManager.TYPE_WIFI);

    if (wifiInfo.getState() == NetworkInfo.State.CONNECTED
            || wifiInfo.getState() == NetworkInfo.State.CONNECTING) {
        return true;
    }

    return false;
}
}

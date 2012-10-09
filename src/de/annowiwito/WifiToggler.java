package de.annowiwito;

import android.app.Activity;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;

public class WifiToggler extends Activity {
	private static final String TAG = WifiToggler.class.getSimpleName();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Log.d(TAG, "Toggling WiFi state...");

		WifiManager wifiMgr = (WifiManager)getSystemService(WIFI_SERVICE);
		boolean currentState = wifiMgr.isWifiEnabled();
		wifiMgr.setWifiEnabled(!currentState);
		finish();
	}
}

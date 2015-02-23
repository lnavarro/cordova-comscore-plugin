package com.comscoreplugin;

import com.comscore.analytics.comScore;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONArray;

public class ComScorePlugin extends CordovaPlugin {

	public static final String TAG = "ComScorePlugin";
	public static final String SETCUSTOMERDATA = "setCustomerData";
	public static final String SETAPPNAME = "setAppName";
	public static final String SETAPPCONTEXT = "setAppContext";
	public static final String ONENTERFOREGROUND = "onEnterForeground";
	public static final String ONEXITFOREGROUND = "onExitForeground";
	public static final String AUTOUPDATEFOREGROUND = "autoUpdateForeground";
	public static final String AUTOUPDATEBACKGROUND = "autoUpdateBackground";
	public static final String START = "start";


	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

		boolean result = false;

		if (SETCUSTOMERDATA.equals(action)) {
			this.setCustomerData(args.getString(0), args.getString(1), callbackContext);
			result = true;
		}
		else if (SETAPPNAME.equals(action)) {
			this.setAppName(args.getString(0), callbackContext);
			result = true;
		}
		else if (SETAPPCONTEXT.equals(action)) {
			this.setAppContext(callbackContext);
			result = true;
		}
		else if (ONENTERFOREGROUND.equals(action)) {
			this.onEnterForeground(callbackContext);
			result = true;
		}
		else if (ONEXITFOREGROUND.equals(action)) {
			this.onExitForeground(callbackContext);
			result = true;
		}
		else if (AUTOUPDATEFOREGROUND.equals(action)) {
			Integer interval = Integer.parseInt(args.getString(0));
			this.autoUpdateForeground(interval, callbackContext);
			result = true;
		}
		else if (AUTOUPDATEBACKGROUND.equals(action)) {
			Integer interval = Integer.parseInt(args.getString(0));
			this.autoUpdateBackground(interval, callbackContext);
			result = true;
		}
		else if (START.equals(action)) {
			this.start(callbackContext);
			result = true;
		}


		return result;
	}

    @Override
    protected void pluginInitialize() {
		comScore.setAppContext(this.cordova.getContext());
		Log.v(TAG, "pluginInitialize setAppContext");
    }

	private void setCustomerData(String customerID, String customerKey, CallbackContext callbackContext) {
		comScore.setCustomerC2(customerID);
		Log.v(TAG, "setCustomerC2 " + customerID);
		comScore.setPublisherSecret(customerKey);
		Log.v(TAG, "setPublisherSecret " + customerKey);
		callbackContext.success("ok");
	}

	private void setAppName(String appName, CallbackContext callbackContext) {
		comScore.setAppName(appName);
		Log.v(TAG, "setAppName");
		callbackContext.success("ok");

	}

	private void setAppContext(CallbackContext callbackContext) {
		comScore.setAppContext(this.cordova.getContext());
		Log.v(TAG, "setAppContext");
		callbackContext.success("ok");
	}

	private void onEnterForeground(CallbackContext callbackContext) {
		comScore.onEnterForeground();
		Log.v(TAG, "onEnterForeground");
		callbackContext.success("ok");
	}

	private void onExitForeground(CallbackContext callbackContext) {
		comScore.onExitForeground();
		Log.v(TAG, "onExitForeground");
		callbackContext.success("ok");
	}

	private void autoUpdateForeground(Integer interval, CallbackContext callbackContext) {
		comScore.enableAutoUpdate(interval, true);
		Log.v(TAG, "autoUpdateForeground");
		callbackContext.success("ok");
	}

	private void autoUpdateBackground(Integer interval, CallbackContext callbackContext) {
		comScore.enableAutoUpdate(interval, false);
		Log.v(TAG, "autoUpdateBackground");
		callbackContext.success("ok");
	}

	private void start(CallbackContext callbackContext) {
		comScore.start();
		Log.v(TAG, "start");
		callbackContext.success("ok");
	}


}

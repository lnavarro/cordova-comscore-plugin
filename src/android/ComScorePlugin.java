package android;

import com.comscore.analytics.comScore;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;


public class ComScorePlugin extends CordovaPlugin {
	
	public boolean execute(String customerID, String customerKey, CallbackContext callbackContext) {
		this.setCustomerData(customerID, customerKey, callbackContext);
		return true;
	}
	
	private void setCustomerData(String customerID, String customerKey, CallbackContext callbackContext) {
		comScore.setCustomerC2(customerID);
		comScore.setPublisherSecret(customerKey);
	}
}
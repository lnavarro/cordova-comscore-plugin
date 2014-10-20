package android;

￼import com.comscore.analytics.comScore;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;


public class ComScorePlugin extends CordovaPlugin {
	
	public boolean execute(String customerID, String customerKey) {
		this.￼setCustomerData(customerID, customerKey);
		return false;
	}
	
	private void setCustomerData(String customerID, String customerKey) {
		comScore.setCustomerC2(customerID);
		comScore.setPublisherSecret(customerKey);
	}
}
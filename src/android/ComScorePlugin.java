//package android;
//
//import com.comscore.analytics.comScore;
//
//import org.apache.cordova.CordovaPlugin;
//import org.apache.cordova.CallbackContext;
//
//import org.json.JSONException;
//import org.json.JSONArray;
//
//
//public class ComScorePlugin extends CordovaPlugin {
//
//	@Override
//	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
//		this.setCustomerData(args.getString(0), args.getString(1), callbackContext);
//		return true;
//	}
//	
//	private void setCustomerData(String customerID, String customerKey, CallbackContext callbackContext) {
//		comScore.setCustomerC2(customerID);
//		comScore.setPublisherSecret(customerKey);
//	}
//}
function ComScorePlugin() {}

ComScorePlugin.prototype.setCustomerData = function (customerID, customerKey, success, error) {
	cordova.exec(success, error, customerID, customerKey);
}
	
module.exports = new ComScorePlugin();
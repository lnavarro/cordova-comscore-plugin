function ComScorePlugin() {}

ComScorePlugin.prototype.setCustomerData = function (customerID, customerKey, success, error) {
	cordova.exec(success, error, 'ComScorePlugin', 'setCustomerData', [customerID, customerKey]);
}
	
module.exports = new ComScorePlugin();
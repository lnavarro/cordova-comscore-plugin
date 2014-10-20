function ComScorePlugin() {}

ComScorePlugin.prototype.setCustomerData = function (customerID, customerKey) {
	cordova.exec(success, error, customerID, customerKey);
}
	

module.exports = new ComScorePlugin();
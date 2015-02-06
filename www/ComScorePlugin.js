

var ComScorePlugin = {
	setCustomerData: function (customerID, customerKey, success, error) {
		cordova.exec(success, error, 'ComScorePlugin', 'setCustomerData', [customerID, customerKey]);
	},
	setAppName: function(appName, success, error) {
		cordova.exec(success, error, 'ComScorePlugin', 'setAppName', [appName]);
	},
	setAppContext: function(success, error){
		cordova.exec(success, error, 'ComScorePlugin', 'setAppContext', []);
	},
	onEnterForeground: function (success, error) {
		cordova.exec(success, error, 'ComScorePlugin', 'onEnterForeground', []);
	},
	onExitForeground: function (success, error) {
		cordova.exec(success, error, 'ComScorePlugin', 'onExitForeground', []);
	},
	autoUpdateForeground: function (interval, success, error) {
		cordova.exec(success, error, 'ComScorePlugin', 'autoUpdateForeground', [interval]);
	},
	autoUpdateBackground: function (interval, success, error) {
		cordova.exec(success, error, 'ComScorePlugin', 'autoUpdateBackground', [interval]);
	},
	start: function (success, error) {
		cordova.exec(success, error, 'ComScorePlugin', 'start', []);
	}
};

module.exports = ComScorePlugin;

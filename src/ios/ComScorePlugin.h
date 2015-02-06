#import <Cordova/CDV.h>

@interface ComScorePlugin : CDVPlugin

- (void) setAppContext:(CDVInvokedUrlCommand*)command;
- (void) setCustomerData:(CDVInvokedUrlCommand*)command;
- (void) setAppName:(CDVInvokedUrlCommand*)command;
- (void) onEnterForeground:(CDVInvokedUrlCommand*)command;
- (void) onExitForeground:(CDVInvokedUrlCommand*)command;
- (void) autoUpdateForeground:(CDVInvokedUrlCommand*)command;
- (void) autoUpdateBackground:(CDVInvokedUrlCommand*)command;

@end

#import <Cordova/CDV.h>
#import "ComScorePlugin.h"
#import "CSComScore.h"

@implementation ComScorePlugin

- (void) pluginInitialize
{
    [CSComScore setAppContext];
}

- (void)setAppContext:(CDVInvokedUrlCommand*)command
{
    [CSComScore setAppContext];
}

- (void)setCustomerData:(CDVInvokedUrlCommand*)command
{

    NSString *customerId = [command.arguments objectAtIndex:0];
    NSString *customerKey = [command.arguments objectAtIndex:1];

    [CSComScore setCustomerC2: customerId];
    [CSComScore setPublisherSecret: customerKey];
}

- (void) setAppName:(CDVInvokedUrlCommand*)command
{
    NSString *appName = [command.arguments objectAtIndex:0];
    [CSComScore setAppName: appName];
}


- (void) onEnterForeground:(CDVInvokedUrlCommand*)command
{
    [CSComScore onEnterForeground];
}

- (void) onExitForeground:(CDVInvokedUrlCommand*)command
{
    [CSComScore onExitForeground];
}

- (void) autoUpdateForeground:(CDVInvokedUrlCommand*)command
{
    NSString *strIntervel = [command.arguments objectAtIndex:0];
    NSInteger interval = [strIntervel intValue];
    [CSComScore enableAutoUpdate:interval foregroundOnly:YES];
}

- (void) autoUpdateBackground:(CDVInvokedUrlCommand*)command
{
    NSString *strIntervel = [command.arguments objectAtIndex:0];
    NSInteger interval = [strIntervel intValue];
    [CSComScore enableAutoUpdate:interval foregroundOnly:NO];
}

@end

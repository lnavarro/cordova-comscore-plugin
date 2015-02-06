//
//  CSCacheFlusher.h
//  comScore
//
// Copyright 2014 comScore, Inc. All right reserved.
//

@class CSCore;

@interface CSCacheFlusher : NSObject {
    CSCore *_core;
    NSTimer *_timer;
    BOOL _isForeground;
}

- (id)initWithCore:(CSCore *)aCore;

- (void)start;

- (void)stop;

- (void)reset;
@end
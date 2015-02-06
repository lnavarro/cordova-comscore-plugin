//
// CSTaskExecutor.h
//
// Copyright 2014 comScore, Inc. All right reserved.
//
#import "CSCore.h"
/** Class implementing a task executor. All tasks will be
 * executed sequentially in the background */
@interface CSTaskExecutor : NSObject {
    dispatch_queue_t _queue;
    CSCore* _core;
}

/** Initializes the instance using gcd if available */
- (id)initWithCore:(CSCore *)core;

/** Executes the block immediately or if background was selected
 *  then it's added to the background task queue to be executed */
- (void)execute:(dispatch_block_t)block background:(BOOL)background;

/** Blocks the thread until all previous tasks are finished
 *
 *  WARNING, THIS CALL WILL BLOCK THE THREAD!!!!
 *
 *  Use with caution.
 */
- (void)waitForTasks;

@end

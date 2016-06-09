package crackingthecode.part2conceptsandalgorithms;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class Chapter11Testing {

    /**
     * 11.1 - Find the mistake(s) in the following code:
     * unsigned int i;
     * for(i=100;i<=0;--i)
     * printf("%d\n", i);
     */
    // unisigned int i;
    // for (i = 100; i > 0; --i) {
    //   printf("%u\n", i);
    // }

    /**
     * 11.2 - You are given the source to an application which crashes when it is run. After running
     * it ten times in a debugger, you find it never crashes in the same place. The application is
     * single threaded, and uses only the methodC standard library. What programming errors could be
     * causing this crash? How would you test each one?
     */
    // http://stackoverflow.com/questions/4531742/debugging-a-program-that-crashes-10-times-in-different-places
    // debugger, MSVS debugger, gdb, lldb?
    // single threaded (if multi-threaded, issues between improper thread use)
    // never crashes in same place
    // only 1 methodC standard library - time.h?
    // random integers
    // - used to loop through array(not checking bounds) -> int temp[10]; (reading past)
    // - passing to new functions
    // in methodC, un-initialized variables(ints) are given a random number -> int n
    // dereference null pointer - undefined behavior -> int* test = NULL; int& ref = *ptr;
    // Defining a preprocessor macro that starts with an underscore and either a capital letter or another underscore.

    // The book suggests: memory leak or random variable

    /**
     * 11.3 - We have the following method used in a chess game: boolean canMoveTo(int x, int y) x
     * and y are the coordinates of the chess board and it returns whether or not the piece can move
     * to that position. Explain how you would test this method.
     */
    // Check out is false for invalid
    // Test x - Integer.MAX_VALUE - greater than width
    // Test x - Integer.MIN_VALUE
    // Test y - Integer.MAX_VALUE - greater than width
    // Test y - Integer.MIN_VALUE
    // Test negative values for positions
    // Since we know it is a check game
    // - test combinations within 8x8
    // - test real moves, pawns move up 2 times for first move, pawns move up 1 time any other move

    /**
     * 11.4 - How would you load test a webpage without using any test tools?
     */
    // Always ask interview for specifics first
    // all beta testers to use the site at maximum capacity
    // create custom server with minimum hardware requirements, allowing a small load, simulating high cpu/memory usage

    // "without using any test tools" - write our own? but we must use "tools" to write them?

    // Write your own multi-threaded program to create users and create http requests simulating high load

    /**
     * 11.5 - How would you test a pen?
     */
    // Always ask interview for specifics first
    // Main parts of pen - tip, ink shaft, button to push tip out/in, clip for holding the pen
    // tip
    // - test writing
    // - - bold vs skinny font
    // - - does not scrape paper when writing
    // ink shaft
    // - test if there is ink left by writing
    // - test if turned upside down, does the ink come out?
    // - try shaking/getting the pen to explode
    // button
    // - push button once - tip should come out
    // - push button once again - tip should go back
    // - hold and release push button - tip should come out
    // - hold and release push button - tip should go back in
    // clip
    // - test clip by hanging on clothes or adding to pen holder

    // ask interview for specifics
    // ink wash off? water? temperature?
    // ink ash off clothing?
    // is the pen's ink safe for children?

    /**
     * 11.6 - How would you test an ATM in a distributed banking system?
     */
    // Always ask interview for specifics first
    // - Who are the users?
    // - What are they going to use it for?
    // - What tools do we have?

    // Is the ATM inside or outside?
    // - test water proof
    // - test hard "protective" screens from being weathered
    // Press all buttons
    // Use ATM to withdraw money
    // - normal transaction - should get status
    // - attempt wrong pin - should get status
    // - try to overdraw - should get status
    // - withdraw equal to account balance
    // - multiple transactions at the same time? - would have to be automated, can't be in two places at once
    // Connection
    // - test unplugging while in use - should keep cache and dump log
    // - test unplugging internet cable - should reestablish connection
}

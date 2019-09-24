package leetcode;

import java.util.concurrent.Semaphore;

/**
 * https://leetcode.com/problems/print-foobar-alternately/
 */
@SuppressWarnings("ClassCanBeStatic") // Leetcode is not static
public final class Problem1115PrintFooBarAlternately {
    public final class FooBar {
        private final Semaphore fooSemaphore = new Semaphore(0);
        private final Semaphore barSemaphore = new Semaphore(1);
        private int n;

        public FooBar(int n) {
            this.n = n;
        }

        public void foo(Runnable printFoo) throws InterruptedException {
            for (int i = 0; i < n; i++) {
                barSemaphore.acquire();
                printFoo.run();
                fooSemaphore.release();
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {
            for (int i = 0; i < n; i++) {
                fooSemaphore.acquire();
                printBar.run();
                barSemaphore.release();
            }
        }
    }
}

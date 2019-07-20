package leetcode;

import java.util.concurrent.Semaphore;

/**
 * https://leetcode.com/problems/print-in-order/
 */
@SuppressWarnings("ClassCanBeStatic") // Leetcode is not static
public final class Problem1114PrintInOrder {
    public final class Foo {
        private final Semaphore secondSemaphore = new Semaphore(0);
        private final Semaphore thirdSemaphore = new Semaphore(0);

        public void first(Runnable printFirst) {
            printFirst.run();

            secondSemaphore.release();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            secondSemaphore.acquire();

            printSecond.run();

            thirdSemaphore.release();
        }

        public void third(Runnable printThird) throws InterruptedException {
            thirdSemaphore.acquire();

            printThird.run();
        }
    }
}

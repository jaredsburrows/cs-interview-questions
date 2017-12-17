package crackingthecode.part3knowledgebased;

import java.util.concurrent.Semaphore;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
@SuppressWarnings("unused")
public final class Chapter18ThreadsAndLocks {
    /*
     * 18.1 - What’s the difference between a thread and a process?
     */
    // Process - This is an instance of a program. A process is made up of many threads, where each
    // process has it's own pid. Processes are independent of each other.

    // Thread - A thead is the path of execution of a process. A thread can do everything that a
    // process can. Requires less resources and no address space. Threads share the same address
    // space.

    /*
     * 18.2 - How can you measure the time spent in a context switch?
     */
    // Context Switch - http://stackoverflow.com/a/7443719/950427

    // The book says that context switches happen between processes

    // Have P1 wait for P2, when the context switch happens, the timestamp(p2) - timestamp(p1) would
    // be the context switch time.

    // Problems - we do not have control of kernel level context switches.

    /*
     * 18.3 - Implement a singleton design pattern as a template such that, for any given class Foo,
     * you can call Singleton::instance() and get a pointer to an instance of a singleton of type
     * Foo. Assume the existence of a class Lock which has acquire() and release() methods. How
     * could you make your implementation thread safe and exception safe?
     */
    // C++11
    //    #include <iostream>
    //
    //    using namespace std;
    //
    //    class Lock {
    //        public:
    //        Lock() { }
    //        ~Lock() { }
    //        void acquire() { }
    //        void release() { }
    //    };
    //
    //    template <class T>
    //    class Singleton {
    //        private:
    //            static Lock lock;
    //            static T* instance;
    //        protected:
    //            Singleton() { };
    //        public:
    //            static T* getInstance();
    //    };
    //
    //    template <class T>
    //    T* Singleton<T>::instance = nullptr;
    //
    //    template <class T>
    //    T* Singleton<T>::getInstance() {
    //        if (instance == nullptr) {
    //            lock.acquire();
    //            // If two threads simultaneously made this call, we need to make sure
    //            // the thread that acquired creates the instance.
    //            if (instance == nullptr) {
    //                instance = new T;
    //            }
    //
    //            lock.release();
    //        }
    //
    //        return instance;
    //    }
    //
    //    class Foo {
    //
    //    };
    //
    //    int main() {
    //
    //        Lock *f = Singleton<Lock>::getInstance();
    //
    //
    //        return 0;
    //    }

    /*
     * 18.4 - Design a class which provides a lock only if there are no possible deadlocks.
     */
    // question is too generic
    // lock for my class if there are no deadlocks?
    // can we use ThreadMXBean to check to dead locks?
    // are we checking the entire vm for deadlocks?

    /**
     * 18.5 - Suppose we have the following code: class Foo { public: A(.....); // If A is called, a
     * new thread will be created and the corresponding function will be executed. methodB(.....); //
     * same as above methodC(.....); // same as above } <p> Foo f; f.A(.....); f.methodB(.....);
     * f.methodC(.....); <p> i) Can you design a mechanism to make sure that methodB is executed after
     * A, and methodC is executed after methodB? <p> ii) Suppose we have the following code to use
     * class Foo. We do not know how the threads will be scheduled in the OS. <p> Foo f; f.A(.....);
     * f.methodB(.....); f.methodC(.....); f.A(.....); f.methodB(.....); f.methodC(.....); <p> Can you
     * design a mechanism to make sure that all the methods will be executed in sequence?
     */

    public interface MethodsToCall {
        void methodA() throws Exception;

        void methodB() throws Exception;

        void methodC() throws Exception;
    }

    // terrible example, call method after another
    public abstract static class MethodCall implements MethodsToCall {

        @Override
        public void methodA() {
            // super

            methodB();
        }

        @Override
        public void methodB() {
            // super

            methodC();
        }

        @Override
        public void methodC() {

        }
    }

    // i)
    public static class MethCallSemaphore implements MethodsToCall {

        private Semaphore mSemaphoreA = new Semaphore(0);
        private Semaphore mSemaphoreB = new Semaphore(0);

        @Override
        public void methodA() throws Exception {
            mSemaphoreA.release(1); // release, free up permit
        }

        @Override
        public void methodB() throws Exception {
            mSemaphoreA.acquire(1); // acquire permit
            mSemaphoreB.release(1); // release again
        }

        @Override
        public void methodC() throws Exception {
            mSemaphoreB.acquire(1); // acquire again
        }
    }

    // ii)
    public static class MethCallThreadSafeSemaphore implements MethodsToCall {

        private Semaphore mSemaphoreA = new Semaphore(0);
        private Semaphore mSemaphoreB = new Semaphore(0);
        private Semaphore mSemaphoreC = new Semaphore(1);

        @Override
        public void methodA() throws Exception {
            mSemaphoreC.acquire(1); // acquire permit
            mSemaphoreA.release(1); // release, free up permit
        }

        @Override
        public void methodB() throws Exception {
            mSemaphoreA.acquire(1); // acquire permit
            mSemaphoreB.release(1); // release again
        }

        @Override
        public void methodC() throws Exception {
            mSemaphoreB.acquire(1); // acquire again
            mSemaphoreC.release(1); // release, make sure called in order
        }
    }

    /**
     * 18.6 - You are given a class with synchronized method A, and a normal method C. If you have two
     * threads in one instance of a program, can they call A at the same time? Can they call A and C
     * at the same time?
     */
    @SuppressWarnings("EmptyMethod")
    public static class SomeSyncMethods {

        public synchronized void methodA() {

        }

        public void methodC() {

        }
    }

    // Two different threads that attempt to call method A at the sametime, the "synchonized" will
    // prevent both threads from making the call, only allowing one thread at a time

    // Both threads can call method A at the same time

    // If one thread called method A and another called method C, normal behavior.
}

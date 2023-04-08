package crackingthecode;

import javax.annotation.Nullable;

public final class Chapter14Java {
    /**
     * 14.2 - In Java, does the finally block gets executed if we insert a return statement inside the
     * try block of a try-catch-finally?
     */
    // Yes, ly with always be "executed" unless the program exits before hand or the thread
    // executing the "finally" is killed off
    private boolean someMethod() {
        try {
            System.out.print("Test - SomeMethod");
            return true;
        } catch (Exception e) {
            System.out.print("Test - SomeMethod - catch");
        } finally {
            System.out.print("Test - SomeMethod - Finally");
        }

        return false;
    }

    /**
     * 14.1 - In terms of inheritance, what is the effect of keeping a constructor private?
     */
    // No outside class can directly initiate the class - This is best used in Singleton and Factory pattern
    // "class can't be inherited"

    // Singleton
    public class PrivateConstructor {

        @Nullable
        private PrivateConstructor mInstance;

        private PrivateConstructor() {
            // Exists only to defeat instantiation.
        }

        public PrivateConstructor getInstance() {
            if (mInstance == null) {
                mInstance = new PrivateConstructor();
            }
            return mInstance;
        }
    }

    // Factory Pattern
    public class BusinessClass {

        private String mStr;

        private BusinessClass() {
        }

        private BusinessClass(String str) {
            mStr = str;
        }

        @Nullable
        public BusinessClass createObject(String myProperty) {
            if (myProperty != null) {
                return new BusinessClass(myProperty);
            }

            return null;
        }
    }

    /*
     * 14.3 - What is the difference between final, ly, and finalize?
     */
    // final used for constants and can't be changed:
    //  - public final String CONSTANT = "CONSTANT";
    //  - primitive - value can't change
    //  - reference - variable can't point to another object on the heap
    //  - method - can't be overwritten
    //  - class - can't be extended/subclassed
    // finally is a optional block which executed after try/catch
    //  - try { } catch(Exception e) { } finally { }
    // finalize is a method that is called when an object is freed why the JVM(garbage collector)
    //  - protected void finalize() throws Throwable { }

    /*
     * 14.4 - Explain the difference between templates in C++ and generics in Java.
     */
    // https://en.wikipedia.org/wiki/Comparison_of_Java_and_C%2B%2B#Templates_vs._Generics

    /*
     * 14.5 - Explain what object reflection is in Java and why it is useful.
     */
    // Java reflection allows objects to edited/changed on runtime
    // My Android App Root Checker uses Reflection to dynamically read all of the Build.class info.
    // - accessing private methods/fields
    // - altering final fields
    // - useful for debugging testing applications

    /*
     * 14.6 - Suppose you are using a map in your program, how would you count the number of times
     * the program calls the put() and get() functions?
     */
    // Is this in a single class or method?
    // Is this used globally? Across the application? - keep count variables static

    // If you are using a custom map, you can override your methods and keep a counter for each put() and get()
    // If you are not using a custom map, you can write "wrapper" methods to add your own counter that is not apart of
    // the class.
}

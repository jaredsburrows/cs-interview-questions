package crackingthecode.part3knowledgebased;

public class Chapter13CPlusPlus {

    /**
     * 13.1 - Write a method to print the last K lines of an input file using C++.
     */

    /**
     * 13.2 - Compare and contrast a hash table vs. an STL map. How is a hash table implemented? If
     * the number of inputs is small, what data structure options can be used instead of a hash
     * table?
     */

    /**
     * 13.3 - How do virtual functions work in C++?
     */

    /**
     * 13.4 - What is the difference between deep copy and shallow copy? Explain how you would use
     * each.
     */

    /**
     * 13.5 - What is the significance of the keyword “volatile” in C?
     */

    /**
     * 13.6 - What is name hiding in C++?
     */
    // Name hiding in C++ is when a function is redfined in the child/subclass that is already
    // defined with a different in the base/parent class with a different return value, instead of
    // different parameters which would be overloading
    // Override the name hiding behavior with "using CLASS::FUNCTION"
    // So when extending a class with overloaded methods, you must implement them all.

    // class FirstClass {
    // public:
    //  virtual void MethodA (int);
    //  virtual void MethodA (int, int);
    // };
    // void FirstClass::MethodA (int i) {
    //  std::cout << “ONE!!\n”;
    // }
    // void FirstClass::MethodA (int i, int j) {
    //  std::cout << “TWO!!\n”;
    // }

    // class SecondClass : public FirstClass {
    // public:
    //  void MethodA (int);
    // };
    // void SecondClass::MethodA (int i) {
    //  std::cout << “THREE!!\n”;
    // }
    // void main () {
    //  SecondClass a;
    //  a.MethodA (1);
    //  a.MethodA (1, 1);
    // }

    /**
     * 13.7 - Why does a destructor in base class need to be declared virtual?
     */
    // Base classes need a virtual deconstructor because new child/subclasses of this class need to
    // override the deconstructor to make sure they are freeing the new resources added in.

    /**
     * 13.8 - Write a method that takes a pointer to a Node structure as a parameter and returns a
     * complete copy of the passed-in data structure. The Node structure contains two pointers to
     * other Node structures.
     */

    /**
     * 13.9 - Write a smart pointer (smart_ptr) class.
     */
}

#ifndef SWAP_H
#define SWAP_H

template <typename T>
class swap {
  public:
    static void swap(T& a, T& b) {
        const T temp = a;
        a = b;
        b = temp;
    }
};

#endif

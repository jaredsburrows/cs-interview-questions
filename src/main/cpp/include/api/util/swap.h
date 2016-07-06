#ifndef SWAP_H
#define SWAP_H

template <typename T>
class swap {
    public:
    static void swap(const T& a, const T& b) {
        const T temp = a;
        a = b;
        b = temp;
    }
};

#endif

template <typename T>
class Swap {
    public:
    static void swap(T& a, T& b) {
        T temp = a;
        a = b;
        b = temp;
    }
};

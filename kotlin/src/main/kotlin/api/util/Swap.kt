package api.util

class Swap {
    companion object {
        fun <T> swap(array: Array<T>, left: Int, right: Int) {
            val temp: T = array[left]
            array[left] = array[right]
            array[right] = temp
        }
    }
}

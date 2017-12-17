package leetcode

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Problem412FizzBuzz {
    // Time - O(N), Space - O(N)
    fun fizzBuzz(n: Int): List<String> {
        val words = arrayListOf<String>()
        for (i in 0 .. n) {
            if (i % 3 == 0 && i % 5 ==0) {
                words.add("FizzBuzz")
            } else if (i % 3 == 0) {
                words.add("Fizz")
            } else if (i % 5 == 0) {
                words.add("Buzz")
            } else {
                words.add(i.toString())
            }

        }

        return words
    }
}

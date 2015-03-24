package questions.Math;

public class PalindromeNumber {
    public static boolean isPalindrome(long number) {
        if (number < 0) {
            return false;
        }

        long originalNumber = number;
        long reverseNumber = 0;

        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }

        return originalNumber == reverseNumber;
    }
}

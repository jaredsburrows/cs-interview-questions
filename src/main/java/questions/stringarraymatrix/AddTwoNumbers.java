package questions.stringarraymatrix;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class AddTwoNumbers {

    /**
     * You are given two linked lists representing two non-negative numbers. The digits are stored
     * in reverse order and each of their nodes contain a single digit. Add the two numbers and
     * return it as a linked list.
     * <p>
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     */
    // node1 and node2 numbers are stored forwards
    // the answer node is backwards
//    public static Node<Integer> addTwoNumbers(Node<Integer> node, Node<Integer> node2) {
//        if (node == null || node2 == null) {
//            return null;
//        }
//
//        final Node<Integer> answer = new Node<>(0);
//        Node<Integer> head = answer;
//        int carry = 0;
//
//        while (node != null || node2 != null) {
//            if (node != null) {
//                carry += node.value;
//                node = node.next;
//            }
//
//            if (node2 != null) {
//                carry += node2.value;
//                node2 = node2.next;
//            }
//
//            head.next = new Node<>(carry % 10);
//            head = head.next;
//            carry /= 10;
//        }
//
//        if (carry == 1) {
//            head.next = new Node<>(1);
//        }
//
//        return answer.next;
//    }
    public static String addTwoNumbers(final String left, final String right) {
        if (left == null && right == null) {
            return null;
        }

        if (left == null) {
            return right;
        }

        if (right == null) {
            return left;
        }

        final int leftLength = left.length() - 1;
        final int rightLength = right.length() - 1;
        final int max = leftLength > rightLength ? leftLength : rightLength;
        final StringBuilder sum = new StringBuilder(max);

        int indexLeft = leftLength;
        int indexRight = rightLength;

        int carry = 0;

        while (indexLeft >= 0 || indexRight >= 0) {

            if (indexLeft >= 0) {
                carry += left.charAt(indexLeft) - '0';
                indexLeft--;
            }

            if (indexRight >= 0) {
                carry += right.charAt(indexRight) - '0';
                indexRight--;
            }

            final int lastInt = carry % 10;
            sum.append(lastInt);
            carry = carry / 10;
        }

        if (carry == 1) {
            sum.append(1);
        }

        return sum.reverse().toString();
    }
}

package crackingthecode.part1datastructures
import crackingthecode.part1datastructures.Chapter3StacksAndQueues.MinStack
import spock.lang.Specification

class Chapter3StacksAndQueuesSpec extends Specification {

    def "Test - getMinimum [Correct Values]"() {
        MinStack minStack = new MinStack();

        // 4 2 3 1 - min 1
        // 4 2 3   - min 2
        // 4 2     - min 2
        // 4       - min 4

        expect:
        minStack.push(4);
        minStack.getMinimum() == 4;
        minStack.push(2);
        minStack.getMinimum() == 2;
        minStack.push(3);
        minStack.getMinimum() == 2;
        minStack.push(1);
        minStack.getMinimum() == 1;

        minStack.pop() == 1
        minStack.getMinimum() == 2;
        minStack.pop();
        minStack.getMinimum() == 2;
        minStack.pop();
        minStack.getMinimum() == 4;
    }

}

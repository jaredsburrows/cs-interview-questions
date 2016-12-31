package crackingthecode.part1datastructures

import crackingthecode.part1datastructures.Chapter3StacksAndQueues.MinStack
import crackingthecode.part1datastructures.Chapter3StacksAndQueues.MyQueue
import crackingthecode.part1datastructures.Chapter3StacksAndQueues.SetOfStacks
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class Chapter3StacksAndQueuesSpec extends BaseSpec {

    def "test MinStack"() {
        given:
        def minStack = new MinStack()

        // 4 2 getMinNode 1
        // 4 2 3   - getMinNode 2
        // 4 2     - getMinNode 2
        // 4       - getMinNode 4

        expect:
        minStack.push(4)
        minStack.getMinimum() == 4
        minStack.push(2)
        minStack.getMinimum() == 2
        minStack.push(3)
        minStack.getMinimum() == 2
        minStack.push(1)
        minStack.getMinimum() == 1

        minStack.pop() == 1
        minStack.getMinimum() == 2
        minStack.pop()
        minStack.getMinimum() == 2
        minStack.pop()
        minStack.getMinimum() == 4
    }

    def "test SetOfStacks"() {
        given:
        def setOfStacks = new SetOfStacks<>(3)

        when:
        setOfStacks.pop() == null
        setOfStacks.push(1)
        setOfStacks.push(2)
        setOfStacks.push(3)

        then:
        setOfStacks.pop() == 3

        when:
        setOfStacks.push(1)
        setOfStacks.push(2)
        setOfStacks.push(3)

        then:
        setOfStacks.pop() == 3
        setOfStacks.pop() == 2
        setOfStacks.pop() == 1
        setOfStacks.pop() == 2
        setOfStacks.pop() == 1
        setOfStacks.pop() == null

        when:
        setOfStacks.pop() == null
        setOfStacks.push(1)
        setOfStacks.push(2)
        setOfStacks.push(3)
        setOfStacks.push(4)
        setOfStacks.push(5)
        setOfStacks.push(6)

        then:
        setOfStacks.popAt(0) == 3
    }

    def "test MyQueue<T>"() {
        given:
        def myQueue = new MyQueue<>()

        when:
        myQueue.push(1)
        myQueue.push(5)
        myQueue.push(7)
        myQueue.push(0)
        myQueue.push(5)
        myQueue.push(6)

        then:
        myQueue.size() == 6
        myQueue.peek() == 1
        myQueue.remove() == 1
        myQueue.remove() == 5
        myQueue.remove() == 7

        then:
        myQueue.size() == 3
        myQueue.peek() == 0
        myQueue.push(2)
        myQueue.push(9)

        then:
        myQueue.size() == 5
        myQueue.peek() == 0
        myQueue.remove() == 0
        myQueue.remove() == 5
        myQueue.remove() == 6
        myQueue.remove() == 2
        myQueue.remove() == 9
    }

    def "test getSortedStack"() {
        given:
        def unsorted = new Stack<>()
        unsorted.push(1)
        unsorted.push(5)
        unsorted.push(7)
        unsorted.push(0)
        unsorted.push(5)
        unsorted.push(6)

        def sorted = new Stack<>()
        sorted.push(0)
        sorted.push(1)
        sorted.push(5)
        sorted.push(5)
        sorted.push(6)
        sorted.push(7)

        when:
        def result = Chapter3StacksAndQueues.getSortedStack(unsorted)

        then:
        result == sorted
    }
}

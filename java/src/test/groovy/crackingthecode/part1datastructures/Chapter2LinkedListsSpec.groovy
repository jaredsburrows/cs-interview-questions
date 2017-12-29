package crackingthecode.part1datastructures

import api.Node
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class Chapter2LinkedListsSpec extends BaseSpec {
    def "removeDuplicates"() {
        given:
        def node = new Node<>(1)
        node.next = new Node<>(0)
        node.next.next = new Node<>(1)
        node.next.next.next = new Node<>(4)
        node.next.next.next.next = new Node<>(5)
        node.next.next.next.next.next = new Node<>(4)

        when:
        Chapter2LinkedLists.removeDuplicates(null)
        Chapter2LinkedLists.removeDuplicates(node)

        then:
        node.value == 1
        node.next.value == 0
        node.next.next.value == 4
        node.next.next.next.value == 5
    }

    def "removeDuplicates2"() {
        given:
        def node = new Node<>(1)
        node.next = new Node<>(0)
        node.next.next = new Node<>(1)
        node.next.next.next = new Node<>(4)
        node.next.next.next.next = new Node<>(5)
        node.next.next.next.next.next = new Node<>(4)

        when:
        Chapter2LinkedLists.removeDuplicates2(null)
        Chapter2LinkedLists.removeDuplicates2(node)

        then:
        node.value == 1
        node.next.value == 0
        node.next.next.value == 4
        node.next.next.next.value == 5
    }

    def "removeDuplicates2 - no buffer - online"() {
        given:
        def node = new Node<>(1)
        node.next = new Node<>(0)
        node.next.next = new Node<>(1)
        node.next.next.next = new Node<>(4)
        node.next.next.next.next = new Node<>(5)
        node.next.next.next.next.next = new Node<>(4)

        when:
        Chapter2LinkedLists.removeDuplicates3(null)
        Chapter2LinkedLists.removeDuplicates3(node)

        then:
        node.value == 1
        node.next.value == 0
        node.next.next.value == 4
        node.next.next.next.value == 5
    }

    def "deleteDupsC - book"() {
        given:
        def node = new Node<>(1)
        node.next = new Node<>(0)
        node.next.next = new Node<>(1)
        node.next.next.next = new Node<>(4)
        node.next.next.next.next = new Node<>(5)
        node.next.next.next.next.next = new Node<>(4)

        when:
        Chapter2LinkedLists.deleteDupsC(null)
        Chapter2LinkedLists.deleteDupsC(node)

        then:
        node.value == 1
        node.next.value == 0
        node.next.next.value == 4
        node.next.next.next.value == 5
    }

    def "findNthLastElement"() {
        def node = new Node<>(0)
        node.next = new Node<>(1)
        node.next.next = new Node<>(2)
        node.next.next.next = new Node<>(3)
        node.next.next.next.next = new Node<>(4)
        node.next.next.next.next.next = new Node<>(5)

        expect:
        Chapter2LinkedLists.findNthLastElement(null, 6) == null
        Chapter2LinkedLists.findNthLastElement(node, 0) == null
        Chapter2LinkedLists.findNthLastElement(node, 6).value == 0
        Chapter2LinkedLists.findNthLastElement(node, 5).value == 1
        Chapter2LinkedLists.findNthLastElement(node, 4).value == 2
        Chapter2LinkedLists.findNthLastElement(node, 3).value == 3
        Chapter2LinkedLists.findNthLastElement(node, 2).value == 4
        Chapter2LinkedLists.findNthLastElement(node, 1).value == 5
    }

    def "deleteMiddleNode"() {
        given:
        def node1 = new Node<>("a" as Character)
        node1.next = new Node<>("b" as Character)
        node1.next.next = new Node<>("c" as Character)
        node1.next.next.next = new Node<>("d" as Character)
        node1.next.next.next.next = new Node<>("e" as Character)

        when:
        Chapter2LinkedLists.deleteMiddleNode(null)
        Chapter2LinkedLists.deleteMiddleNode(node1.next.next)

        then:
        node1.value == "a"
        node1.next.value == "b"
        node1.next.next.value == "d"
        node1.next.next.next.value == "e"
    }

    def "addTwoLists"() {
        given:
        // book
        // 315 + 592 = 808
        def book1 = new Node<>(3)
        book1.next = new Node<>(1)
        book1.next.next = new Node<>(5)

        def book2 = new Node<>(5)
        book2.next = new Node<>(9)
        book2.next.next = new Node<>(2)

        // programming geeks
        // 342 + 465 = 807
        def pg = new Node<>(2)
        pg.next = new Node<>(4)
        pg.next.next = new Node<>(3)

        def pg2 = new Node<>(5)
        pg2.next = new Node<>(6)
        pg2.next.next = new Node<>(4)

        // from 3 to 4 digits
        // 999 + 999 = 1998
        def nine = new Node<>(9)
        nine.next = new Node<>(9)
        nine.next.next = new Node<>(9)

        expect:
        Chapter2LinkedLists.addTwoLists(null, nine) == null
        Chapter2LinkedLists.addTwoLists(nine, null) == null
        Chapter2LinkedLists.addTwoLists(null, null) == null

        def result = Chapter2LinkedLists.addTwoLists(book1, book2)
        result.value == 8
        result.next.value == 0
        result.next.next.value == 8

        def result2 = Chapter2LinkedLists.addTwoLists(pg, pg2)
        result2.value == 7
        result2.next.value == 0
        result2.next.next.value == 8

        def result3 = Chapter2LinkedLists.addTwoLists(nine, nine)
        result3.value == 8
        result3.next.value == 9
        result3.next.next.value == 9
        result3.next.next.next.value == 1
    }

    //           D -> E
    //           |    |
    // A -> B -> C  <-
    // input: A -> B -> C -> D -> E -> C [the same C as earlier]
    def "getCircular - true"() {
        given:
        def nodeA = new Node<>(0)
        def nodeB = new Node<>(1)
        def nodeC = new Node<>(2)
        def nodeD = new Node<>(3)
        def nodeE = new Node<>(4)

        nodeA.next = nodeB
        nodeB.next = nodeC
        nodeC.next = nodeD
        nodeD.next = nodeE
        nodeE.next = nodeC

        when:
        def nullResult = Chapter2LinkedLists.getCircular(null)
        def result = Chapter2LinkedLists.getCircular(nodeA)

        then:
        !nullResult
        result.value == 3
    }

    def "getCircular - false"() {
        given:
        //       n4 <- n3
        //        |     |
        // n0 -> n1 -> n2
        def node0 = new Node<>(0)
        def node1 = new Node<>(1)
        def node2 = new Node<>(2)
        def node3 = new Node<>(3)
        def node4 = new Node<>(4)

        node0.next = node1
        node1.next = node2
        node2.next = node3
        node3.next = node4

        when:
        def nullResult = Chapter2LinkedLists.getCircular(null)
        def result = Chapter2LinkedLists.getCircular(node0)

        then:
        !nullResult
        !result
    }
}

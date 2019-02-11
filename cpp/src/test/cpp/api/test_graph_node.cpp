#include <gtest/gtest.h>

#include "api/graph_node.h"

TEST(graphnode, test_default_values) {
    GraphNode<int> sut;
    sut.value = 123;

    int expected = 123;
    int actual = sut.value;

    ASSERT_EQ(expected, actual);
}

TEST(graphnode, test_getters_settings) {
    GraphNode<int> next;
    next.value = 123;

    GraphNode<int> sut;
    sut.next = &next;

    int expected = 123;
    int actual = sut.next->value;

    ASSERT_EQ(expected, actual);
}

TEST(graphnode, test_equals) {
    GraphNode<int> node;
    node.value = 123;

    GraphNode<int> left;
    left.value = 123;
    left.next = &node;

    GraphNode<int> right;
    right.value = 123;
    right.next = &node;

//    ASSERT_EQ(&left, &right);
}

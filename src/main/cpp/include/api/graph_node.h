#ifndef GRAPHNODE_H
#define GRAPHNODE_H

#include <iostream>

template <typename T>
class GraphNode {
  public:
    T value;
    GraphNode<T>* next;
    GraphNode<T>* previous;
    GraphNode<T>() = default;
    GraphNode<T>(const T& value) : value(value) { }
//        GraphNode(GraphNode<T>* next, T const& copy);   // copy
//        GraphNode(GraphNode<T>* next, T&& move);        // move
//        template<typename... Args>
//        GraphNode(GraphNode<T>* next, Args... args);    // emplace data
    bool operator==(const GraphNode<T>&) const;
    friend std::ostream& operator<<(const std::ostream&, const GraphNode<T>&);
};

#endif

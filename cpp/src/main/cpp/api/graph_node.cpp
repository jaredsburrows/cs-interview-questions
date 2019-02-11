#include <iostream>

#include "api/graph_node.h"

template <typename T>
bool GraphNode<T>::operator==(GraphNode<T>& object) {
    if (this == object) {
        return true;
    }

    if (object == nullptr) {
        return false;
    }

    GraphNode<T>* node = (GraphNode<T>*) object;

    if (value != nullptr ? !value == node->value : node->value != nullptr) {
        return false;
    }

    if (next != nullptr ? !next == node->next : node->next != nullptr) {
        return false;
    }

    return previous != nullptr ? previous == node->previous : node->previous == nullptr;
}

template <typename T>
std::ostream& operator<<(std::ostream& strm, GraphNode<T>& object) {
    return strm << "GraphNode{"
           << "value=" << object->value
           << ", next=" << object->next
           << ", neighbors=" << object->neighbors
           << ", visited=" << object->visited
           << '}';
}

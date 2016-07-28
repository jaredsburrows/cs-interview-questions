#include <iostream>

#include "api/graph_node.h"

template <typename T>
bool GraphNode<T>::operator==(const GraphNode<T>& object) const {
    if (this == object) {
        return true;
    }

    if (object == nullptr) {
        return false;
    }

    const GraphNode<T>* node = (GraphNode<T>*) object;

    if (this->value != nullptr ? !this->value == node->value : node->value != nullptr) {
        return false;
    }

    if (this->next != nullptr ? !this->next == node->next : node->next != nullptr) {
        return false;
    }

    return this->previous != nullptr ? this->previous == node->previous : node->previous == nullptr;
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

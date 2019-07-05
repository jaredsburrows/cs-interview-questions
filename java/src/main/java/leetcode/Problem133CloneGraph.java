package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import leetcode.api.UndirectedGraphNode;

/**
 * https://leetcode.com/problems/clone-graph
 */
// TODO fix on leetcode? UndirectedGraphNode is now a Node with neighbors
public final class Problem133CloneGraph {
    public UndirectedGraphNode loneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }

        UndirectedGraphNode headNode = new UndirectedGraphNode(node.label);
        if (node.neighbors.isEmpty()) {
            return headNode;
        }

        Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
        map.put(node, headNode);

        Deque<UndirectedGraphNode> queue = new ArrayDeque<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            UndirectedGraphNode currentNode = queue.poll();

            for (UndirectedGraphNode neighborNode : currentNode.neighbors) {
                if (!map.containsKey(neighborNode)) {
                    map.put(neighborNode, new UndirectedGraphNode(neighborNode.label));
                    queue.offer(neighborNode);
                }

                map.get(currentNode).neighbors.add(map.get(neighborNode));
            }
        }

        return headNode;
    }
}

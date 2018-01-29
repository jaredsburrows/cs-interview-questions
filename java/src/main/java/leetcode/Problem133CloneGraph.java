package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import leetcode.api.UndirectedGraphNode;

/**
 * https://leetcode.com/problems/clone-graph/description
 */
public final class Problem133CloneGraph {
    public static UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }

        final UndirectedGraphNode headNode = new UndirectedGraphNode(node.label);
        if (node.neighbors == null || node.neighbors.isEmpty()) {
            return headNode;
        }

        final Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
        map.put(node, headNode);

        final Deque<UndirectedGraphNode> queue = new ArrayDeque<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            final UndirectedGraphNode currentNode = queue.poll();

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

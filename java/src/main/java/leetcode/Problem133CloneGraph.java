package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import leetcode.api.Node;

/**
 * https://leetcode.com/problems/clone-graph
 */
public final class Problem133CloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Node headNode = new Node(node.val, new ArrayList<>());
        if (node.neighbors.isEmpty()) {
            return headNode;
        }

        Map<Node, Node> map = new HashMap<>();
        map.put(node, headNode);

        Deque<Node> queue = new ArrayDeque<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            for (Node neighborNode : currentNode.neighbors) {
                if (!map.containsKey(neighborNode)) {
                    map.put(neighborNode, new Node(neighborNode.val, new ArrayList<>()));
                    queue.offer(neighborNode);
                }

                map.get(currentNode).neighbors.add(map.get(neighborNode));
            }
        }

        return headNode;
    }
}

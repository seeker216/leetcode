package a0133cloneGraph;

import dataStruc.Node;

import java.util.ArrayList;
import java.util.HashMap;

public class first0133 {
}
class Solution {
    private HashMap<Node,Node> visited=new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node==null)
            return null;
        if (visited.containsKey(node))
            return visited.get(node);
        Node cloneNode=new Node(node.val,new ArrayList<>());
        visited.put(node,cloneNode);
        for (Node n:node.neighbors){
            cloneNode.neighbors.add(cloneGraph(n));
        }
        return cloneNode;
    }
}
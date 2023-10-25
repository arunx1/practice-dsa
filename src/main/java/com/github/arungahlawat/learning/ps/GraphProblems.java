package com.github.arungahlawat.learning.ps;

import com.github.arungahlawat.learning.dataStructures.Graph;
import com.github.arungahlawat.learning.dataStructures.GraphNode;
import com.github.arungahlawat.learning.dataStructures.Queue;

public class GraphProblems extends Graph {

    public boolean pathBetweenNodesExistUsingBreadthFirstSearch(Graph graph, GraphNode startNode, GraphNode endNode) {
        if (startNode == endNode)
            return true;
        graph.unmarkVisited();
        Queue<GraphNode> queue = new Queue<>();
        queue.insert(startNode);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove();
            if (currentNode != null) {
                for (GraphNode adjacentNode : currentNode.adjacent) {
                    if (!adjacentNode.visited) {
                        if (adjacentNode == endNode)
                            return true;
                        else {
                            queue.insert(adjacentNode);
                        }
                    }
                }
                currentNode.visited = true;
            }
        }
        return false;
    }

    public void traverseGraph(Graph graph){
        graph.unmarkVisited();
        for (GraphNode rootNode : graph.nodes){
            if (!rootNode.visited)
                dfsTraverse(rootNode);
        }
    }

    private void dfsTraverse(GraphNode rootNode){
        if (rootNode == null)
            return;
        System.out.printf("%2s --> ",rootNode);
        rootNode.visited = true;
        for (GraphNode currentNode : rootNode.adjacent){
            if (!currentNode.visited){
                dfsTraverse(currentNode);
            }
        }
    }
}

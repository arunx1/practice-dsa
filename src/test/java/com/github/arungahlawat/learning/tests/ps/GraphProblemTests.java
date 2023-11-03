package com.github.arungahlawat.learning.tests.ps;

import com.github.arungahlawat.learning.dataStructures.Graph;
import com.github.arungahlawat.learning.dataStructures.helpers.GraphNode;
import com.github.arungahlawat.learning.ps.GraphProblems;
import org.testng.annotations.Test;

public class GraphProblemTests {
    @Test(description = "Find if there is a path between start and end node in a graph using breadth first search")
    public void findPathBetweenNodesUsingBFS(){
        Graph graph = new Graph();
        GraphNode firstNode = graph.addNode(10);
        GraphNode secondNode = graph.addNode(12);
        GraphNode thirdNode = graph.addNode(15);
        GraphNode fourthNode = graph.addNode(18);
        GraphNode fifthNode = graph.addNode(21);
        GraphNode sixthNode = graph.addNode(100);

        graph.addEdge(firstNode,secondNode)
                .addEdge(secondNode,thirdNode)
                .addEdge(firstNode,thirdNode)
                .addEdge(thirdNode,fourthNode)
                .addEdge(fourthNode,thirdNode)
                .addEdge(fourthNode,fifthNode)
                .addEdge(fifthNode,fourthNode)
                .addEdge(fifthNode,thirdNode)
                .addEdge(fifthNode,secondNode)
                .addEdge(fifthNode,firstNode)
                .addEdge(fifthNode,sixthNode)
        ;
        GraphProblems graphProblems = new GraphProblems();
        System.out.println(graphProblems.pathBetweenNodesExistUsingBreadthFirstSearch(graph,firstNode,sixthNode));
        graphProblems.traverseGraph(graph);
    }
}

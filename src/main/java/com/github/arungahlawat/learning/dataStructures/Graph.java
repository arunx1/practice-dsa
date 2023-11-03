package com.github.arungahlawat.learning.dataStructures;

import com.github.arungahlawat.learning.dataStructures.helpers.GraphNode;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    public List<GraphNode> nodes;

    public Graph(){
        this.nodes = new ArrayList<>();
    }

    public GraphNode addNode(int data){
        GraphNode graphNode = new GraphNode(data);
        this.nodes.add(graphNode);
        return graphNode;
    }

    public Graph addEdge(GraphNode fromNode, GraphNode toNode){
        fromNode.adjacent.add(toNode);
        return this;
    }

    public void unmarkVisited(){
        for (GraphNode graphNode : this.nodes){
            graphNode.visited = false;
        }
    }
}

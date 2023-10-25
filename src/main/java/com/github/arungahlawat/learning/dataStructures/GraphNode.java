package com.github.arungahlawat.learning.dataStructures;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    public int data;
    public boolean visited;
    public List<GraphNode> adjacent;

    public GraphNode(int data){
        this.data=data;
        this.visited=false;
        this.adjacent = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.valueOf(this.data);
    }
}

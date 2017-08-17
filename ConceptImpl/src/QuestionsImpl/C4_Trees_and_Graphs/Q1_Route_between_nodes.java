package QuestionsImpl.C4_Trees_and_Graphs;

import GraphImpl.*;
import StackAndQueueImpl.MyQueue;

import java.util.LinkedList;


public class Q1_Route_between_nodes {
    public static void main(String[] args) {
        Graph graph = createNewGraph();
        Node[] nodes = graph.getVertices();
        Node start = nodes[2];
        Node end = nodes[5];
        System.out.println(searchRoute(graph, start, end));
    }

    private static Graph createNewGraph() {
        Graph graph = new Graph();
        Node[] temp = new Node[6];
        temp[0] = new Node("a", 3);
        temp[1] = new Node("b", 0);
        temp[2] = new Node("c", 0);
        temp[3] = new Node("d", 1);
        temp[4] = new Node("e", 1);
        temp[5] = new Node("f", 0);

        temp[0].addAdjacent(temp[1]);
        temp[0].addAdjacent(temp[2]);
        temp[0].addAdjacent(temp[3]);
        temp[3].addAdjacent(temp[4]);
        temp[4].addAdjacent(temp[5]);

        for (int i = 0; i < 6; i++) {
            graph.addNode(temp[i]);
        }

        return graph;
    }

    private static boolean searchRoute(Graph graph, Node start, Node end) {
//        LinkedList<Node> list = new LinkedList<>();
        MyQueue<Node> queue = new MyQueue<>();
        for (Node u : graph.getVertices()) {
            u.state = State.Unvisited;
        }

        start.state = State.Visiting;
        queue.add(start);

        Node u;
        while (!queue.isEmpty()) {
            u = queue.remove();
            if (u != null) {
                for (Node v : u.getAdjacent()) {
                    if (v.state == State.Unvisited) {
                        if (v == end) {
                            return true;
                        } else {
                            v.state = State.Visiting;
                            queue.add(v);
                        }
                    }
                }
                u.state = State.Visited;
            }
        }

        return false;
    }
}

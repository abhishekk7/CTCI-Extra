package GraphImpl;

public class Node {
    private Node adjacent[];
    public int adjacentCount;
    private String vertex;
    public State state;
    public Node(String vertex, int adjacentCount) {
        this.vertex = vertex;
        this.adjacentCount = 0;
        adjacent = new Node[adjacentCount];
    }

    public void addAdjacent(Node x) {
        if (adjacentCount < adjacent.length) {
            this.adjacent[adjacentCount] = x;
            adjacentCount++;
        } else {
            System.out.println("No more adjacent can be added");
        }
    }

    public Node[] getAdjacent() {
        return adjacent;
    }

    public String getVertex() {
        return vertex;
    }
}

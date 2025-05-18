package sorting.src;

public class BFS {
    public static void main(String[] args) {
        graphbfs graph = new graphbfs(7);

        graph.add_edge(0, 1);
        graph.add_edge(0, 2);
        graph.add_edge(1, 3);
        graph.add_edge(1, 4);
        graph.add_edge(2, 5);
        graph.add_edge(2, 6);


        System.out.println("Breadth-First Search (BFS) traversal starting from vertex 0:");
        graph.bfs(0);

        
    }
    
}

package sorting.src;

public class DFS {
    public static void main(String[] args) {
        graphdfs graph = new graphdfs(7);

        graph.add_edge(0, 1);
        graph.add_edge(0, 2);
        graph.add_edge(1, 3);
        graph.add_edge(1, 4);
        graph.add_edge(2, 5);
        graph.add_edge(2, 6);

        System.out.print("DFS traversing from the certex 0 = ");
        graph.dfs(0);
        
    }
}

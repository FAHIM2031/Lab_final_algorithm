package sorting.src;

import java.util.LinkedList;

public class graphdfs {
    public int vertices;
    public LinkedList<Integer>[] adjacentList;

    public graphdfs(int vertices)
    {
        this.vertices = vertices;
        this.adjacentList = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            this.adjacentList[i] = new LinkedList<>();
        }
    }
    
    public void add_edge(int from,int to)
    {
        this.adjacentList[from].add(to);
    }

    public void dfs(int start)
    {
        boolean[] visited = new boolean[vertices];
        dfsrec(start, visited);
    }

    public void dfsrec(int current,boolean[]visited)
    {
        visited[current] = true;
        System.out.print(current + " ");
        
        for(int neighbor: adjacentList[current])
        {
            if(!visited[neighbor])
            {
                dfsrec(neighbor, visited);
            }
        }
    }
}

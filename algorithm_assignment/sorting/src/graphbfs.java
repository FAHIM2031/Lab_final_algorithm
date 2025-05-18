package sorting.src;

import java.util.LinkedList;
import java.util.Queue;

public class graphbfs {
    public int vertices;
    public LinkedList<Integer>[] adjacentList;

    public graphbfs(int vertices)
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

    public void bfs(int start)
    {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int current = q.poll();
            System.out.print(current + " ");
            
            for(int neighbor:adjacentList[current])
            {
                if(!visited[neighbor])
                {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
            
        }
    }
}

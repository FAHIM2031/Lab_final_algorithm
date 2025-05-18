package sorting.src;

public class shortestpath_dijkstra {
    static final int V = 9;
    int dist[] = new int[V];
    boolean sptset[] = new boolean[V];


    public int min_vartex(int dist[],boolean sptset[])
    {
        int min_value = Integer.MAX_VALUE;
        int min_indx = 0;

        for (int i = 0; i < V; i++) {
            if (sptset[i] == false && dist[i] < min_value) {
                min_value = dist[i];
                min_indx = i;

            }
        }
        return min_indx;

    }
    

    public void printsolution(int dist[])
    {
        System.out.println("vartex distance from source");
        for(int i=0;i<V;i++)
        {
            System.out.println(i+"\t\t\t"+dist[i]);
        }
    }

    public void dijkstra(int graph[][],int src)
    {
        for(int i=0;i<V;i++)
        {
            dist[i] = Integer.MAX_VALUE;
            sptset[i] = false;
        }


        dist[src] = 0;

        for(int i=0;i<V-1;i++)
        {
            int u = min_vartex(dist, sptset);

            sptset[u] = true;

            for(int v=0;v<V;v++)
            {
                if (!sptset[v] && dist[u] != Integer.MAX_VALUE && graph[u][v] != 0 && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
            printsolution(dist);
        }
    }
}

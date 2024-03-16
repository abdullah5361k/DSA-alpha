import java.util.*;

public class Graph {

    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // // Vertex 0
        // graph[0].add(new Edge(0, 1, 1));
        // graph[0].add(new Edge(0, 2, 1));

        // // Vertex 1
        // graph[1].add(new Edge(1, 0, 1));
        // graph[1].add(new Edge(1, 3, 1));

        // // Vertex 2
        // graph[2].add(new Edge(2, 0, 1));
        // graph[2].add(new Edge(2, 4, 1));

        // // Vertes 3
        // graph[3].add(new Edge(3, 1, 1));
        // graph[3].add(new Edge(3, 5, 1));
        // graph[3].add(new Edge(3, 4, 1));

        // // Vertex 4
        // graph[4].add(new Edge(4, 2, 1));
        // graph[4].add(new Edge(4, 5, 1));
        // graph[4].add(new Edge(4, 3, 1));

        // // Vertex 5
        // graph[5].add(new Edge(5, 3, 1));
        // graph[5].add(new Edge(5, 4, 1));
        // graph[5].add(new Edge(5, 6, 1));

        // // Vertex 6
        // graph[6].add(new Edge(6, 5, 1));

        // DAG
        graph[0].add(new Edge(0, 3, 1));
        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 1, 1));

        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));

        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));

        // DAG
        // Vertex 0
        // graph[0].add(new Edge(0, 1, 2));
        // graph[0].add(new Edge(0, 2, 4));

        // // Vertex 1
        // graph[1].add(new Edge(1, 3, 7));
        // graph[1].add(new Edge(1, 2, 1));

        // // Vertex 2
        // graph[2].add(new Edge(2, 4, 3));

        // // Vertes 3
        // graph[3].add(new Edge(3, 5, 1));

        // // Vertex 4
        // graph[4].add(new Edge(4, 5, 5));
        // graph[4].add(new Edge(4, 3, 2));

    }

    public static void bfs(ArrayList<Edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.length];
        q.add(0);

        while (!q.isEmpty()) {
            int temp = q.remove();

            if (!vis[temp]) {
                System.out.print(temp + "   ");
                vis[temp] = true;
                for (int i = 0; i < graph[temp].size(); i++) {
                    Edge e = graph[temp].get(i);
                    q.add(e.dest);
                }
            }

        }

    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
        System.out.print(curr + "  ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }

    }

    public static void calculateDeg(ArrayList<Edge>[] graph, int[] inDeg) {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                inDeg[e.dest]++;
            }
        }
    }

    public static void khansAlgorithim(ArrayList<Edge>[] graph) {
        int[] inDeg = new int[graph.length];
        calculateDeg(graph, inDeg);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < inDeg.length; i++) {
            if (inDeg[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + "  ");
            // Neighbor
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                inDeg[e.dest]--;
                if (inDeg[e.dest] == 0)
                    q.add(e.dest);
            }
        }

    }

    public static void allPaths(ArrayList<Edge>[] graph, int src, int des, String path) {
        if (src == des) {
            System.out.println(path + "" + src);
            return;
        }

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            allPaths(graph, e.dest, des, path + src);
        }

    }

    public static class Pair implements Comparable<Pair> {

        int node;
        int path;

        Pair(int node, int path) {
            this.node = node;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p) {
            return this.path - p.path;
        }
    }

    public static void dijkstars(ArrayList<Edge>[] graph, int src) {
        int dist[] = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean[] vis = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.node]) {
                vis[curr.node] = true;
                // Neighbor
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    if (dist[e.src] + e.wt < dist[e.dest]) {
                        dist[e.dest] = dist[e.src] + e.wt;
                        pq.add(new Pair(e.dest, dist[e.dest]));
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        // createGraph(graph);
        // allPaths(graph, 5, 1, "")

    }
}

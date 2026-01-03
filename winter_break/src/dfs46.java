import java.util.*;

public class dfs46 {

    static void dfs(int node, boolean[] visited, List<List<Integer>> graph) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbour : graph.get(node)) {
            if (!visited[neighbour]) {
                dfs(neighbour, visited, graph);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5; // number of vertices

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // edges
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);

        boolean[] visited = new boolean[V];

        System.out.println("DFS Enumeration:");
        dfs(0, visited, graph);
    }
}

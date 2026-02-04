import java.util.*;

public class graph_list {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of vertices:");
        int V = sc.nextInt();

        System.out.println("Enter the number of edges:");
        int edge = sc.nextInt();

        // Adjacency List (1-based indexing)
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        // Create V+1 lists (index 0 unused)
        for (int i = 0; i <= V; i++) {
            adjList.add(new ArrayList<>());
        }

        System.out.println("Enter edges (u v):");

        // Input edges
        for (int i = 0; i < edge; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            // Undirected graph
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        // Print adjacency list
        System.out.println("\nAdjacency List:");
        for (int i = 1; i <= V; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

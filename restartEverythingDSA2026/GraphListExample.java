package restartEverythingDSA2026;

import java.util.*;

public class GraphListExample {

    public static void main(String[] args) {

        int vertices = 5;
        // Matlab graph me 5 nodes hain: 0,1,2,3,4

        List<List<Integer>> graph = new ArrayList<>();
        // Ye ek bade list banayi jisme har node ke neighbours ki list hogi

        // Step 1: Har node ke liye ek EMPTY LIST add kar rahe
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
            // Example:
            // i=0 → graph = [ [] ]
            // i=1 → graph = [ [], [] ]
            // i=2 → graph = [ [], [], [] ]
        }

        // Step 2: Ab edges add karte hain (undirected graph)
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);

        // Step 3: Graph print karna
        System.out.println("Graph Adjacency List:");
        for (int i = 0; i < graph.size(); i++) {
            System.out.println(i + " -> " + graph.get(i));
        }
    }

    // Ye function 2 nodes ko connect karta hai

      static void addEdge(List<List<Integer>> graph, int u, int v){
        graph.get(u).add(v);
        // u ki list me v add ho gaya

        graph.get(v).add(u);
        // v ki list me u add ho gaya (kyunki undirected graph)
    }
}

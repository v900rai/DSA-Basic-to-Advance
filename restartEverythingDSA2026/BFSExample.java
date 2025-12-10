package restartEverythingDSA2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import java.util.*;

public class BFSExample {

    public static void main(String[] args) {

        // Graph create kar rahe (Adjacency List)
        List<List<Integer>> graph = new ArrayList<>();

        graph.add(Arrays.asList(1, 4)); // node 0 ke neighbours
        graph.add(Arrays.asList(0, 2, 3, 4)); // node 1 ke neighbours
        graph.add(Arrays.asList(1, 3)); // node 2 ke neighbours
        graph.add(Arrays.asList(1, 2, 4)); // node 3 ke neighbours
        graph.add(Arrays.asList(0, 1, 3)); // node 4 ke neighbours

        System.out.print("BFS Traversal: ");
        bfs(graph, 0);  // BFS start from node 0
    }

    static void bfs(List<List<Integer>> graph, int start) {

        Queue<Integer> q = new LinkedList<>();
        // Queue BFS me use hoti → pehle aao pehle jao (FIFO)

        boolean[] visited = new boolean[graph.size()];
        // Kisi node ko dobara visit nahi karna

        q.add(start);       // starting node ko queue me daala
        visited[start] = true;

        while (!q.isEmpty()) {

            int node = q.poll();  // queue se remove kiya
            System.out.print(node + " ");

            // Ab us node ke saare neighbours check karte hain
            for (int neighbour : graph.get(node)) {

                if (!visited[neighbour]) {
                    // Agar neighbour visit nahi hua
                    visited[neighbour] = true;
                    q.add(neighbour);  // Queue me daal do
                }
            }
        }
    }
}

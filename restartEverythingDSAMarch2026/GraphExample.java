package restartEverythingDSAMarch2026;


import java.util.*;

public class GraphExample {
    public static void main(String[] args) {
        int n = 4;
        List<List<Integer>> graph = new ArrayList<>();

        // create empty lists
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        // add edges
        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(3);

        graph.get(2).add(0);

        graph.get(3).add(1);

        System.out.println(graph);
    }
}
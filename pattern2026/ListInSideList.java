package pattern2026;

import java.util.ArrayList;
import java.util.List;

public class ListInSideList {
        public static void main(String[] args) {
            int n = 4;
            List<List<Integer>> graph = new ArrayList<>();

            // initialize
            for(int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }
            // add edges
            graph.get(0).add(1);
            graph.get(0).add(2);
            graph.get(1).add(2);
            graph.get(2).add(3);

            System.out.println(graph);
        }
    }


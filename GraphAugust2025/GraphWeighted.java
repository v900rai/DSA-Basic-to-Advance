package GraphAugust2025;
import java.util.ArrayList;

public class GraphWeighted {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src=s;
            this.dest=d;
            this.wt=w;


        }

    }

    // creating methods
    public static void createGraphWeigted(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,3,0));
        graph[1].add(new Edge(1,2,10));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));

        graph[1].add(new Edge(3,2,-1));
        graph[1].add(new Edge(3,1,0));




    }

    public static void main(String[] args) {
        int V =4;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraphWeigted(graph);

        // print 2 neighbour
        for(int i=0; i<graph[2].size(); i++){
            Edge e=graph[2].get(i);

            System.out.println(e.dest+" "+e.wt);
        }

    }
}

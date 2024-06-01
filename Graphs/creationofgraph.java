//creation of graph from start
import java.util.*;
public class creationofgraph{
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

    public static void main(String args[]){
        int V=5;
        //arraylist initialisation
        ArrayList <Edge> graph[]= new ArrayList[V];
        for(int i=0; i< V; i++){
            graph[i]= new ArrayList<>();
        }

        // 0-----1------2
       //        \
       //         \
    //             \
    //              3
      // to add
      graph[0].add(new Edge(0,1,1));
      
      graph[1].add(new Edge(1,0,1));
      graph[1].add(new Edge(1,2,1));
      graph[1].add(new Edge(1,3,1));

      graph[2].add(new Edge(2,1,1));


      //to get 1's neigbour
      for(int i=0; i< graph[1].size(); i++){
        Edge e= graph[1].get(i);
        System.out.println(" neigbour's of 1's are: "+ e.dest);
      }
      
      
      

    }

}
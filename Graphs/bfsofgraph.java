import java.util.*;
public class bfsofgraph {

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){

        ArrayList<Integer> bfs= new ArrayList<>();
        boolean visited[]= new boolean[V];
        Queue <Integer> q= new LinkedList<>();

        q.add(0);
        visited[0]=true;

        while(!q.isEmpty()){
            Integer x= q.remove();
            bfs.add(x);

            //for each loop for each integer from adjacency list
            for(Integer i : adj.get(x)){
                if(visited[i]==false){
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
        return bfs;

    }
    public static void main(String args[]) {
        
        bfsofgraph bfsGraph = new bfsofgraph();
        
        
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        
        
        int V = 5; 
        
       
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        
        
        adjList.get(0).add(1);
        adjList.get(0).add(2);
        adjList.get(1).add(3);
        adjList.get(2).add(3);
        adjList.get(3).add(4);
        
        
        ArrayList<Integer> bfsTraversal = bfsGraph.bfsOfGraph(V, adjList);
        
       
        System.out.println("BFS Traversal:");
        for (Integer node : bfsTraversal) {
            System.out.print(node + " ");
        }
    }
    
}

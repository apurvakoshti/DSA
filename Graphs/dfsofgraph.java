import java.util.*;
public class dfsofgraph {

    public static void dsf(int node, boolean visited[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){

        visited[node]=true;
        ls.add(node);

        for(Integer it : adj.get(node)){
            if(visited[it]==false){
                dsf(it, visited, adj, ls);
            }
        }

    }

    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        boolean visited[]= new boolean[V+1];
        ArrayList<Integer> ls= new ArrayList<>();
       dsf(0, visited, adj, ls);
       return ls;

    }
    public static void main(String args[]) {
        
        dfsofgraph dfsGraph = new dfsofgraph();
        
        
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
        
        
        ArrayList<Integer> dfsTraversal = dfsGraph.dfsOfGraph(V, adjList);
        
       
        System.out.println("DFS Traversal:");
        for (Integer node : dfsTraversal) {
            System.out.print(node + " ");
        }
    }
    
    
}

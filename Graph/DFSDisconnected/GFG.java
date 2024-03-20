/*package whatever //do not write package name here */

import java.util.ArrayList;

class GFG {
    
	public static void main (String[] args) {
	   ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
	   int v = 5;
	   for(int i=0; i<v; i++){
	       adj.add(new ArrayList<>());
	   }
	   addEdge(adj, 0,1);
	   addEdge(adj, 0,2);
	   addEdge(adj, 1,2);
	   addEdge(adj, 3,4);
	   
	   printGraph(adj);
	   
	   dfs(adj, v);
	}
	
	private static void printGraph(ArrayList<ArrayList<Integer>> adj){
	    for(int i=0; i<adj.size(); i++){
	        System.out.print(i+" -> ");
	        for(int j=0; j<adj.get(i).size(); j++){
	            System.out.print(adj.get(i).get(j)+" ");
	        }
	        System.out.println();
	    }
	}
	
	private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
	    adj.get(u).add(v);
	    adj.get(v).add(u);
	}
	
	private static void dfsRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited){
	    visited[s] = true;
	    System.out.print(s + " ");
	    for(int u: adj.get(s)){
	        if(visited[u] == false){
	            dfsRec(adj, u, visited);
	        }
	    }
	}
	
	private static void dfsDisconnected(ArrayList<ArrayList<Integer>> adj, int v){
	    boolean[] visited = new boolean[v];
	    for(int i=0; i<v; i++){
	        if(visited[i] == false){
	            dfsRec(adj, i, visited);
	        }
	    }
	}
	
}

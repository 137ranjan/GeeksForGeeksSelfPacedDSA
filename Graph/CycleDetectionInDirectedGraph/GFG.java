/*package whatever //do not write package name here */

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

class GFG {
    
	public static void main (String[] args) {
	   ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
	   int v = 6;
	   for(int i=0; i<v; i++){
	       adj.add(new ArrayList<>());
	   }
	   addEdge(adj, 0,1);
	   addEdge(adj, 2,1);
	   addEdge(adj, 2,3);
	   addEdge(adj, 3,4);
	   addEdge(adj, 4,5);
	   addEdge(adj, 5,3);
	   
	   printGraph(adj);
	   
	   System.out.println(dfs(adj, v));
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
	}
	// Cycle detection using dfs for directed graph
	private static boolean dfsRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, boolean[] recSt){
	    visited[s] = true;
	    recSt[s] = true;
	    for(int u: adj.get(s)){
	        if(visited[u] == false){
	            if(dfsRec(adj, u, visited, recSt) == true){
	                return true;
	            }
	        }else if(recSt[u] == true){
	            return true;
	        }
	    }
	    recSt[s] = false;
	    
	    return false;
	}
	
	private static boolean dfs(ArrayList<ArrayList<Integer>> adj, int v){
	    boolean[] visited = new boolean[v];
	    boolean[] recSt = new boolean[v];
	    for(int i=0; i<v; i++){
	        if(visited[i] == false){
	            if(dfsRec(adj, i, visited, recSt)== true){
	                return true;
	            }
	        }
	    }
	    return false;
	}
	
	
}

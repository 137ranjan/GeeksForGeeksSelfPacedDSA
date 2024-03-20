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
	   addEdge(adj, 1,2);
	   addEdge(adj, 1,3);
	   addEdge(adj, 2,3);
	   addEdge(adj, 2,4);
	   addEdge(adj, 4,5);
	   
	   printGraph(adj);
	   
	   System.out.println(dfs(adj, v));
	   System.out.println(bfsUtil(adj, v));
	   
	   
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
	// Cycle detection using dfs
	private static boolean dfsRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int parent){
	    visited[s] = true;
	    for(int u: adj.get(s)){
	        if(visited[u] == false){
	            if(dfsRec(adj, u, visited, s) == true){
	                return true;
	            }
	        }else if(u != parent){
	            return true;
	        }
	    }
	    
	    return false;
	}
	
	private static boolean dfs(ArrayList<ArrayList<Integer>> adj, int v){
	    boolean[] visited = new boolean[v];
	    for(int i=0; i<v; i++){
	        if(visited[i] == false){
	            if(dfsRec(adj, i, visited, -1)== true){
	                return true;
	            }
	        }
	    }
	    return false;
	}
	// Cycle detection using bfs
	private static boolean bfsUtil(ArrayList<ArrayList<Integer>> adj, int v){
	    boolean[] visited = new boolean[v];
	    for(int i=0; i<v; i++){
	        if(visited[i] == false){
	            if(bfs(adj, i, visited, -1) == true){
	                return true;
	            }
	        }
	    }
	    return false;
	}
	private static boolean bfs(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int parent){
	    Queue<Integer> q = new LinkedList<>();
	    visited[s] = true;
	    q.add(s);
	    while(!q.isEmpty()){
	        int u = q.poll();
	        for(int V : adj.get(u)){
	            if(visited[V] == false){
	                visited[V] = true;
	                q.add(V);
	                parent = V;
	            }
	            else if(V != parent){
	                return true;
	            }
	           
	        }
	    }
	    return false;
	}
	
}

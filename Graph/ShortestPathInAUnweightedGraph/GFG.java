/*package whatever //do not write package name here */

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

class GFG {
    
	public static void main (String[] args) {
	   ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
	   int v = 4;
	   for(int i=0; i<v; i++){
	       adj.add(new ArrayList<>());
	   }
	   addEdge(adj, 0,1);
	   addEdge(adj, 0,2);
	   addEdge(adj, 1,2);
	   addEdge(adj, 1,3);
	   addEdge(adj, 2,3);
	   
	   printGraph(adj);
	   int[] dist = new int[v];
	   
	   Arrays.fill(dist, Integer.MAX_VALUE);
	   dist[0] = 0;
	   
	   bfs(adj, v, 0, dist);
	   for(int i=0; i<dist.length; i++){
	        System.out.print(dist[i] + " ");
	    }
	   
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
	
	
	private static void bfs(ArrayList<ArrayList<Integer>> adj, int v, int s, int[] dist){
	    boolean[] visited = new boolean[v];
	    Queue<Integer> q = new LinkedList<>();
	    visited[s] = true;
	    q.add(s);
	    while(!q.isEmpty()){
	        int u = q.poll();
	        for(int V : adj.get(u)){
	            if(visited[V] == false){
	                dist[V] = dist[u] + 1;
	                visited[V] = true;
	                q.add(V);
	            }
	           // System.out.println(q.toString());
	           // System.out.println(Arrays.toString(dist));
	        }
	    }
	}
	
}

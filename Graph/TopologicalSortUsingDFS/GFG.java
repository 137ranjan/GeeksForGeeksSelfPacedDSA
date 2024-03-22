/*package whatever //do not write package name here */

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Stack;

class GFG {
    
	public static void main (String[] args) {
	   ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
	   int v = 5;
	   for(int i=0; i<v; i++){
	       adj.add(new ArrayList<>());
	   }
	   addEdge(adj, 0,1);
	   addEdge(adj, 1,3);
	   addEdge(adj, 3,4);
	   addEdge(adj, 2,3);
	   addEdge(adj, 2,4);
	   
	   printGraph(adj);
	   
	   topologicalSort(adj, v);
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
	
	// dfs
	private static void dfs(ArrayList<ArrayList<Integer>> adj, int u, boolean[] visited, Stack<Integer> stack){
	    visited[u] = true;
	    for(int v: adj.get(u)){
	        if(visited[v] == false){
	            dfs(adj, v, visited, stack);
	        }
	    }
	    stack.push(u);
	}
	// Topological sort using dfs
	private static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int v){
	    boolean[] visited = new boolean[v];
	    Stack<Integer> stack = new Stack<>();
	    for(int i=0; i<v; i++){
	        if(visited[i] == false){
	            dfs(adj, i, visited, stack);
	        }
	    }
	    
	    while(stack.isEmpty()==false){
	        System.out.print(stack.pop()+" ");
	    }
	}
}

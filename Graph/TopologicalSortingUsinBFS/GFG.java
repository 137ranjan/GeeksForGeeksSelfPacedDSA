/*package whatever //do not write package name here */

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

class GFG {
    
	public static void main (String[] args) {
	   ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
	   int v = 5;
	   for(int i=0; i<v; i++){
	       adj.add(new ArrayList<>());
	   }
	   addEdge(adj, 0,2);
	   addEdge(adj, 0,3);
	   addEdge(adj, 1,3);
	   addEdge(adj, 1,4);
	   addEdge(adj, 2,3);
	   
	   printGraph(adj);
	   
	   int[] indegreeArr = getIndegreeArr(adj, v);
	   
	   System.out.println(Arrays.toString(indegreeArr));
	   
	   bfs(adj, indegreeArr);
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
	private static int[] getIndegreeArr(ArrayList<ArrayList<Integer>> adj, int v){
	    int[] indegreeArr = new int[v];
	    for(int i=0; i<adj.size(); i++){
	        for(int j=0; j<adj.get(i).size(); j++){
	            indegreeArr[adj.get(i).get(j)]++;
	        }
	    }
	    return indegreeArr;
	}
	// Topological Sorting using bfs
	private static void bfs(ArrayList<ArrayList<Integer>> adj,int[] indegreeArr){
	    Queue<Integer> q = new LinkedList<>();
	    int i=0;
	    while(indegreeArr[i] == 0){
	        q.add(i);
	        i++;
	    }
	    while(q.isEmpty()==false){
	        int u = q.poll();
	        System.out.print(u + " ");
	        for(int V: adj.get(u)){
	            indegreeArr[V]--;
	            if(indegreeArr[V] == 0){
	                q.add(V);
	            }
	        }
	    }
	}
}

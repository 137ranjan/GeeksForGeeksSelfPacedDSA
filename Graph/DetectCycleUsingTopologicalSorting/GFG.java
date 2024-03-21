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
	   addEdge(adj, 0,1);
	   addEdge(adj, 1,2);
	   addEdge(adj, 2,3);
	   addEdge(adj, 3,1);
	   addEdge(adj, 4,1);
	   
	   printGraph(adj);
	   
	   int[] indegreeArr = getIndegreeArr(adj, v);
	   
	   System.out.println(Arrays.toString(indegreeArr));
	   System.out.println("Does it contain a cycle?");
	   System.out.println(bfs(adj, indegreeArr));
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
	// Cycle detection using Topological Sorting using bfs
	private static boolean bfs(ArrayList<ArrayList<Integer>> adj,int[] indegreeArr){
	    Queue<Integer> q = new LinkedList<>();
	    int count = 0;
	    int i=0;
	    while(i<indegreeArr.length){
	        if(indegreeArr[i] == 0){
	         q.add(i);
	        }
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
	        count++;
	    }
	    return (count != indegreeArr.length);
	}
}

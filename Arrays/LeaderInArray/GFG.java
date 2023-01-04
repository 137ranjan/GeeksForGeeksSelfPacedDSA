/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int [] arr = {30,20,10};
		for(int i=0; i<arr.length; i++){
		    System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		printLeader(arr);
	}
	
	private static void printLeader(int[] arr){
	    int n = arr.length;
	    int leaderCount = 0;
	    int []leaderArr = new int[n];
	    leaderArr[leaderCount] = arr[n-1];
	    leaderCount++;
	    for(int i=n-1; i>=0; i--){
	        if(arr[i] > leaderArr[leaderCount-1]){
	            leaderArr[leaderCount] = arr[i];
	            leaderCount++;
	        }
	    }
	    for(int i=leaderCount-1; i>=0; i--){
	        System.out.print(leaderArr[i] + " ");
	    }
	}
	
}

/*package whatever //do not write package name here */

import java.util.Scanner;
    
class GFG {
    public static void main (String[] args) {
        KStacks ks = new KStacks(2,5);
        ks.push(1,100);
        ks.push(1,200);
        System.out.println(ks.pop(1));
	}
	
	private static class KStacks{
	    int arr[], top[], next[];
	    int freeTop = 0, k, cap;
	    
	    KStacks(int k, int n){
	        this.k = k;
	        cap = n;
	        arr = new int[n];
	        top = new int[k];
	        next = new int[n];
	        for(int i=0; i<k; i++){
	            top[i] = -1;
	        }
	        for(int i=0; i< n-1; i++){
	            next[i] = i+1;
	        }
	        next[n-1] = -1;
	    }
	    
	    void push(int sn, int x){
	        int i = freeTop;
	        freeTop = next[i];
	        next[i] = top[sn];
	        top[sn] = i;
	        arr[i] = x;
	    }
	    
	    int pop(int sn){
	        int i = top[sn];
	        top[sn] = next[i];
	        next[i] = freeTop;
	        freeTop = i;
	        return arr[i];
	    }
	    boolean isEmpty(int sn){
	        return top[sn] == -1;
	    }
	    
	    
	}
}

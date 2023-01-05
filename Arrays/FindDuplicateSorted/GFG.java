/*package whatever //do not write package name here */

class GFG {
	public static void main (String[] args) {
		int [] arr = {1,2,3,3,4,4,5};
		for(int i=0; i<arr.length; i++){
		    System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		int newSize = removeDuplicateSorted(arr,7);
		
		for(int i=0; i<newSize; i++){
		    System.out.print(arr[i]+" ");
		}
		
		
	}
	
	private static int removeDuplicateSorted(int[] arr, int n){
	   int res = 1; 
	   for (int i=1;i<n ;i++ ){
	       if(arr[i] != arr[res-1]){
	           arr[res] = arr[i];
	           res++;
	       }
	   }
	   return res;
	   
	}
}

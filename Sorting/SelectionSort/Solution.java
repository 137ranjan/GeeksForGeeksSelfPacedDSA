class Solution {
	public static void main (String[] args) {
		int[] arr = {60, 10, 50, 20, 40, 30 };
		selectionSort(arr);
		for (int i=0; i < arr.length; i++){
		    System.out.print(arr[i]+" ");
		} 
		
	}
	
	private static void selectionSort(int[] arr){
	   int n = arr.length;
	   for(int i=0; i<n-1; i++){
	       int min_ind = i;
	       for(int j=i+1; j<n; j++){
	           if(arr[j] < arr[min_ind]){
	               min_ind = j;
	           }
	       }
	       if(min_ind != i){
	           int temp = arr[i];
	           arr[i] = arr[min_ind];
               arr[min_ind] = temp;
	       }
	       for (int k=0; k < arr.length; k++){
		    System.out.print(arr[k]+" ");
		}
		System.out.println(" ");
	       
	   }
	}
}

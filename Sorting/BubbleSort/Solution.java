class Solution {
	public static void main (String[] args) {
		int[] arr = {60, 10, 50, 20, 40, 30 };
		bubbleSort(arr);
		for (int i=0; i < arr.length; i++){
		    System.out.print(arr[i]+" ");
		} 
		
	}
// Bubble Sort	
	private static void bubbleSort(int[] arr){
	   int n = arr.length;
	   for (int i=0; i<n; i++ ){
	       boolean swapped = false;
	       for(int j=0; j<n - 1 - i; j++){
	           if(arr[j] > arr[j + 1]){
	               int temp = arr[j];
	               arr[j] = arr[j + 1];
	               arr[j + 1] = temp;
	               swapped = true;
	           }
	           for (int k=0; k < arr.length; k++){
		            System.out.print(arr[k]+" ");
		        }
		        System.out.println(" ");
	       }
	       System.out.println(" ");
	       System.out.println(" ");
	       if(swapped == false){
	           break;
	       }
	   }
	   
	}
}

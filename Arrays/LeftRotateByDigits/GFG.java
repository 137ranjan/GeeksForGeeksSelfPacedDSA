/*package whatever //do not write package name here */

class GFG {
	public static void main (String[] args) {
		int [] arr = {10,5,30,15};
		for(int i=0; i<arr.length; i++){
		    System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		leftRotateByD2(arr,3);
		
		for(int i=0; i<arr.length; i++){
		    System.out.print(arr[i]+" ");
		}
		
		
	}
	
	private static void leftRotateByD(int[] arr, int d){
	    int n = arr.length;
	    int[] tempArr = new int[d];
	    for(int i=0; i<d; i++){
	        tempArr[i] = arr[i];
	    }
	    for (int i = d; i< n; i++ ){
	        arr[i-d] = arr[i];
	    }
	    for(int i=0; i<d; i++){
	        arr[n - d + i] = tempArr[i];
	    }
	    
	}
	
	private static void leftRotateByD2(int[] arr, int d){
	    int n = arr.length;
	    reverse(arr, 0, d-1);
	    reverse(arr, d, n-1);
	    reverse(arr, 0, n-1);
	}
	
	private static void reverse(int [] arr, int low, int high){
	    while(low < high){
	        int temp = arr[low];
	        arr[low] = arr[high];
	        arr[high] = temp;
	        
	        low++;
	        high--;
	    }
	}
}

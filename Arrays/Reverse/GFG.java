/*package whatever //do not write package name here */

class GFG {
	public static void main (String[] args) {
		int [] arr = {1,2,3,3,4,4,5};
		for(int i=0; i<arr.length; i++){
		    System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		reverse(arr);
		
		for(int i=0; i<arr.length; i++){
		    System.out.print(arr[i]+" ");
		}
		
		
	}
	
	private static void reverse(int[] arr){
	    
	    int low = 0, high = arr.length - 1;
	    
	    while(low < high){
	        
	        int temp = arr[low];
	        arr[low] = arr[high];
	        arr[high] = temp;
	        
	        low++;
	        high--;
	    }
	}
}

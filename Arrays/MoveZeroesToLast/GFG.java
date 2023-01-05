/*package whatever //do not write package name here */

class GFG {
	public static void main (String[] args) {
		int [] arr = {1,2,3,3,0,4,0,4,5};
		for(int i=0; i<arr.length; i++){
		    System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		moveZeroesToLast(arr);
		
		for(int i=0; i<arr.length; i++){
		    System.out.print(arr[i]+" ");
		}
		
		
	}
	
	private static void moveZeroesToLast(int[] arr){
	    int n = arr.length;
	    int count = 0;
	    for (int i=0;i<n ; i++ ){
	        if(arr[i] != 0){
	            int temp = arr[i];
	            arr[i] = arr[count];
	            arr[count] = temp;
	            
	            count++;
	        }
	    } 
	}
}

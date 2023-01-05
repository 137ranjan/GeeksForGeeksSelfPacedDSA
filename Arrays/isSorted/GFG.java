/*package whatever //do not write package name here */

class GFG {
	public static void main (String[] args) {
		int [] arr = {1,2,3,3,4,4,5};
		System.out.println(isSorted(arr));
	}
	
	private static boolean isSorted(int[] arr){
	    for (int i=0; i<arr.length - 1; i++){
	        if(arr[i] > arr[i+1]){
	            return false;
	        }
	    }
	    return true;
	}
}

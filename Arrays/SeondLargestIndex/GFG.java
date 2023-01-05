/*package whatever //do not write package name here */

class GFG {
	public static void main (String[] args) {
		int [] arr = new int[10];
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 9;
		arr[5] = 18;
		int x = 7;
		System.out.println(secondLargest(arr, 6));
	}
	
	private static int secondLargest(int[] arr, int n){
	   int max = 0;
	   int secondMax = -1;
	   
	   for (int i=1; i<n; i++ ){
	       if(arr[i] > arr[max]){
	           secondMax = max;
	           max = i;
	           
	       }else if(arr[i] != arr[max]){
	          if(secondMax == -1 || arr[i] > arr[secondMax]){
	              secondMax = i;
	          }
	       }
	   }
	   
	   return secondMax;
	}
}

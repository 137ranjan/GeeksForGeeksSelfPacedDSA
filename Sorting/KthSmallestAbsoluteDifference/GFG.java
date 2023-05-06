import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
       Scanner input = new Scanner(System.in);
       int t = input.nextInt();
       while(t-- > 0){
         int n = input.nextInt();
         int k = input.nextInt();
         int[] a = new int[n];
         for(int i=0; i<n; i++){
             a[i] = input.nextInt();
         }
         Arrays.sort(a);
         int left = 0;
         int right = a[a.length - 1] - a[0];
         while(left < right){
             int mid = (left + right)/2;
             if(isSmallDiff(a,k,mid)){
                 right = mid;
             }else{
                 left = mid + 1;
             }
         }
         System.out.println(left);
       }
	 }
	 
	 private static boolean isSmallDiff(int[] a, int k, int mid){
	     int count = 0, left = 0;
	     for(int right = 1; right < a.length; right++){
	         while(a[right] - a[left] > mid){
	             left++;
	         }
	         count += right - left;
	     }
	     return (count >= k);
	 }
}

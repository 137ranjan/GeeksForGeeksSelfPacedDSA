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
             int c = input.nextInt();
             int[] arr = new int[n];
             for(int i=0; i<n; i++){
                 arr[i] = input.nextInt();
             }
             Set<Integer> set = new HashSet<>();
             boolean flag = false;
             for(int i=0; i<n; i++){
                 if(set.contains(arr[i]^c)){
                     flag = true;
                     break;
                 }
                 set.add(arr[i]);
             }
         
             if(flag){
                 System.out.println("Yes");
             }else{
                 System.out.println("No");
             }
         }
         
	 }
}

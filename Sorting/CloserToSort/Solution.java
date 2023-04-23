/*
Given an array arr[](0-based indexing) of N integers which is closer sorted 
(defined below) and an element x. The task is to find the index of element x 
if it is present. If not present, then print -1.
Closer Sorted: The first array is sorted, but after sorting some elements are
moved to either of the adjacent positions, i.e, maybe to the arr[i+1] or arr[i-1].
Note: You may assume that the array does not contain any duplicate elements. 
*/

class Solution
{
  
    // n: size of array
    // x: element to find
    //Function to find index of element x in the array if it is present.
    static long closer(int arr[], int n, long x)
    {
        // add your code here
        return binarySearch(arr, 0, n-1, x);
    }
    
    // arr[]: input array
    // l: lower index
    // r: higher index
    // x: element to find
    //Binary search function to find x in the array.
    public static long binarySearch(int arr[], int l, int r, long x){
        
        if(r>=l){
            
            //Finding middle index.
            int mid = l+(r-l)/2;
            
            //We check for the element also at mid-1 and mid+1 since  
            //some elements are moved to either of the adjacent positions,
            //i.e. maybe to the arr[i+1] or arr[i-1].
            
            //If the element is present at any one of the 3 middle
            //positions i.e. (mid, mid-1, mid+1), we return the index.
            if(arr[mid]==x)return mid;
            
            if(mid > l && arr[mid-1]==x)return mid-1;
            
            if(mid < r && arr[mid+1]==x)return mid+1;
            
            //If element is smaller than element at mid, then it can only be 
            //present in left subarray so we call the function recursively.
            if(arr[mid] > x){
                return binarySearch(arr, l, mid-2, x);
            }
            
            //If element is greater than element at mid, then it can only be 
            //present in right subarray so we call the function recursively.
            return binarySearch(arr, mid+2, r, x);
        }
        
        //If the element is not present in the array we return -1.
        return -1;
    }

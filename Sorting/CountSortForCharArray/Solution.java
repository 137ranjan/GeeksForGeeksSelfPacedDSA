class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        // code here
        arr = arr.toLowerCase();
        char[] charArr = arr.toCharArray();
        int[] count = new int[26];
        char[] charArr2 = new char[arr.length()];
        for(int i=0; i<charArr.length; i++){
            count[(int)charArr[i] - 97]++;
        }
        for(int i=1; i<26; i++){
            count[i] = count[i] + count[i-1];
        }
        
        for(int i=arr.length() - 1; i>=0; i--){
            charArr2[count[(int)charArr[i]-97]-1] = charArr[i];
            count[(int)charArr[i]-97]--;
        }
        
        String output = new String(charArr2);
        
        return output;
        
        
    }
}

//Given a binary string S. The task is to count the number of substrings that start 
//and end with 1. For example, if the input string is “00100101”, then there are 
//three substrings “1001”, “100101” and “101”.

class Solution
{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int a, String str)
    {
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        return (count*(count - 1))/ 2;
    }
    
}

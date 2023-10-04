class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // System.out.println((str1+str1).indexOf(str2));
        
        if(str1.length()!= str2.length())
            return false;
        if(str1.length() == 1 && str2.length() == 1 && str1.indexOf(str2) == 0)
            return true;
            
        int index = (str1+str1).indexOf(str2);
            
        return( (index > 0) && (index == str1.length()-2 || index == 2));
    }
    
}

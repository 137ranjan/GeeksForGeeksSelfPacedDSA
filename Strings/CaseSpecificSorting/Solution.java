class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str) 
    {
        char[] mixChArr = str.toCharArray();
        
        int lIdx = 0;
        int uIdx = 0;
        
        //counting number of lowercase and uppercase characters.
        for (char ch: mixChArr) 
        {
            if (Character.isUpperCase(ch))
                uIdx++;
            else
                lIdx++;
        }
        
        int upperSize = uIdx;
        int lowerSize = lIdx;
        
        char[] lowerChArr = new char[lowerSize];
        char[] upperChArr = new char[upperSize];
        
        lIdx = 0;
        uIdx = 0;
        
        //storing uppercase and lowercase characters in two separate lists.
        for (char ch: mixChArr) 
        {
            if (Character.isUpperCase(ch))
                upperChArr[uIdx++] = ch;
            else
                lowerChArr[lIdx++] = ch;
        };

        //sorting both the lists.
        Arrays.sort(upperChArr);
        Arrays.sort(lowerChArr);
        
        lIdx = 0;
        uIdx = 0;
        
        //iterating over the given string.
        for (int mIdx = 0; mIdx < mixChArr.length; mIdx++) 
        {
            //if current character is in uppercase then we pick character from  
		    //the list containing uppercase characters and add it to result.
            if (Character.isUpperCase(mixChArr[mIdx])) 
            {
                mixChArr[mIdx] = upperChArr[uIdx++];
            }
            
            //else we pick the character from the sorted list  
		    //containing lowercase characters and add it to result.
            else
            {
                mixChArr[mIdx] = lowerChArr[lIdx++];
            }
        }
        String rtnStr = new String(mixChArr);
        //returning the result.
        return rtnStr;
    }
    
}

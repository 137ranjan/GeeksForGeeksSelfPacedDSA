class Solution
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
        long sum = 0;
        char[] charArr = str.toCharArray();
        
        int i=0; 
        while(i < charArr.length){
            if(Character.isLetter(charArr[i])){
                i++;
            }else if(Character.isDigit(charArr[i])){
                long num = Character.getNumericValue(charArr[i]);
                i++;
                while(i < charArr.length && Character.isDigit(charArr[i])){
                    num = (num*10) + Character.getNumericValue(charArr[i]);
                    i++;
                }
                sum += num;
            }
        }
        return sum;
    }
    
}

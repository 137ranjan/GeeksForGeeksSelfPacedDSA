class Solution
{
    // Pair Class
    static class Pair{
         long x;
         long y;
         
         Pair(long x, long y){
             this.x = x;
             this.y = y;
         }
     }
    //Function to find repeated element and its frequency.
    static Pair sequence(Vector<Long> a)
    {

        //if array has no repeating element, we return (-1,-1).
        if(a.size()-(a.get(a.size()-1)-a.get(0)) == 1){
            return new Pair(-1l, -1l);
        }

        int s = 0;
        int e = a.size() - 1;

        //using binary search to find the repeating element.
        while (s < e)
        {
            int m = (s + e) / 2;

            //if arr[m]=m+a[0], there is no repeating
            //number in [s..m].
            if (a.get(m) >= m + a.get(0))
                s = m + 1;

            //else there is repeating number in [s..m].
            else
                e = m;
        }
        //returning the repeated element and its frequency.
        return new Pair(a.get(s), a.size()-(a.get(a.size()-1)-a.get(0)));
    }
    public static Pair findRepeating(Long arr[],int n)
    {
        //Your code here
        Pair p = sequence(new Vector<Long>(Arrays.asList(arr)));
        	return p;
        
    }  
};

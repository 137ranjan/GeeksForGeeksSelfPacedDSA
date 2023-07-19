class Solution
{
    //Function to find nth number made of only prime digits.
    public static int primeDigits(int n)
    {
        //Your code here 2,3,5,7, 22, 23, 25, 27, 32, 33, 35, ..... 
       n--;
    	
    	//list to store numbers made of only prime digits.
    	int ans[]=new int[1000];
    	
    	int i=0, j=0, digits=0, Count=0, k=0;
    	int a[]=new int[]{2,3,5,7};
        
        //storing the values for first four prime numbers in the list.
        ans[0]=2;
        ans[1]=3;
        ans[2]=5;
        ans[3]=7;
        k=4;
        
        //we start traversing from 22.
        for(i=22; i<2300; i++)
        {
            int p=i;
            digits=0;
            Count=0;
            
            //while current index is not 0, we run a loop.
            while(p!=0)
            {
                digits++;
                int r=p%10;
                p=p/10;
                
                //checking if each digit in current index p is prime or not.
                for(j=0;j<4;j++)
                {
                    if(r==a[j])
                    {
                        Count++;
                        break;
                    }
                }
            }
            
            //if all the digits are prime then storing the number in list.
            if(Count==digits)
                ans[k++]=i;
            else
                continue;
        }
        //returning the nth element from the list.
    	return ans[n];
        
        
    }
}

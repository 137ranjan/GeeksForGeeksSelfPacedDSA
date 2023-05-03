class Solution{
    //Function to fill the array elements into a hash table 
    //using Quadratic Probing to handle collisions.
    static void quadraticProbing(int[] hash, int hash_size, int arr[], int N)
    {
         for(int i = 0; i < hash_size; i++)
                 hash[i] = -1;
                 
        for(int i=0;i<N;i++)
            {
                //if the value of hash table at index (arr[i]%hashSize) is -1 
                //which means empty then, we insert arr[i] at that place.
                if(hash[arr[i]%hash_size]==-1)
                {
                    hash[arr[i]%hash_size]=arr[i];
                }
                //else we move linearly from the filled position 
                //to find an index with -1 in hash table.
                else
                {
                    int k=arr[i]%hash_size;
                int power = 0;
                boolean flag = true;
                //using a loop which runs until we find an index with -1
                //in hash table which means empty.
                while( hash[(k+power*power)%hash_size] != -1)
                {
                	if(hash[(k+power*power)%hash_size] == arr[i]) {
                		flag = false;
                		break;
                	}
                     power++;
                }
                //inserting arr[i] after finding the empty position.
                if(flag)
                	hash[(k+power*power)%hash_size]=arr[i];
                }
            }
    }
}

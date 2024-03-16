class Pair {
    int freq;
    int num;
    Pair(int x, int y){
        this.num = x;
        this.freq = y;
    }
}

class PairComparitor implements Comparator<Pair> 
{
    //comparison function defined for the priority queue.
    public int compare(Pair p1, Pair p2) 
    { 
        //if frequencies of two elements are same 
        //then the larger number should come first.
        if(p1.freq == p2.freq)
        {
            if(p1.num > p2.num)return -1;
            if(p1.num < p2.num)return 1;
            return 0;
        }
        		
		//inserting elements in the priority queue on the basis of 
        //decreasing order of frequencies.
        if(p1.freq > p2.freq)return -1;
        if(p1.freq < p2.freq)return 1;
        return 0;
    }
}

class Solution
{
    //Function to print the sum of frequencies of k numbers
    //with most occurrences in an array.
    int kMostFrequent(int arr[], int n, int k)
    {
        //Hashmap implemented as frequency hash table. 
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int i=0; i<n; i++) {
            if (mp.containsKey(arr[i]))mp.put(arr[i], mp.get(arr[i]) + 1); 
            else mp.put(arr[i] , 1);
        }
        
        //priority queue implemented as Maxheap on the basis of the 
        //comparison operator "compare".
        //element with the highest frequency is the root of priority queue. 
        //in case of conflicts, larger element is the root.
        PriorityQueue<Pair> q = new PriorityQueue<Pair>(new PairComparitor());
        for(Map.Entry m:mp.entrySet()){
            q.add(new Pair((int)m.getKey(), (int)m.getValue()));
        }
        
        int res=0;
        
        //storing the sum of frequencies of first k most occurring elements.
        for(int i=0; i<k; i++)
        {
            //adding the top element from priority queue in sum and popping it.
            res+=q.poll().freq;
        }
        //returning the result.
        return res;
    }
    
}

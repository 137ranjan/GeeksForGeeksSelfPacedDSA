class Solution{
    static class Key{
		int freq;
		char ch;

		Key(int freq, char c) {
			this.freq = freq;
			this.ch = c;
		}
	}

	static class KeyComparator implements Comparator<Key> {
		//@Override
		public int compare(Key k1, Key k2) {
			return k2.freq - k1.freq;
		}
	}
    
    //Function to rearrange the characters in a string such that 
    //no two adjacent characters are same.
    static String rearrangeCharacters(String str)
    {
		final short MAX_CHAR = 26;
		int n = str.length();
		int count[] = new int[MAX_CHAR];

		//storing count of each character in array.
		for (int i = 0; i < n; ++i) {
			count[str.charAt(i) - 'a']++;
		}

		//using a priority queue.
		PriorityQueue<Key> pq = new PriorityQueue<>(new KeyComparator());
		for (char c = 'a'; c <= 'z'; ++c)
		{
			int val = c - 'a';
			if (count[val] != 0) 
			{
			    //storing pair of character and its frequency in priority queue.
				pq.add(new Key(count[val], c)); 
			}
		}
		StringBuffer ret=new StringBuffer();
		
		//prev is used to store previous character and its frequency.
		Key prev = new Key(-1, '$');
		while (pq.size() != 0) 
		{
		    //storing the top element an popping it from priority queue.
			Key k = pq.poll();
			ret.append(k.ch); 
			
			//if frequency of previous character is more than 0, 
    		//we push it in priority queue.
			if (prev.freq > 0)
				pq.add(prev);
			
			//making current character as the previous character and
            //decreasing frequency by one.	
			k.freq--;
			prev = k;
		}
		
		return ret.toString();
	
	}
}

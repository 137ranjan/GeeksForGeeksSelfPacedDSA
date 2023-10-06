class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        //if length of string p is greater than string s then we return -1.
        if(p.length() > s.length()){
            return "-1";
        }
        
        //using hash tables to store the count of characters in strings.
        int[] hash_pat = new int[256];
        int[] hash_str = new int[256];
        
        //storing the count of characters in string p in hash table.
        for(int i=0; i<p.length(); i++){
            hash_pat[p.charAt(i)]++;
        }
        
        int start = 0;
        int start_index = -1;
        int min_len = Integer.MAX_VALUE;
        int count = 0;
        for(int j=0; j<s.length(); j++){
            
            //storing the count of characters in string s in hash table.
            hash_str[s.charAt(j)]++;
            
            //if count of current character in string s is equal to or less 
            //than in string p, we increment the counter.
            if(hash_pat[s.charAt(j)] != 0 && hash_str[s.charAt(j)] <= hash_pat[s.charAt(j)]){
                count++;
            }
            
            //if all the characters are matched
            if(count == p.length()){
                while(hash_str[s.charAt(start)] > hash_pat[s.charAt(start)] || hash_pat[s.charAt(start)] == 0){
                    
                    //we try to minimize the window.
                    if(hash_str[s.charAt(start)] > hash_pat[s.charAt(start)]){
                        hash_str[s.charAt(start)]--;
                    }
                    start++;
                }
                
                //updating window size.
                int len_window = j - start + 1;
                if(min_len > len_window){
                    //if new minimum sub-string is found, we store value
                    //of its starting index for new found window.
                    min_len = len_window;
                    start_index = start;
                }
            }
        }
        //returning the smallest window or -1 if no such window is present.
        if(start_index == -1){
            return "-1";
        }
        else{
            return (s.substring(start_index, start_index+min_len));
        }
        
    }
}

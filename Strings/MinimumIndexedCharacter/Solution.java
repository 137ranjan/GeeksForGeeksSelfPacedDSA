class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char letter = str.charAt(i);
            if(map.get(letter) == null){
                map.put(letter, i);
            }
        }
        // System.out.println(map.toString());
        int minIndex = Integer.MAX_VALUE;
        boolean flag = false;
        
        for(int i=0; i<patt.length(); i++){
            if(map.get(patt.charAt(i)) != null){
                minIndex = Math.min(map.get(patt.charAt(i)), minIndex);
                flag = true;
            }
        }
        
        if(flag)
            return minIndex;
        else
            return -1;
        
    }
}

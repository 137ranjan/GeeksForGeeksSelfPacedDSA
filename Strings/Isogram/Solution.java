class Solution
{
    //Function to check if a string is Isogram or not.
    static boolean isIsogram(String data){
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<data.length(); i++){
            map.put(data.charAt(i), map.getOrDefault(data.charAt(i), 0) + 1);
        }
        
        for(char letter : map.keySet()){
            if(map.get(letter) > 1){
                return false;
            }
        }
        
        return true;
    }
}

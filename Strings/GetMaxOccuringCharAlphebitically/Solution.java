class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<line.length(); i++){
            map.put(line.charAt(i), map.getOrDefault(line.charAt(i), 0) + 1);
        }
        char result = line.charAt(0);
        int maxCount = map.get(line.charAt(0));
        for(int i=1; i<line.length(); i++){
            if(map.get(line.charAt(i)) > maxCount){
                maxCount = map.get(line.charAt(i));
                result = line.charAt(i);
            }else if(map.get(line.charAt(i)) == maxCount){
                if(line.charAt(i) < result){
                    maxCount = map.get(line.charAt(i));
                    result = line.charAt(i);
                }
            }
        }
        
        return result;
    }
    
}

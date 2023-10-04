class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String str) {
        Set<Character> set = new HashSet<>();
        for(int i=0; i<str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                if(Character.isUpperCase(str.charAt(i))){
                    set.add(Character.toLowerCase(str.charAt(i)));
                }else{
                    set.add(str.charAt(i));
                }
            }
        }
        if(set.size() == 26){
            return true;
        }else{
            return false;
        }
    }
}

class Solution {
    public static boolean searchPattern(String str, String pat) {
        // code here
        for(int i=0; i< str.length() - pat.length()+1; i++){
            int count = 0;
            for(int j=0; j< pat.length(); j++){
                if(str.charAt(i+j) == pat.charAt(j)){
                    count++;
                    //System.out.println("count="+count);
                }
            }
            if(count == pat.length()){
                return true;
            }
        }
        
        return false;
    }
}

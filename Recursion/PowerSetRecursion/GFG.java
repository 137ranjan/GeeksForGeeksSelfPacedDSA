class LexSort
{
    //Function to return the lexicographically sorted power-set of the string.
    
    static ArrayList<String> powerSet(String s)
    {
        // add your code here
        ArrayList<String> result = new ArrayList<>();
        String curr = ""; 
        int i = 0;
       
        
       
        calculatePowerSet(s,curr,i, result);
        //System.out.println(result);
        return result;
       
    }
    
    static void calculatePowerSet(String s, String curr, int i, ArrayList<String> result){
        if(i == s.length()){
            result.add(curr);
            // if(curr != ""){
            //      result.add(curr);
            // }
            return;
        }
        calculatePowerSet(s, curr, i+1,result);
        calculatePowerSet(s, curr + s.charAt(i),i+1,result);
       
    }
}

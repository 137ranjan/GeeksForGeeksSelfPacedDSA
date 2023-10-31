class Solution
{
    //Function to remove pair of duplicates from given string using Stack.
    public static String removePair(String str)
    {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
            }else if(stack.peek() == ch){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        sb = sb.reverse();
        return sb.toString();
    }
}

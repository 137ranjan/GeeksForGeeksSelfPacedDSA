class Solution
{
    //Function to remove consecutive duplicates from given string using Stack.
    public static String removeConsecutiveDuplicates(String str)
    {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(stack.isEmpty() || ch != stack.peek()){
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb = sb.reverse();
        return sb.toString();
    }
}

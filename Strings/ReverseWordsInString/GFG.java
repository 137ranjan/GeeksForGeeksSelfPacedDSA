class GFG {
	public static void main (String[] args) {
		String str = "Welcome to Gfg";
		String result = revWords(str);
		System.out.println(result);
	}
	
	private static String revWords(String str){
	    char[] charArr = str.toCharArray();
	    int start = 0;
	    for(int end = 0; end < charArr.length; end++){
	        if(charArr[end] == ' '){
	            reverse(charArr, start, end - 1);
	            start = end + 1;
	        }
	    }
	    reverse(charArr, start, charArr.length - 1);
	    reverse(charArr, 0, charArr.length - 1);
	    
	    String result = new String(charArr);
	    return result;
	}
	
	private static void reverse(char[] charArr, int low, int high){
	    while(low < high){
	        char temp = charArr[low];
	        charArr[low] = charArr[high];
	        charArr[high] = temp;
	        
	        low++;
	        high--;
	    }
	}
}

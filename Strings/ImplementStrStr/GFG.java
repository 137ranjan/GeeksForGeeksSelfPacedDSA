class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       // Your code here
       char[] arrS = s.toCharArray();
       char[] arrX = x.toCharArray();
       
       for(int i=0; i<arrS.length; i++){
           
           if(arrS[i] == arrX[0]){
               boolean flag = true;
               int k = i;
               int j=0;
               for(; j<arrX.length && k<arrS.length; j++, k++){
                   if(arrS[k] != arrX[j]){
                       flag = false;
                       break;
                   }
               }
               if(flag && j == arrX.length){
                   return i;
               }
           }
       }
       
       return -1;
    }
}

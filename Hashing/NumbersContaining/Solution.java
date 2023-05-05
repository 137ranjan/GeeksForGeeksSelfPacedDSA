//Function to find all the numbers with only 1,2 and 3 in their digits.
public static void findAll()
{
    int num=1,num2;
    ArrayList<Integer> a=new ArrayList<>(); 
    int j=1;
    
     //storing 1,2, and 3 in the list.
    a.add(j);
    a.add(j+1);
    a.add(j+2);
    
    //The idea is to store 1 as value in a map for all numbers between 1 and
    //1000000 which have only 1,2 and 3 as digits.
    //We can then easily check for the required numbers from the map.
    mp.put(1,1);
    mp.put(2,1);
    mp.put(3,1);
    
    j=0;
    
    //using a loop in which we keep multiplying the number in list with 10 and 
    //add 1,2 and 3 to it and store them in list one by one thus only numbers 
    //with 1,2 and 3 as digits are stored in the list.
    //This process continues till the number is less than or equal to 1000000.
    while(num<=1000000)
    {
        //storing the number from list in num2.
        num2=a.get(j++);
        
        //multiplying num2 with 10 and adding 1 and we store it in the list
        //only if it is less than or equal to 1000000.
        if((num2*10)+1<=1000000){
            a.add((num2*10)+1);
            //updating the value in map.
            mp.put(num2*10+1,1);
        }
        
        //multiplying num2 with 10 and adding 2 and we store it in the list
        //only if it is less than or equal to 1000000.
        if((num2*10)+2<=1000000){
            a.add((num2*10)+2);
            //updating the value in map.
            mp.put(num2*10+2,1);
        }
        
        //multiplying num2 with 10 and adding 3 and we store it in the list
        //only if it is less than or equal to 1000000.
        num2=(num2*10)+3;
        if(num2<=1000000){
            a.add(num2);
            //updating the value in map.
            mp.put(num2,1);
        }
        
        //updating num which controls the loop.
        num=num2;
        
    }
}

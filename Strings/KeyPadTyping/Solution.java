public static String printNumber(String s, int n) 
{
    StringBuilder str = new StringBuilder();
    for(char ch : s.toCharArray()){
        switch(ch){
            case 'a' : str.append("2");
                       break;
            case 'b' : str.append("2");
                       break;
            case 'c' : str.append("2");
                       break;
            case 'd' : str.append("3");
                       break;
            case 'e' : str.append("3");
                       break;
            case 'f' : str.append("3");
                       break;
            case 'g' : str.append("4");
                       break;
            case 'h' : str.append("4");
                       break;
            case 'i' : str.append("4");
                       break;
            case 'j' : str.append("5");
                       break;
            case 'k' : str.append("5");
                       break;
            case 'l' : str.append("5");
                       break;
            case 'm' : str.append("6");
                       break;
            case 'n' : str.append("6");
                       break;
            case 'o' : str.append("6");
                       break;
            case 'p' : str.append("7");
                       break;
            case 'q' : str.append("7");
                       break;
            case 'r' : str.append("7");
                       break;
            case 's' : str.append("7");
                       break;
            case 't' : str.append("8");
                       break;
            case 'u' : str.append("8");
                       break;
            case 'v' : str.append("8");
                       break;
            case 'w' : str.append("9");
                       break;
            case 'x' : str.append("9");
                       break;
            case 'y' : str.append("9");
                       break;
            case 'z' : str.append("9");
                       break;
            default :  str.append("");
                       break;
            
        }
    }
    return str.toString();
}


public class Main {

    
    public static void main(String[] args) {
        String str = "Welcome to Bangladesh";
        String revstr = reverseString(str);
        System.out.println("After Reversed: "+ revstr);
    }

    public static String reverseString(String str) 
    {
        if(str.isEmpty())
            return str;
        
        return reverseString(str.substring(1))+ str.charAt(0);
    }
    
}

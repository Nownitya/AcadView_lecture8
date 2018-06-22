
import java.util.Scanner;


public class ReverseString 
{
    public static void main(String[] args) 
    {
       System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        System.out.println("Reverse is"+str+reverse(str));  
    }
    
    public static String reverse(String str)
    {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
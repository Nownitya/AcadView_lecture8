
import java.util.Scanner;


public class StringOccurence 
{
    Scanner sc = new Scanner(System.in);
    String str1 =  sc.next();
    String str2 = sc.next();
    
    void Occur()
    {
        if(str1.contains(str2))
        {
            System.out.println("Contains Stings");
        }
        else
        {
            System.out.println("Not contains Strings");
        }
    }
    public static void main(String[] args)
        {
            StringOccurence occur = new StringOccurence();
            occur.Occur();
            
        }
    
}

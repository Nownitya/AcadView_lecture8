
import java.util.Scanner;


public class CountWord 
{
    public static void main(String[] args) 
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence");
        String w =  sc.next();
        
        
        for (int i = 0; i < w.length() - 1; i++)
	{
            if ((w.charAt(i) == ' ') && (w.charAt(i + 1) != ' '))
            {
		count++;
 
            }
            i++;
	}
        count=count+1;
 	System.out.println("Number of words in a string = " + count);  
    }
    
}

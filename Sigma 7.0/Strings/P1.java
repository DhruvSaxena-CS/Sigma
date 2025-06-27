import java.util.*;

public class P1
{
    public static int vowelCount(String str)
    {
        int count = 0;

        for(int i=0 ; i<str.length() ; i++)
        {
            char ch = str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                count++;
            }
        }

        return count;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sc.next();

        System.out.println("Count: " + vowelCount(str));
    }
}
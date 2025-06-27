import java.util.*;

public class P3 
{

    public static boolean pal(int num)
    {
        int n = num;
        int rev = 0;

        while(n>0)
        {
            int r = n%10;
            rev = rev*10 + r;
            n = n/10;
        }

        if(rev == num)
        {
            return true;
        }

        else
        {
            return false;
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(pal(num))
        {
            System.out.println(num + " is a palindrome");
        }
        else
        {
            System.out.println(num + " is not a palindrome");
        }
    }    
}

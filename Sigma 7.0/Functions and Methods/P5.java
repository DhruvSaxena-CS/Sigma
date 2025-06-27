import java.util.*;

public class P5 
{
    public static int sumD(int n)
    {
        int sumD = 0;

        while(n>0)
        {
            int d = n%10;
            sumD += d;
            n = n/10;
        }

        return sumD;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        System.out.println("The sum of digits of " + n + ": " + sumD(n));
    }
}

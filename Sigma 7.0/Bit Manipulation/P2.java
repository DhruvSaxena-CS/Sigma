import java.util.*;

public class P2
{
    public static void swap(int x , int y)
    {
        System.out.println("Before Swap x = " + x + " and y = " + y);

        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("After Swap x = " + x + " and y = " + y);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter first number");
        int x = sc.nextInt();
        System.out.println("Enter second number");
        int y = sc.nextInt();

        swap(x,y);
    }
}
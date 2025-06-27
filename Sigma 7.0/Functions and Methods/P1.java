import java.util.*;

public class P1
{

    public static float avg(int a, int b, int c)
    {
        return (a+b+c)/3f;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();

        System.out.println("Average of " + a + ", " + b + ", " + c + ": " + avg(a,b,c));
    }
}
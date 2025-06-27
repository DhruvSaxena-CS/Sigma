import java.util.*;

public class P2 
{
    public static String digits[] = {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
    
    public static void printDigits(int num)
    {
        if(num == 0)
        {
            return;
        }

        printDigits(num/10);
        int ld = num%10;
        System.out.print(digits[ld] + " ");
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        printDigits(num);
    }    
}

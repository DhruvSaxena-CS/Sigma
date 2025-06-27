import java.util.*;

public class P1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int x = sc.nextInt();

        if(x>0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }
        
    }
}
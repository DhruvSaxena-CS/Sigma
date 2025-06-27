import java.util.*;

public class P2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int num, ch;
        int es=0, os=0;

        do
        {
            System.out.println("Enter a number");
            num = sc.nextInt();

            if(num%2 == 0)
            {
                es += num;
            }
            else
            {
                os += num;
            }

            System.out.println("To continue press 1 or press 0 to exit");
            ch = sc.nextInt();
        }while(ch==1);

        System.out.println("EvenSum: " + es);
        System.out.println("OddSum: " + os);
    }
}
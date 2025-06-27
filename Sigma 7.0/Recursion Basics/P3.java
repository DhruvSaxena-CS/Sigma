import java.util.*;

public class P3 
{
    /*public static void length(String str , int count)
    {
        if(str.length() == 0)
        {
            System.out.println(count);
            return;
        }

        length(str.substring(1) , count+1);
    }*/

    public static int length(String str)
    {
        if(str.length() == 0)
        {
            return 0;
        }

        return length(str.substring(1)) + 1;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = sc.next();

        System.out.println(length(str));
        //length(str , 0);
    }
}

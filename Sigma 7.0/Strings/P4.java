import java.util.*;

public class P4 
{
    public static void anagramcheck(String str1 , String str2)
    {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length())
        {
            char S1[] = str1.toCharArray();
            char S2[] = str2.toCharArray();

            Arrays.sort(S1);
            Arrays.sort(S2);

            boolean result = Arrays.equals(S1, S2);

            if(result)
            {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other");
            }
            else
            {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
            }
        }

        else
        {
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string");
        String str1 = sc.next();
        System.out.println("Enter second string");
        String str2 = sc.next();

        anagramcheck(str1 , str2);
    }
}

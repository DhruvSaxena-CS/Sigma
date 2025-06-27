import java.util.*;

public class P1
{
    public static int count(int arr[][] , int key)
    {
        int count=0;
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=0 ; j<arr[0].length ; j++)
            {
                if(arr[i][j] == key)
                {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int arr[][] = new int[3][3];
        
        System.out.println("Enter the elments");
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=0 ; j<arr[0].length ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the key");
        int key = sc.nextInt();

        System.out.println();
        System.out.println(count(arr , key));
    }
}
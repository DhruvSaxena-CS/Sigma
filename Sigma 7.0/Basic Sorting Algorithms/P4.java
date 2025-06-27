import java.util.*;

public class P4 
{
    public static void counting(int arr[])
    {
        int max = Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length ; i++)
        {
            max = Math.max(arr[i], max);
        }

        int count[] = new int[max+1];

        for(int i=0 ; i<arr.length ; i++)
        {
            count[arr[i]]++;
        }

        int j=0;

        for(int i=0 ; i<count.length ; i++)
        {
            while(count[i] > 0)
            {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void print(int arr[])
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }

        counting(arr);
        print(arr);
    }
}

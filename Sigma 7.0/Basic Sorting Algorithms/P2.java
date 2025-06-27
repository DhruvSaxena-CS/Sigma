import java.util.*;

public class P2 
{
    public static void selection(int arr[])
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            int maxpos = i;
            for(int j=i+1 ; j<arr.length ; j++)
            {
                if(arr[maxpos] < arr[j])
                {
                    maxpos = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxpos];
            arr[maxpos] = temp;
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

        selection(arr);
        print(arr);
    }
}

import java.util.*;

public class P2_BF
{
    public static int majority(int arr[])
    {
        int maj = arr.length/2;

        for(int i=0 ; i<arr.length ; i++)
        {
            int count = 0;
            for(int j=0 ; j<arr.length ; j++)
            {
                if(arr[j] == arr[i])
                {
                    count++;
                }
            }

            if(count >= maj)
            {
                return arr[i];
            }

        }

        return -1;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements");
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Majority element: " + majority(arr));
    }    
}

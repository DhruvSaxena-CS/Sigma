import java.util.*;

public class P5 
{
    public static void triplets(int arr[])
    {
        for(int i=0 ; i<arr.length-1 ; i++)
        {
            for(int j=i+1 ; j<arr.length-1 ; j++)
            {
                for(int k=j+1 ; k<arr.length-1 ; k++)
                {
                    if(arr[i] + arr[j] + arr[k] == 0)
                    {
                        System.out.println("[" + arr[i] + "," + arr[j] + "," + arr[k] + "]");
                    }
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[6];

        System.out.println("Enter the elements");
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }

        triplets(arr);
    }
}

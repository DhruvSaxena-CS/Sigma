import java.util.*;

public class P2 
{
    public static int sum(int arr[][])
    {
        int sum = 0;

        for(int i=1, j=0 ; j<arr[0].length ; j++)
        {
            sum += arr[i][j];
        }

        return sum;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];

        System.out.println("Enter the elements");
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=0 ; j<arr[0].length ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.println("Sum: " + sum(arr));
    }   
}

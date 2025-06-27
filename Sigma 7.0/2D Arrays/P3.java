import java.util.*;

public class P3 
{
    public static void transpose(int arr[][] , int tsp[][])
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=0 ; j<arr[0].length ; j++)
            {
                tsp[j][i] = arr[i][j];
            }
        }
    }


    public static void print(int A[][])
    {
        for(int i=0 ; i<A.length ; i++)
        {
            for(int j=0 ; j<A[0].length ; j++)
            {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];
        int tsp[][] = new int[3][3];

        System.out.println("Enter the elments");
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=0 ; j<arr[0].length ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        
        print(arr);
        transpose(arr , tsp);
        print(tsp);
    }
}

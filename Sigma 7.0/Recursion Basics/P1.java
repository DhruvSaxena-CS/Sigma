import java.util.*;

class P1
{
    public static void allOccurences(int arr[], int key, int i)
    {
        if(i == arr.length)
        {
            return;
        }

        if(arr[i] == key)
        {
            System.out.print(i + " ");
        }

        allOccurences(arr, key, i+1);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        
        System.out.println("Enter the elements");
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key");
        int key = sc.nextInt();

        allOccurences(arr, key, 0);
        System.out.println();
    }
}
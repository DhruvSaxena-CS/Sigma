import java.util.*;

public class P2 
{
    public static int search(int nums[] , int key)
    {
        int min = minSearch(nums);

        if(nums[min] <= key && key <= nums[nums.length-1])
        {
            return search(nums , min , nums.length-1 , key);
        }
        else
        {
            return search(nums , 0 , min-1 , key);
        }
    }

    public static int search(int nums[] , int start , int end , int key)
    {
        while(start <= end)
        {
            int mid = start + (end-start)/2;

            if(nums[mid] == key)
            {
                return mid;
            }

            else if(nums[mid] > key)
            {
                end = mid-1;
            }

            else
            {
                start = mid+1;
            }
        }

        return -1;
    }

    public static int minSearch(int nums[])
    {
        int start = 0;
        int end = nums.length-1;

        while(start < end)
        {
            int mid = start + (end-start)/2;

            if(mid>0 && nums[mid-1] > nums[mid])
            {
                return mid;
            }

            if(nums[start] <= nums[mid] && nums[mid] > nums[end])
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }

        return start;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int nums[] = new int[7];

        System.out.println("Enter the elements");
        for(int i=0 ; i<nums.length ; i++)
        {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the key");
        int key = sc.nextInt();

        System.out.println(search(nums , key));
    }
}

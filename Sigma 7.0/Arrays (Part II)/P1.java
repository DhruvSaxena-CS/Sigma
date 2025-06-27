import java.util.*;

public class P1
{
    public static boolean duplicate(int nums[])
    {
        for(int i=0 ; i<nums.length-1 ; i++)
        {
            for(int j=i+1 ; j<nums.length ; j++)
            {
                if(nums[i] == nums[j])
                {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) 
    {
        int nums[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements");
        
        for(int i=0 ; i<nums.length ; i++)
        {
            nums[i] = sc.nextInt();
        }

        System.out.println(duplicate(nums));
    }
}
import java.util.*;

public class P4 
{
    public static int trap(int height[])
    {
        int n = height.length;

        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];

        for(int i=1 ; i<height.length ; i++)
        {
            leftMax[i] = Math.max(height[i] , leftMax[i-1]);
        }

        int rightMax[] = new int[height.length];
        rightMax[n-1] = height[n-1];

        for(int i=n-2 ; i>=0 ; i--)
        {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int tw = 0;

        for(int i=0 ; i<n ; i++)
        {
            int wl = Math.min(leftMax[i], rightMax[i]);
            tw += wl-height[i];
        }

        return tw;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int height[] = new int[7];

        System.out.println("Enter the heights");
        for(int i=0 ; i<height.length ; i++)
        {
            height[i] = sc.nextInt();
        }

        System.out.println(trap(height));
    }   
}

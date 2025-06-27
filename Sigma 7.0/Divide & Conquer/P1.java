import java.util.*;

class P1
{
    public static void display(String str[])
    {
        for(int i=0 ; i<str.length ; i++)
        {
            System.out.println(str[i]);
        }
    }

    public static void mergeSort(String str[] , int si , int ei)
    {
        if(si>=ei)
        {
            return;
        }

        int mid = si + (ei-si)/2;

        mergeSort(str, si, mid);
        mergeSort(str, mid+1, ei);

        merge(str , si , mid , ei);
    }

    public static void merge(String str[] , int si , int mid , int ei)
    {
        String temp[] = new String[ei-si+1];
        int i=0;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei)
        {
            int ch = 0;
            do 
            {   
                if(str[i].charAt(ch) < str[j].charAt(ch))
                {
                    temp[k++] = str[i++];
                }
                else if(str[i].charAt(ch) > str[j].charAt(ch))
                {
                    temp[k++] = str[j++];
                }
                else
                {
                    ch++;
                }
            }while(ch<str[i].length() || ch<str[j].length());
        }

        while(i<=mid)
        {
            temp[k++] = str[i++];
        }

        while(j<=ei)
        {
            temp[k++] = str[j++];
        }

        for(int x=0 , y=si ; x<temp.length ; x++ , y++)
        {
            str[y] = temp[x];
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        String str[] = new String[n];
        
        System.out.println("Enter the elements");
        for(int i=0 ; i<n ; i++)
        {
            str[i] = sc.next();
        }

        mergeSort(str , 0 , str.length-1);

        display(str);
    }
}
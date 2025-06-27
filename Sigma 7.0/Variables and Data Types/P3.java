import java.util.*;

public class P3
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();   

        float bill = (pencil + pen + eraser);

        float bill2 = bill * 1.18f;

        System.out.println(bill);
        System.out.println(bill2);
    }
}
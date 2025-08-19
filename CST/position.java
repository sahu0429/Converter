import java.util.*;
public class position 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("Enter the positiion of the element to be found:");
        int k = sc.nextInt();
        String num_str = Integer.toString(n);
        if(k<1|| k>num_str.length())
        {
            System.out.println("Invalid position");
        }
        else
        {
            char ch = num_str.charAt(k-1);
            System.out.println("The element at position " + k + " is: " + ch);
        }
    }
}
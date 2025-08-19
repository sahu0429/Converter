import java.util.*;
public class TCSjarsum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=10,k=5;
        int num;
        System.out.println("Enter the number of elements : ");
        num  = sc.nextInt();
         if(num >= 1 && num <= 5) {
   		 System.out.println("NUMBER OF CANDIES SOLD : " + num);
   		 System.out.print("NUMBER OF CANDIES LEFT : " + (n - num));
   	 } else {
   		 System.out.println("INVALID INPUT");
   		 System.out.print("NUMBER OF CANDIES LEFT : " + n);
    }
    } 
}
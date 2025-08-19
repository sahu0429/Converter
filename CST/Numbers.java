import java.util.*;
public class Numbers
{
    public static void main(String[] args) {
        System.out.println("Enter the 6 digit number: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int rev = 0;
        for(int i=0;i<3;i++)
        {
            int digit = n%10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println("Rev="+rev);
        System.out.println("n=" +n);
        n=(n*1000)+rev;
        System.out.println("New number is: " + n);
        sc.close();
    }
}
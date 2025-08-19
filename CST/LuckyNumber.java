import java.util.*;
public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a four-digit number:");
        int n = sc.nextInt();
        int sum =0;
        if (n >= 1000 && n <= 9999) {
            int digit;
            while (n!=0)
            {
                digit =n % 10;
                sum =sum +digit;
                n=n/10;
            }
            System.out.println(sum);
            if (n % 4 == 0 || n % 5 == 0 || n % 7 == 0) {
                System.out.println(n + " is a lucky number!");
            } else{
                System.out.println(n + " is not a lucky number.");
            }
        } 
        else {
            System.out.println("Please enter a valid four-digit number.");
        }
    }
}
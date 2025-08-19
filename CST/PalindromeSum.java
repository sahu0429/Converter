import java.util.*;
public class PalindromeSum{
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 20; i++) 
        {
            int original = i;
            int reversed = 0;
            int num = i;
            while (num > 0) {
                reversed = reversed * 10 + num % 10;
                num /= 10;
            }
            if (original == reversed) 
            
            {
                count++;
            }
        }
        System.out.println("Total palindrome numbers between 1 and 20: " + count);
    }
}
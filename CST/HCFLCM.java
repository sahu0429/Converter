import java.util.*;
public class HCFLCM
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two numbers to find HCF and LCM:");
        System.out.print("First number: ");
        int a = sc.nextInt();
        System.out.print("Second number: ");
        int b = sc.nextInt();
        int hcf = findHCF(a, b);
        int lcm = (a*b)/hcf;
        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);
        sc.close();
    }
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
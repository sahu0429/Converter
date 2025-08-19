import java.util.*;
public class ratTCS
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rats: ");
        int rats=sc.nextInt();
        System.out.println("Enter the number of units: ");
        int units=sc.nextInt();
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int total_food = rats*units;
        int[]food= new int[size];
        System.out.println("Enter the food for each rats: ");
        for (int i = 0;i< size; i++)
        {
            food[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += food[i];
        }
        if(sum>= total_food)
        {
        System.out.println("Total food available: " + sum);
    
    }
}
}
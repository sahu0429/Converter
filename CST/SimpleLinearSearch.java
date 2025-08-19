import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); 
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); 
        }
        int target = scanner.nextInt(); 
        scanner.close();

        String result = ""; 
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                result += i + " ";
            }
        }
        System.out.println(result.isEmpty() ? "0" : result); 
    }
}
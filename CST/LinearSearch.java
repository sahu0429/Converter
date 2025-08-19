import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the element to search:");
        int target = sc.nextInt();
        List<Integer> indices = new ArrayList<>();
        
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                indices.add(i);
            }
        }
        
        if (indices.isEmpty()) {
            System.out.println("Element not found: ");
        } else {
            System.out.println("Element found at indices: " + indices);
        }
    }
}
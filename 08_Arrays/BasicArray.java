import java.util.*;

public class BasicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize array
        int[] arr1 = new int[5];
        System.out.println(arr1[0]);

        int[] arr2 = { 1, 2, 3, 4, 5 };
        System.out.println(arr2[2]);

        String[] arr3 = { "apple", "banana", "mango" };
        System.out.println(arr3[2]);

        // Input
        String[] arr4 = new String[3];
        System.out.print("Enter your name: ");
        arr4[0] = sc.nextLine();
        System.out.print("Enter your age : ");
        arr4[1] = sc.nextLine();
        System.out.print("Enter your city: ");
        arr4[2] = sc.nextLine();

        // Output
        System.out.println(arr4[0]);
        System.out.println(arr4[1]);
        System.out.println(arr4[2]);

        sc.close();
    }
}
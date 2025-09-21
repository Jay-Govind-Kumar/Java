import java.util.*;

public class SwapNumbers {

    public static void swap(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        System.out.print("Enter the first index to swap: ");
        int index1 = scanner.nextInt();

        System.out.print("Enter the second index to swap: ");
        int index2 = scanner.nextInt();

        System.out.print("Original list: " + list + "\n");

        if (index1 < 0 || index1 >= list.size() || index2 < 0 || index2 >= list.size()) {
            System.out.println("Error: Invalid index(es). Swap not performed.");
        } else {
            System.out.print("Original list: " + list + "\n");
            swap(list, index1, index2);
            System.out.print("Swapped list: " + list);
        }

        scanner.close();
    }

}

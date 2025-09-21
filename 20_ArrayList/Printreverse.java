import java.util.*;

public class Printreverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter numbers (type 'done' to finish):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("done")) {
                break;
            }
            int number = Integer.parseInt(input);
            list.add(number);
        }

        System.out.println("Numbers in original order:" + list);

        System.out.print("Numbers in reverse order: ");
        for (int i = (list.size() - 1); i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

        scanner.close();
    }
}
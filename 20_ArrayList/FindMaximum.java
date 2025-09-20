import java.util.*;

public class FindMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter integers (type 'end' to finish):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            int number = Integer.parseInt(input);
            list.add(number);
        }

        int max = Integer.MIN_VALUE;
        for (int number : list) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("The maximum number is: " + max);

        scanner.close();
    }
}

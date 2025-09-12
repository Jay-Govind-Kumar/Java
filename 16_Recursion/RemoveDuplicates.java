import java.util.*;

public class RemoveDuplicates {

    public static String removeDuplicates(String str, int index, StringBuilder newStr, boolean[] map) {
        if (index == str.length()) {
            return newStr.toString();
        }

        char currentChar = str.charAt(index);

        if (!map[currentChar - 'a']) {
            map[currentChar - 'a'] = true;
            newStr.append(currentChar);
        }
        return removeDuplicates(str, index + 1, newStr, map);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        String result = removeDuplicates(input, 0, new StringBuilder(), new boolean[26]);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
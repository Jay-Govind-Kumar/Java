/* Find the largest string in lexicographical order. Lexicographical order, also known as dictionary order, is a way to arrange characters, words, or numbers in alphabetical order */

import java.util.Scanner;

public class LargestString {

    public static String largestString(String[] str) {
        if (str.length == 0) {
            return null;
        }

        String largest = str[0];

        for (int i = 1; i < str.length; i++) {
            if (str[i].compareToIgnoreCase(largest) > 0) {
                largest = str[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

        System.out.println("\"" + largestString(arr) + "\" is the largest string in lexicographical order.");

        sc.close();
    }
}

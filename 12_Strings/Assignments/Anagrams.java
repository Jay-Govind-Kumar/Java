/* If two strings contain the same characters but in a different order, they can be said to be anagrams. Consider race and care. In this case, race's characters can be formed in to a study, or care's characters can be formed into race. */

import java.util.Scanner;
import java.util.Arrays;

public class Anagrams {
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        boolean result = true;
        if (str1.length() != str2.length()) {
            return false;
        } else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            result = Arrays.equals(arr1, arr2);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string : ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string : ");
        String str2 = sc.nextLine();

        System.out.println((isAnagram(str1, str2) ? "The strings are anagrams." : "The strings are not anagrams."));

        sc.close();
    }
}

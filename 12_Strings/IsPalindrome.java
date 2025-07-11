import java.util.Scanner;

public class IsPalindrome {

    public static boolean isPalindrome(String str) {
        String newStr = str.toLowerCase().trim();
        int n = newStr.length();

        for (int i = 0; i < n / 2; i++) {
            if (newStr.charAt(i) != newStr.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check if it is a palindrome or not: ");
        String str = sc.nextLine();

        System.out.print(isPalindrome(str) ? str + " is a palindrome." : str + " is not a palindrome.");

        sc.close();
    }
}

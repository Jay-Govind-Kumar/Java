import java.util.*;

public class BasicsStrings {

    public static void charAt(String str) {
        int n = str.length();

        for (int i = 0; i < n; i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter your first name : ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name : ");
        String lastName = sc.nextLine();

        String fullName = firstName + " " + lastName; // --> concatenation
        System.out.println(fullName);

        charAt(fullName);

        sc.close();
    }

}

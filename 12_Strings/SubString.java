import java.util.Scanner;

public class SubString {

    // subString function - less efficient
    public static String subString(String str, int start, int end) {
        String newStr = "";
        for (int i = start; i < end; i++) {
            newStr += str.charAt(i);
        }
        return newStr;
    }

    // subString function using StringBuilder - more efficient
    public static String subStringBuilder(String str, int start, int end) {
        StringBuilder newStr = new StringBuilder();
        for (int i = start; i < end; i++) {
            newStr.append(str.charAt(i));
        }

        return newStr.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int start, end;

        // validation
        while (true) {
            System.out.print("Enter the starting index: ");
            start = sc.nextInt();

            System.out.print("Enter the ending index: ");
            end = sc.nextInt();

            if (start >= 0 && end <= str.length() && start <= end) {
                break;
            } else {
                System.out.println("Invalid indices. Please enter valid indices.");
            }
        }

        // inbuilt function
        System.out.println("Substring: " + str.substring(start, end));

        // user defined function
        System.out.println("Substring: " + subString(str, start, end));
        System.out.println("Substring: " + subStringBuilder(str, start, end));
        
        sc.close();
    }
}

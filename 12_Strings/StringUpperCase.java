import java.util.Scanner;

public class StringUpperCase {
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();

        Character ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(' ');
                ch = Character.toUpperCase(str.charAt(i + 1));
                sb.append(ch);
                i++;
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("String in uppercase: " + toUpperCase(str));

        sc.close();
    }
}

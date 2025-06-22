import java.util.Scanner;

public class HollowRhombus {
    public static void hollowRhombus(int lines) {
        for (int i = 0; i < lines; i++) {
            for (int j = i; j < (lines - 1); j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < lines; k++) {
                if (i == 0 || k == 0 || i == lines - 1 || k == lines - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int lines = sc.nextInt();

        hollowRhombus(lines);
        sc.close();
    }
}

import java.util.Scanner;

public class Rhombus {
    public static void rhombusPattern(int lines) {
        for (int i = 0; i < lines; i++) {
            for (int j = i; j < (lines - 1); j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < lines; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int lines = sc.nextInt();

        rhombusPattern(lines);
        sc.close();
    }
}

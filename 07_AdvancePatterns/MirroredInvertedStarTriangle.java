import java.util.Scanner;

public class MirroredInvertedStarTriangle {
    public static void mirroredInvertedStarTriangle(int lines) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k < lines; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int lines = sc.nextInt();

        mirroredInvertedStarTriangle(lines);
        sc.close();
    }
}

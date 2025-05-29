import java.util.Scanner;

public class StarTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int lines = sc.nextInt();

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
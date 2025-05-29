import java.util.Scanner;

public class InvertedNumberTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int lines = sc.nextInt();

        for (int i = 0; i < lines; i++) {
            for (int j = 1; j <= (lines - i); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
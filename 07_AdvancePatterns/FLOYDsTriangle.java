import java.util.Scanner;

public class FLOYDsTriangle {
    public static void floydsTriangle(int lines) {
        int count = 1;
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int lines = sc.nextInt();

        floydsTriangle(lines);
        sc.close();
    }
}

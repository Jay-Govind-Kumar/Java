import java.util.Scanner;

public class ShortestPath {
    public static float shortestPath(String path) {
        int x = 0, y = 0;
        int n = path.length();

        if (n == 0) {
            return 0;
        }

        for (int i = 0; i < n; i++) {
            if (path.charAt(i) == 'N' || path.charAt(i) == 'n') {
                y++;
            } else if (path.charAt(i) == 'S' || path.charAt(i) == 's') {
                y--;
            } else if (path.charAt(i) == 'E' || path.charAt(i) == 'e') {
                x++;
            } else if (path.charAt(i) == 'W' || path.charAt(i) == 'w') {
                x--;
            }
        }

        return (float) Math.sqrt(x * x + y * y);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the path(Enter 'E' for east, 'W' for west, 'N' for north, 'S' for south) : ");
        String path = sc.nextLine();

        System.out.print("The shortest path to reach the destination is : " + shortestPath(path));

        sc.close();
    }
}

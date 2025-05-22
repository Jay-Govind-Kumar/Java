import java.util.Scanner;
import java.lang.Math;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        float radius = sc.nextFloat();

        float area = (float) (Math.PI * radius * radius);
        System.out.println("The area of the circle is: " + area);

        sc.close();
    }
}
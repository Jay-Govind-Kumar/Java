// Enter cost of 3 items from the user (using float datatype) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost of the pencil: ");
        float pencilCost = sc.nextFloat();

        System.out.print("Enter the cost of the pen: ");
        float penCost = sc.nextFloat();

        System.out.print("Enter the cost of the eraser: ");
        float eraserCost = sc.nextFloat();

        // Calculating total cost & GSt
        float totalCost = pencilCost + penCost + eraserCost;
        float gst = totalCost * 0.18f;
        float totalWithGST = totalCost + gst;

        System.out.println("The total cost of the items is: " + totalCost);
        System.out.println("The total cost with GST is: " + totalWithGST);

        sc.close();
    }
}

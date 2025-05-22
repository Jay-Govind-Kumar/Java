/* Input in java */

/*  use the package in first line - import java.util.*;
    use this - Scanner sc = new Scanner(System.in);
        sc.close();         -- use this line in new version of java
 */

import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input
        System.out.print("Enter your Salutation : ");
        String salutation = sc.nextLine();
        System.out.print("Enter your Full Name : ");
        String fullName = sc.nextLine();
        System.out.print("Enter your age: ");
        byte age = sc.nextByte();
        System.out.print("Are you Graduated ? (true/false)");
        boolean graduated = sc.nextBoolean();
        System.out.print("Enter your last semester marks : ");
        float marks = sc.nextFloat();
        System.out.print("Enter your Mobile Number : ");
        long mobileNumber = sc.nextLong();

        // Output
        System.out.println("---------------------------------------------");
        System.out.println("Your name is                : " + salutation + " " + fullName);
        System.out.println("Your age is                 : " + age);
        System.out.println("Are you graduated           : " + graduated);
        System.out.println("Your last semester marks is : " + marks);
        System.out.println("Your mobile number is       : " + mobileNumber);

        sc.close();
    }
}
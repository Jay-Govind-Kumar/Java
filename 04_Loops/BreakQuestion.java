/*
    Write a program that prompts the user to enter their name, if the name starts with 'A' or 'a',
    the program should print "Goodbye, [name]!" and terminate. If the name does not start with 'A' or 'a', the program should print "Hello Coder, [name]!" and prompts again for the name.
*/

import java.util.Scanner;

public class BreakQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter a name: ");
            String name = sc.nextLine();

            if (name.charAt(0) == 'A' || name.charAt(0) == 'a') {
                System.out.print("Goodbye, " + name + " !\n");
                break;
            }
            System.out.print("Hello Coder, " + name + " !\n");

        } while (true);

        System.out.print("Thank You");

        sc.close();
    }
}

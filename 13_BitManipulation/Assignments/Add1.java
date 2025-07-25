import java.util.Scanner;

public class Add1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print(num + " + 1 = " + (-~num));

        sc.close();
    }
}

// Since, -num = (~num + 1)
// ~num + 1 = -(num + 1) + 1 = -num
// -~num = num + 1
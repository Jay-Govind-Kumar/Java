import java.util.Scanner;

public class ConvertInLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' ') + " ");
        }

        sc.close();
    }
}

//   01000001 (binary for 'A' = 65)
// | 00100000 (binary for ' ' = 32)
// -------------
//  01100001 (result = 97, which is 'a')
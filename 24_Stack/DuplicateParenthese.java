import java.util.Stack;

public class DuplicateParenthese {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() == '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    s.pop(); // pop the opening parenthesis
                }
            } else {
                // opening
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b)+((c+d)))";
        if (isDuplicate(str)) {
            System.out.println("Duplicate Parentheses found");
        } else {
            System.out.println("No Duplicate Parentheses found");
        }
    }
}

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isvalidParenthesis(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') { // Opening bracket
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '[' && ch == ']')) { // Closing bracket
                    s.pop();
                } else {
                    return false;
                }
            }

        }

        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "(({[]}{}))";
        if (isvalidParenthesis(str)) {
            System.out.println("The Parenthesis is valid");
        } else {
            System.out.println("The Parenthesis is not valid");
        }
    }
}
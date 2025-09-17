public class Subsets {

    public static void generateSubsets(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.print("null");
            } else {
                System.out.print(ans + " ");
            }
            return;
        }

        // yes choice
        generateSubsets(str, ans + str.charAt(i), i + 1);
        // no choice
        generateSubsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        generateSubsets(str, "", 0);
    }
}

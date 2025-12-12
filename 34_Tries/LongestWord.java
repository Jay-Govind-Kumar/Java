public class LongestWord {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.eow = true;
    }

    public static String longest = "";

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        // change the loop condition if you want to get lexicographically longest prefix
        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                char ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > longest.length()) {
                    longest = temp.toString();
                }
                longestWord(root.children[i], temp);
                // backtrack step -> remove last char
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String[] words = { "a", "banana", "app", "appl", "ap", "apply", "apple" };
        for (String word : words) {
            insert(word);
        }
        longestWord(root, new StringBuilder());
        System.out.println(longest);
    }
}

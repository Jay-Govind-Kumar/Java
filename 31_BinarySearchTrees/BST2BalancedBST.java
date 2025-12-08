import java.util.ArrayList;

public class BST2BalancedBST {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void getInOrder(Node root, ArrayList<Integer> inOrder) {
        if (root == null) {
            return;
        }

        getInOrder(root.left, inOrder);
        inOrder.add(root.data);
        getInOrder(root.right, inOrder);
    }

    public static Node createBalancedBST(ArrayList<Integer> inOrder, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(inOrder.get(mid));
        root.left = createBalancedBST(inOrder, start, mid - 1);
        root.right = createBalancedBST(inOrder, mid + 1, end);

        return root;
    }

    public static Node bstToBalancedBST(Node root) {
        // 1st step: convert BST to sorted array
        ArrayList<Integer> inOrder = new ArrayList<>();
        getInOrder(root, inOrder);

        // 2nd step: convert sorted array to balanced BST
        return createBalancedBST(inOrder, 0, inOrder.size() - 1);
    }

    public static void main(String[] args) {

        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        Node balancedRoot = bstToBalancedBST(root);
        preOrder(balancedRoot);
    }
}

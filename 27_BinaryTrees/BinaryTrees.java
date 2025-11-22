import java.util.*;

public class BinaryTrees {

    // Node class representing each node in the binary tree
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Binary Tree class with methods to build and traverse the tree
    static class BinaryTree {
        static int idx = -1;

        // Build Tree from array representation
        public Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // Preorder Traversal
        public void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // Inorder Traversal
        public void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        // Postorder Traversal
        public void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        // Level Order Traversal
        public void levelOrder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        // Height of the Tree
        public int height(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh) + 1;
        }

        // Count of Nodes in the Tree
        public int count(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = count(root.left);
            int rh = count(root.right);
            return lh + rh + 1;
        }

        // Sum of Nodes in the Tree
        public int sum(Node root) {
            if (root == null) {
                return 0;
            }
            int leftSum = sum(root.left);
            int rightSum = sum(root.right);
            return leftSum + rightSum + root.data;
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        // System.out.println("Preorder Traversal:");
        // tree.preOrder(root);

        // System.out.println("\nInorder Traversal:");
        // tree.inOrder(root);

        // System.out.println("\nPostorder Traversal:");
        // tree.postOrder(root);

        // System.out.println("\nLevel Order Traversal:");
        // tree.levelOrder(root);

        // System.out.println("Height of the tree: " + tree.height(root));

        // System.out.println("Count of nodes in the tree: " + tree.count(root));

        System.out.println("Sum of all nodes in the tree: " + tree.sum(root));
    }
}
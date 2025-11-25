public class DiameterOfTree {
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

        // Height of the tree
        public int height(Node root) {
            if (root == null) {
                return 0;
            }

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }

        // Diameter of the tree - Approach 1 (O(n^2) time complexity)
        public int diameter1(Node root) {
            if (root == null) {
                return 0;
            }

            int leftDiam = diameter1(root.left);
            int leftHeight = height(root.left);
            int rightDiam = diameter1(root.right);
            int rightHeight = height(root.right);

            int selfDiam = leftHeight + rightHeight + 1;

            return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
        }

        // Diameter of the tree - Approach 2 (O(n) time complexity)
        public class Info {
            int diam;
            int ht;

            Info(int diam, int ht) {
                this.diam = diam;
                this.ht = ht;
            }
        }

        public Info diameter2(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }

            Info leftInfo = diameter2(root.left);
            Info rightInfo = diameter2(root.right);

            int selfDiam = leftInfo.ht + rightInfo.ht + 1;

            int maxDiam = Math.max(selfDiam, Math.max(leftInfo.diam, rightInfo.diam));
            int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

            return new Info(maxDiam, ht);
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Diameter of the tree (Approach 1): " + tree.diameter1(root));
        System.out.println("Diameter of the tree (Approach 2): " + tree.diameter2(root).diam);
    }
}

public class KthLevel {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Using Recursion
    public static void kthLevel(Node root, int level, int k){
        if ( root == null){
            return;
        }

        if (level == k){
            System.out.print(root.data + " ");
            return;
        }

        kthLevel(root.left, level + 1, k);
        kthLevel(root.right, level + 1, k);
    }

    // Using Level Order Traversal
    /*
    public static void kthLevelIterative(Node root, int k){
        if (root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int level = 1;

        while (!q.isEmpty()){
            Node curr = q.remove();
            if (curr == null){
                if (q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                    level++;
                    continue;
                }
            }

            if (level == k){
                System.out.print(curr.data + " ");
            }

            if (curr.left != null){
                q.add(curr.left);
            }

            if (curr.right != null){
                q.add(curr.right);
            }
        }
    }
    */

    public static void main(String[] args) {
        /**
         *      1
         *     / \
         *    2   3
         *   / \ / \
         *  4  5 6  7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 3;
        kthLevel(root, 1, k);
    }
}

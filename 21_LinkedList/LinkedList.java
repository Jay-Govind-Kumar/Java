public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add First - O(1)
    public void addFirst(int data) {

        // Step 1: Create a new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2: newNode next = head
        newNode.next = head;

        // Step 3: head = newNode
        head = newNode;
    }

    // Add Last - O(1)
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Add at Position - O(n)
    public void addAtPosition(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        // i = index - 1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

    }

    // Print LinkedList
    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Remove First - O(1)
    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linkedist is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Remove Last - O(n)
    public int removeLast() {
        if (size == 0) {
            System.out.println("Linkedist is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = tail.data;
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        tail = temp;
        tail.next = null;

        size--;
        return val;
    }

    // Iterative Search - O(n)
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    // Helper for Recursive Search
    private int recHelper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }

        int i = recHelper(head.next, key);
        if (i == -1) {
            return -1;
        }
        return i + 1;
    }

    // Recursive Search - O(n)
    public int recSearch(int key) {
        return recHelper(head, key);
    }

    // Reverse LinkedList - O(n)
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Remove nth Node from end - O(n)
    public void removeNthFromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next; // remove first
            return;
        }

        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addAtPosition(2, 3);

        ll.print();
        System.out.println(LinkedList.size);

        // System.out.println(ll.removeFirst());
        // ll.print();

        // System.out.println(ll.removeLast());
        // ll.print();

        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(10));

        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(10));

        // ll.reverse();
        // ll.print();

        ll.removeNthFromEnd(2);
        ll.print();
    }
}

public class DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Remove First
    public int removeFirst() {
        if (size == 0) {
            System.out.println("Doubly Linked List is empty");
            return -1;
        }
        int val = head.data;
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return val;
    }

    // Remove Last
    public int removeLast() {
        if (size == 0) {
            System.out.println("Doubly Linked List is empty");
            return -1;
        }
        int val = tail.data;
        if (size == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return val;
    }

    // Reverse the Doubly Linked List
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(3);
        dll.addLast(4);

        System.out.println("Size: " + DoublyLL.size);
        dll.print();
        dll.reverse();
        dll.print();
    }
}

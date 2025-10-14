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

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addAtPosition(2, 9);
        ll.print();

        System.out.println(LinkedList.size);
    }
}

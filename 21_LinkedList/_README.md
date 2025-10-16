<h1 align="center">Day 21</h1>

- Learned about `LinkedList` in Java.

# Introduction

- Linked List is a linear data structure which stores the data in non-contiguous memory. It is also called as a dynamic array.
- A linked list contains a series of connected nodes. Each node stores a data field and a reference (pointer) to the next node.
- The first node is called the head and the last node is called the tail.

## Code

```java
public class Node {
    public static class Node(){
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
    }
}
```

- Learned about some basic operations of Linked List.
  - Add a node at the beginning of the Linked List.
  - Add a node at the end of the Linked List.
  - Add a node at a specific position in the Linked List.
  - Delete a node from the Linked List.
  - Search for a node in the Linked List.
  - Print the Linked List.

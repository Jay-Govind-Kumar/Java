import java.util.*;

public class DequeUse {
    public static class Stack {
        Deque<Integer> deque = new ArrayDeque<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }

    }

    public static class Queue {
        Deque<Integer> deque = new ArrayDeque<>();

        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            return deque.removeFirst();
        }

        public int peek() {
            return deque.getFirst();
        }
    }

    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack:");
        while (!stack.deque.isEmpty()) {
            System.out.println(stack.pop());
        }

        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Queue:");
        while (!queue.deque.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
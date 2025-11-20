import java.util.*;

public class MyDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addLast(4);

        deque.removeFirst();
        deque.removeLast();

        System.out.println(deque);
    }
}

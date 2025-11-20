import java.util.*;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>(); // can also use LinkedList at place of ArrayDeque

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

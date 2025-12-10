import java.util.*;

public class NRopes {
    public static void main(String[] args) {
        int[] ropes = { 2, 3, 3, 4, 6 };

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        int cost = 0;

        while (pq.size() > 1) {
            int firstMin = pq.remove();
            int secMin = pq.remove();

            int newRope = firstMin + secMin;
            cost += newRope;
            pq.add(newRope);

        }

        System.out.println("Cost to connect all ropes: " + cost);
    }
}

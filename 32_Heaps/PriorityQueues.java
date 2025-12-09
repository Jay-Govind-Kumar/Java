import java.util.*;

public class PriorityQueues {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student obj) {
            return this.rank - obj.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3);
        pq.add(2);
        pq.add(1);
        pq.add(4);
        pq.add(5);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }

        PriorityQueue<Student> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

        pq1.add(new Student("A", 5));
        pq1.add(new Student("B", 2));
        pq1.add(new Student("C", 1));
        pq1.add(new Student("D", 4));
        pq1.add(new Student("E", 3));

        while (!pq1.isEmpty()) {
            System.out.println(pq1.peek().name + " -> " + pq1.peek().rank);
            pq1.remove();
        }
    }
}

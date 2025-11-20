public class QueueCircular {
    static class Queue {
        int arr[];
        int front;
        int rear;
        int size;

        Queue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        public boolean isEmpty() {
            return ((front == -1) && (rear == -1));
        }

        public boolean isFull() {
            return ((rear + 1) % size) == front;
        }

        // Add element at rear
        public void add(int data) {
            if (isFull()) {
                System.out.print("Queue is full");
                return;
            }
            // First element to be added
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove element from front
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // Peek element at front
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.add(1);
        q.add(2);
        q.remove();
        q.add(3);
        q.remove();
        q.add(4);
        q.add(5);
        q.add(6);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

}

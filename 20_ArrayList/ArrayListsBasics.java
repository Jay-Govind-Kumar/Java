import java.util.ArrayList;

public class ArrayListsBasics {
    public static void main(String[] args) {
        // create
        ArrayList<Integer> numbers = new ArrayList<>();

        // add
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);

        // get
        int element = numbers.get(1);
        System.out.println(element);

        // set
        numbers.set(1, 200);
        System.out.println(numbers);

        // remove
        numbers.remove(0);
        System.out.println(numbers);

        // size
        int size = numbers.size();
        System.out.println(size);

        // contains
        boolean has30 = numbers.contains(30);
        System.out.println(has30);
    }
}

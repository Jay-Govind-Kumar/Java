import java.util.*;
public class Sort {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);
        System.out.println("Before sorting: " + list);
        Collections.sort(list);
        System.out.println("After sorting: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After reverse sorting: " + list);
    }
}

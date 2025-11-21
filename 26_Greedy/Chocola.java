import java.util.*;

public class Chocola {
    public static void main(String[] args) {

        Integer[] costVer = { 2, 1, 3, 1, 4 };
        Integer[] costHor = { 4, 1, 2 };

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0; // horizontal and vertical pointer
        int hp = 1, vp = 1; // horizontal and vertical pieces
        int totalCost = 0; // total cost

        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] <= costHor[h]) { // horizontal cut
                totalCost += costHor[h] * vp;
                hp++;
                h++;
            } else {
                totalCost += costVer[v] * hp;
                vp++;
                v++;
            }
        }

        while (h < costHor.length) {
            totalCost += costHor[h] * vp;
            hp++;
            h++;
        }

        while (v < costVer.length) {
            totalCost += costVer[v] * hp;
            vp++;
            v++;
        }

        System.out.println("Total Cost: " + totalCost);
    }
}

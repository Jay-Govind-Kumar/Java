import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };

        // Sort the activities on the basis of end time if not already sorted
        int[][] activities = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i; // Activity index
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lambda function to sort based on end time
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // Sorted on the basis of end time
        int maxAct = 0;
        ArrayList<Integer> selectedActivities = new ArrayList<>();

        // 1st activity always gets selected
        maxAct = 1;
        selectedActivities.add(0);
        int lastEnd = end[0];

        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                // select the activity
                maxAct++;
                selectedActivities.add(i);
                lastEnd = end[i];
            }
        }

        // Print the selected activities
        System.out.println("Maximum number of activities: " + maxAct);
        for (int index : selectedActivities) {
            System.out.print("A" + index + " ");// Activity numbering starts from A0
        }
    }
}

import java.util.*;

public class JobSequencing {
    public static class Job {
        int profit;
        int deadline;
        int id;

        Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static int calculateProfit(int[][] jobsInfo, ArrayList<Integer> seq) {
        int profit = 0;
        for (int i = 0; i < seq.size(); i++) {
            profit += jobsInfo[seq.get(i)][1];
        }
        return profit;
    }

    public static void main(String[] args) {

        // Each job is represented as {deadline, profit}
        int[][] jobsInfo = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        // Sort by profit (descending)
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for (Job j : jobs) {
            maxDeadline = Math.max(maxDeadline, j.deadline);
        }

        int[] slot = new int[maxDeadline + 1];
        Arrays.fill(slot, -1);

        ArrayList<Integer> seq = new ArrayList<>();

        for (Job job : jobs) {
            // try to place job at latest free time before its deadline
            for (int t = job.deadline; t > 0; t--) {
                if (slot[t] == -1) {
                    slot[t] = job.id;
                    seq.add(job.id);
                    break;
                }
            }
        }

        System.out.println("The maximum number of scheduled jobs: " + seq.size());
        System.out.println("The job sequence is: " + seq);
        System.out.println("The maximum profit is: " + calculateProfit(jobsInfo, seq));
    }
}
import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {

    static public class Job {
        int deadline;
        int profit;
        int id;

        public Job(int d, int p, int i) {
            this.deadline = d;
            this.profit = p;
            this.id = i;
        }

    }

    public static void main(String[] args) {
        int jobInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(jobInfo[i][0], jobInfo[i][0], i));
        }

        Collections.sort(jobs, (a, b) -> b.profit - a.profit); // Decending

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

    }
}

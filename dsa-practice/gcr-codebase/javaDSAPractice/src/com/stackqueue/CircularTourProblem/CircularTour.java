package com.stackqueue.CircularTourProblem;
import java.util.LinkedList;
import java.util.Queue;

public class CircularTour {

    // Returns starting pump index, or -1 if tour is not possible
    public static int findStartingPump(PetrolPump[] pumps) {

        Queue<Integer> queue = new LinkedList<>();
        int surplus = 0;
        int start = 0;
        int n = pumps.length;

        for (int i = 0; i < n; i++) {

            surplus += pumps[i].petrol - pumps[i].distance;
            queue.add(i);

            // If surplus becomes negative, reset the tour
            while (surplus < 0 && !queue.isEmpty()) {
                int removed = queue.poll();
                surplus -= (pumps[removed].petrol - pumps[removed].distance);
                start = removed + 1;
            }
        }

        return queue.size() == n ? start : -1;
    }
}

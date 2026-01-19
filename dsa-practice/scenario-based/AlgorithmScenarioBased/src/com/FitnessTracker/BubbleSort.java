package com.FitnessTracker;
class BubbleSort {

    public static void sort(User[] users) {
        int n = users.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (users[j].getSteps() < users[j + 1].getSteps()) {
                    User temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                    swapped = true;
                }
            }

            // Optimization: stop if already sorted
            if (!swapped) break;
        }
    }
}

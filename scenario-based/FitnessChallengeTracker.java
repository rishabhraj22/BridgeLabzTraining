public class FitnessChallengeTracker {

    public static void main(String[] args) {

        // Declaring array to store push-ups for 7 days
        int[] pushUpsPerDay = {30, 0, 25, 40, 0, 35, 20};

        // Variables to store total push-ups and workout days
        int totalPushUps = 0;
        int workoutDays = 0;

        // Looping through push-ups using for-each loop
        for (int pushUps : pushUpsPerDay) {

            if (pushUps == 0) {
                continue;
            }

            // Adding push-ups to total
            totalPushUps = totalPushUps + pushUps;

            // Counting workout days
            workoutDays++;
        }

        // Calculating average push-ups per workout day
        double averagePushUps = 0;
        if (workoutDays > 0) {
            averagePushUps = (double) totalPushUps / workoutDays;
        }

        // Displaying fitness summary
        System.out.println("--- Sandeep’s Fitness Report ---");
        System.out.println("Total Push-ups: " + totalPushUps);
        System.out.println("Workout Days: " + workoutDays);
        System.out.println("Average Push-ups per Workout Day: " + averagePushUps);
    }
}

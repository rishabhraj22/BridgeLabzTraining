import java.util.Random;

public class StudentScoreCard {

    // Generate random PCM scores (2-digit) for students
    public static int[][] generatePCMScores(int students) {

        int[][] scores = new int[students][3];
        Random rand = new Random();

        for (int i = 0; i < students; i++) {
            scores[i][0] = rand.nextInt(100); // Physics
            scores[i][1] = rand.nextInt(100); // Chemistry
            scores[i][2] = rand.nextInt(100); // Maths
        }
        return scores;
    }

    // Calculate total, average and percentage
    public static double[][] calculateResults(int[][] scores) {

        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // Calculate grade based on percentage
    public static String[][] calculateGrades(double[][] results) {

        String[][] grades = new String[results.length][1];

        for (int i = 0; i < results.length; i++) {

            double percent = results[i][2];

            if (percent >= 80)
                grades[i][0] = "A";
            else if (percent >= 70)
                grades[i][0] = "B";
            else if (percent >= 60)
                grades[i][0] = "C";
            else if (percent >= 50)
                grades[i][0] = "D";
            else if (percent >= 40)
                grades[i][0] = "E";
            else
                grades[i][0] = "R";
        }
        return grades;
    }

    // d. Display scorecard
    public static void displayScoreCard(int[][] scores, double[][] results, String[][] grades) {

        System.out.println("\nStudent\tPhysics\tChem\tMath\tTotal\tAverage\t%\tGrade");
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" + (int) results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\t" + grades[i][0]);
        }
    }

    public static void main(String[] args) {

        int students = 10;

        int[][] pcmScores = generatePCMScores(students);
        double[][] results = calculateResults(pcmScores);
        String[][] grades = calculateGrades(results);

        displayScoreCard(pcmScores, results, grades);
    }
}

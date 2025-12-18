public class AverageMarksPCM {
    public static void main(String[] args){

        // Marks obtained by Sam
        int mat = 94;
        int phy = 95;
        int chem = 96;

        // Total marks obtained
        int totalMarks = mat + phy + chem;

        int maxMarks = 300;

        // Calculate average percentage
        double averagePercentage = (totalMarks * 100.0) / maxMarks;

        // Displaying the average percentage marks
        System.out.println("Sam’s average mark in PCM is " + averagePercentage + "%");
    }
}

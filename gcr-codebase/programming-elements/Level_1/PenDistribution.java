// Creating class PenDistribution

class PenDistribution {
    public static void main(String[] args) {

        // Declaring variables
        int totalPens = 14;
        int totalStudents = 3;

        // Calculating pens per student
        int pensPerStudent = totalPens / totalStudents;

        // Calculating remaining pens
        int remainingPens = totalPens % totalStudents;

        // Displaying pens per student and remaining pens
        System.out.println(
                "The Pen Per Student is " + pensPerStudent +
                " and the remaining pen not distributed is " + remainingPens
        );
    }
}

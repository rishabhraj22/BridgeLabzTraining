public class ZaraBonusCalculator {

    // Method to generate salary and years of service
    public static double[][] generateEmployeeData(int employees) {

        double[][] data = new double[employees][2];

        for (int i = 0; i < employees; i++) {
            // Generating 5-digit salary (10000–99999)
            data[i][0] = (int) (Math.random() * 90000) + 10000;

            // Generating years of service (1–10)
            data[i][1] = (int) (Math.random() * 10) + 1;
        }

        return data;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(double[][] data) {

        double[][] result = new double[data.length][2];

        for (int i = 0; i < data.length; i++) {

            double salary = data[i][0];
            double years = data[i][1];
            double bonusRate;

            // Bonus logic
            if (years > 5) {
                bonusRate = 0.05;
            } else {
                bonusRate = 0.02;
            }

            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }

        return result;
    }

    // Method to calculate and display totals in tabular format
    public static void displaySummary(double[][] data, double[][] result) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");

        for (int i = 0; i < data.length; i++) {

            double oldSalary = data[i][0];
            double years = data[i][1];
            double newSalary = result[i][0];
            double bonus = result[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.println((i + 1) + "\t" + oldSalary + "\t" + years + "\t" + bonus + "\t" + newSalary);
        }

        System.out.println("-------------------------------------------------");
        System.out.println("TOTAL\t" + totalOldSalary + "\t\t" + totalBonus + "\t" + totalNewSalary);
    }

    public static void main(String[] args) {

        int employees = 10;

        // Generate employee salary and service years
        double[][] employeeData = generateEmployeeData(employees);

        // Calculate new salary and bonus
        double[][] bonusData = calculateBonus(employeeData);

        // Display final result
        displaySummary(employeeData, bonusData);
    }
}

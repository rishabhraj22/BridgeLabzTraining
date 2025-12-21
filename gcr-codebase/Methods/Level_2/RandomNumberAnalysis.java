public class RandomNumberAnalysis {

    // Method to generate array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }

        return numbers;
    }

    // Method to find average, minimum and maximum
    public static double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        
		// Calculating sum
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        // Generating 5 random numbers
        int[] numbers = generate4DigitRandomArray(5);

        // Displaying generated numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Finding average, min and max
        double[] result = findAverageMinMax(numbers);

        // Display average, min and max
        System.out.println("Average value: " + result[0]);
        System.out.println("Minimum value: " + (int) result[1]);
        System.out.println("Maximum value: " + (int) result[2]);
    }
}

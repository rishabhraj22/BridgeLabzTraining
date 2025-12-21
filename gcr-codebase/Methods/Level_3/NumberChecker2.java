import java.util.Scanner;

public class NumberChecker2 {

    // Method to find count of digits
    public static int countDigits(int number) {
        number = Math.abs(number);
        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store digits of the number in an array
    public static int[] storeDigits(int number) {
        number = Math.abs(number);
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find sum of digits
    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static double findSumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check if number is Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sumOfDigits = findSumOfDigits(digits);
        return sumOfDigits != 0 && number % sumOfDigits == 0;
    }

    // Method to find frequency of each digit
    public static int[][] findDigitFrequency(int[] digits) {

        int[][] frequency = new int[10][2];

        // Initializing digit column
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // digit
            frequency[i][1] = 0; // frequency
        }

        // Counting frequency
        for (int d : digits) {
            frequency[d][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Counting digits
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        // Storing digits
        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        // Sum of digits
        int sum = findSumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        // Sum of squares of digits
        double sumOfSquares = findSumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        // Checking Harshad number
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));

        // Frequency of digits
        int[][] frequency = findDigitFrequency(digits);
        System.out.println("Digit\tFrequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "\t" + frequency[i][1]);
            }
        }

        sc.close();
    }
}

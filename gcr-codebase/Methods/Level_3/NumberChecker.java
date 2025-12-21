import java.util.Scanner;

public class NumberChecker {

    // Method to find count of digits in a number
    public static int countDigits(int number) {
        int count = 0;
        number = Math.abs(number);

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

    // Method to check if number is a Duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if number is an Armstrong number
    public static boolean isArmstrongNumber(int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }

        // Reconstruct original number from digits
        int original = 0;
        for (int d : digits) {
            original = original * 10 + d;
        }

        return sum == original;
    }

    // Method to find largest and second largest digit
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest digit
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
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

        // Checking Duck number
        System.out.println("Is Duck Number: " + isDuckNumber(digits));

        // Checking Armstrong number
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(digits));

        // Largest & second largest
        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largest[0]);
        System.out.println("Second largest digit: " + largest[1]);

        // Smallest & second smallest
        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallest[0]);
        System.out.println("Second smallest digit: " + smallest[1]);

        sc.close();
    }
}

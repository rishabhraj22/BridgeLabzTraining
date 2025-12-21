import java.util.Scanner;

public class FriendsComparison {

    // Method to find the youngest friend
    public static String findYoungest(int[] ages, String[] names) {

        int minIndex = 0;
        
		// Finding youngest index
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }

        return names[minIndex];
    }

    // Method to find the tallest friend
    public static String findTallest(double[] heights, String[] names) {

        int maxIndex = 0;
        
		// Finding tallest index
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }

        return names[maxIndex];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        // Finding youngest and tallest
        String youngest = findYoungest(ages, names);
        String tallest = findTallest(heights, names);

        // Displaying youngest and tallest
        System.out.println("Youngest friend is: " + youngest);
        System.out.println("Tallest friend is: " + tallest);

        sc.close();
    }
}

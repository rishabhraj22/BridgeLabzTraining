import java.util.Scanner;
public class YoungestAndTallestFriend {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Defining array to store names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Defining arrays to store ages and heights of 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < names.length; i++) {
            ages[i] = input.nextInt();
            heights[i] = input.nextDouble();
        }

        // Initializing variables to track youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Looping through arrays to find youngest and tallest friend
        for (int i = 1; i < names.length; i++) {

            // Checking for youngest age
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            // Checking for tallest height
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Displaying the youngest friend
        System.out.println("The youngest friend is " + names[youngestIndex]);

        // Displaying the tallest friend
        System.out.println("The tallest friend is " + names[tallestIndex]);

        input.close();
    }
}

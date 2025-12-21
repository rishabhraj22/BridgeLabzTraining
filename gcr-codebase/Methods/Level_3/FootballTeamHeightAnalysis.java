public class FootballTeamHeightAnalysis {

    // Method to generate random heights between 150 and 250 cm
    public static int[] generateRandomHeights(int size) {

        int[] heights = new int[size];

        for (int i = 0; i < size; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }

        return heights;
    }

    // Method to find sum of all heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // Method to find mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        // Creating heights array
        int[] heights = generateRandomHeights(11);

        // Displaying heights
        System.out.println("Heights of football players (in cm):");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        // Calculations of heights
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = findMean(heights);

        // Display heights
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.println("Mean height: " + mean + " cm");
    }
}

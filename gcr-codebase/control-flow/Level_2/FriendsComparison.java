import java.util.Scanner;
public class FriendsComparison {
    public static void main(String[] args) {

        // Declaring variables to store ages and heights
        int amarAge;
        int akbarAge;
        int anthonyAge;
        double amarHeight;
        double akbarHeight;
        double anthonyHeight;

        Scanner input = new Scanner(System.in);
        amarAge = input.nextInt();
        amarHeight = input.nextDouble();
        akbarAge = input.nextInt();
        akbarHeight = input.nextDouble();
        anthonyAge = input.nextInt();
        anthonyHeight = input.nextDouble();

        // Finding the youngest friend
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Amar is the youngest friend");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Akbar is the youngest friend");
        } else {
            System.out.println("Anthony is the youngest friend");
        }

        // Finding the tallest friend
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Amar is the tallest friend");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Akbar is the tallest friend");
        } else {
            System.out.println("Anthony is the tallest friend");
        }
    }
}

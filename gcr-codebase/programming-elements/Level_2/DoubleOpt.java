import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declaring double variables a, b, and c
        double a;
        double b;
        double c;

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        // Performing operations based on operator precedence
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Displaying the results
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}

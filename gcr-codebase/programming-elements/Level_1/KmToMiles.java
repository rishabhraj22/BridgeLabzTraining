// Creating class KmToMiles

class KmToMiles {
    public static void main(String[] args) {

        // Declaring variables
        double kilometers = 10.8;
        double conversionFactor = 1.6;

        // Converting kilometers to miles
        double miles = kilometers / conversionFactor;

        // Displaying the miles
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}

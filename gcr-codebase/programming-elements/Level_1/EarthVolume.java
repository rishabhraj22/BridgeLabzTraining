// Creating class EarthVolume

public class EarthVolume {
    public static void main(String[] args){

        // Declaring the radius and value of pi
        double radiusKm = 6378;
        double pi = 3.14;

        // Calculating the volume of Earth in cubic kilometers
        double volumeKm = (4.0/3.0) * pi * radiusKm * radiusKm * radiusKm;
        double kmToMiles = 0.621371;

        // Converting volume from cubic kilometers to cubic miles
        double volumeMiles = volumeKm * kmToMiles * kmToMiles * kmToMiles;

        // Displaying the volume of the earth
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}

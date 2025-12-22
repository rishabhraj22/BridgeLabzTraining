public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        // Generates OTP between 100000 and 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check if all OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otps) {

        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] otps = new int[10];

        // Generating 10 OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Displaying OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.print(otp + " ");
        }
        System.out.println();

        // Checking uniqueness
        boolean isUnique = areOTPsUnique(otps);

        if (isUnique) {
            System.out.println("All generated OTPs are unique.");
        } else {
            System.out.println("Duplicate OTP found.");
        }
    }
}

import java.util.Scanner;
public class PosNegZero{
    
	// Method to check number for positive, negative and zero
	public static int positiveNegativeZero(int number){
	    
		// Checking for positive number, negative number and zero
		if (number > 0){
		    return 1;
		} else if (number < 0){
		    return -1;
		}else{
		    return 0;
		}
	}
	
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	
	// Determining number as positive or negative or zero
	int result = positiveNegativeZero(number);
	
	// Displaying the result
	System.out.println(result);
	
	}
	}


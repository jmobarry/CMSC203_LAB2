import java.util.Scanner;

public class NumericTypes {
	public static void main (String [] args) {

		
		final double NUMBER = 2; 
		//int score1 = 95;
		//int score2 = 100;
		int score1; 
		int score2 ; 
		final double BOILING_IN_F = 212;
		double fToC; 
		double fToC2;
		double factor = (5.0/9.0);
		double average; 
		double usertemp;
		String output; 
		
		
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.println("Enter score 1: ");
		score1 = keyboard.nextInt();
		
		System.out.println("Enter Score 2:");
		score2 = keyboard.nextInt();
		
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;
		System.out.println(output);
		System.out.print("\n");
		
		
		fToC =  (BOILING_IN_F - 32)* factor ;
		output = (BOILING_IN_F + " in Fahrenheit is " +fToC+ " in Celsius.");
		System.out.println(output);

		System.out.println("Enter your temperature: ");
		usertemp = keyboard.nextDouble();
		fToC2 = (usertemp - 32) * factor;
		
		System.out.printf ("Your temperature %.1f in Fahrenheit is %.1f in Celsius.\n", usertemp, fToC2);
		
	
		
		//Task #2 read the user’s temperature in F
		//Task #2 convert the user’s temperature to C
		//Task #2 print the user’s temperature in C
		System.out.println("Goodbye"); // to show that the program is ended	
	}

}

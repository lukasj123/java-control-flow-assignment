import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		// 1. Initialize any variables and objects you need (i.e. a scanner, some
		// counters for a total running sum, and a number tracking the # of scores inputted

		Scanner sc = new Scanner(System.in);
		int i = 0; // Counter
		int n = 0; // Number of input scores
		int sum = 0; // Sum variable
		
		
		while(true) {
			System.out.println("\nEnter your grade (as an integer):");
			int num = sc.nextInt();
			
			if (num >= 0 && num <= 100) {
				
				n++;
				sum += num;
				int GPA = sum/n;
				System.out.printf("\nYour class average is: %d\n", GPA);
				
				if (num > 90) {
					System.out.println("Excellent work!\n");
				} else if (num > 80) {
					System.out.println("Good job!\n");
				} else if (num > 70) {
					System.out.println("Keep it up!\n");
				} else {
					System.out.println("Let's work hard to get those grades up!\n");
				}
				
			} else if (num > 100) {
				
				System.out.println("Error: Grades must be between 0 and 100");
				continue;
				
			} else {
				System.out.println("Program terminated due to negative input.");
				break;
				
			}
		}
		
		
		
		// 2. Make a loop that repeatedly asks the user for a number and won't stop
		// until the user answers using a negative number
		// 3. Add some error checking for when a user inputs a number over 100 - we
		// should skip that input and start the loop
		// over to ask again

		
		
		
		
		// 4. Calculate the average of all scores collected during the loop

		
		
		
		
		
		
		// 5. Display the average grade and corresponding message
		// - If over 90: "Excellent Work!"
		// - If over 80: "Good Job!"
		// - If over 70: "Keep it up!"
		// - anything else: "Let's work hard to get those grades up!"

		
		
		
		
	}
}

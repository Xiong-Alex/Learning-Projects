import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int tryCount = 0;
		Boolean running = true;
		Boolean runAgain = true;
		Boolean Repeat = true;

		
		
		do { 
			System.out.println("Welcome to the Number Guessing Game");
			System.out.println();
			while (Repeat) {
			int randomNumber =  rand.nextInt(100)+1;
				while(runAgain) {
					
//					System.out.println(randomNumber);//Hacks (for debugging to see the randomNumber)
					
					System.out.println("Enter your guess (1-100):");
					
					int playerGuess = scanner.nextInt();
					tryCount++;
					
					if (playerGuess == randomNumber) {
						System.out.println("Correct! You Win");
						System.out.println();
						System.out.println("It Took you " + tryCount + " tries");
						System.out.println();
						
						runAgain = false;
					}
					else if (randomNumber > playerGuess) {
						System.out.println("Nope! The Number is higher.");
						System.out.println("Guess Again");
						System.out.println();
					}
					else if (randomNumber < playerGuess){
						System.out.println("Nope! The Number is lower. Guess again.");
						System.out.println("Guess Again");
						System.out.println();
					}					
				}
				
				tryCount = 0; //reset Count
				runAgain = true; //enables the while to run again normally
				
				System.out.println("Would you like to play again?");
				System.out.println("1:Yes | 2: No");
				
				if(scanner.nextInt() !=1) {
					
					running = false;
					Repeat = false;
					
					System.out.println("Thank you for playing!");
				}
			
			}
			
		} while (running);
		
		scanner.close();	
	}
}

/*
	The only bug/error I know of is if the input is a non-integer
		but that should be able to get fix with a try/catch maybe...
		
	Also would be nice to implement a timer for the code to automatically
	restart after 30 seconds of inactivity
 
 	But, future me can deal with this stuff if he decides to do so
 
 */

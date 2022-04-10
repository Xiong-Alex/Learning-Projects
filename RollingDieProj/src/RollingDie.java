import java.util.Random;

public class RollingDie {

	public static void main(String[] args) {
		
		for (int i = 10; i > 0; i--) {
		
		Random dieNumber = new Random ();
		int r = dieNumber.nextInt(6) + 1;	
		
		
		System.out.println("You rolled a: " + r );
		
		}

	}

}

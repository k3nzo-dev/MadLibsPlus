import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MadLibsPlus madLibs = new MadLibsPlus();// calls the MadLibs game
		SimpleFacts simpleFacts = new SimpleFacts();// calls the Facts game

		System.out.println("Hello! What would you like to be called?");
		String userName = scanner.next();
		System.out.println("");
		System.out.println("Welcome " + userName);
		System.out.println("");
		System.out.println("Would you like to use MadLibs or the Math function");
		String choice1 = scanner.next();

		if (choice1.equalsIgnoreCase("madlibs")) {
			System.out.println("");
			System.out.println("Time for a game of MadLibs!");
			System.out.println("");
			madLibs.play();// Starts the Game

		} else if (choice1.equalsIgnoreCase("math")) {

			System.out.println("");
			System.out.println("Now its time for Simple Facts");
			System.out.println("");
			simpleFacts.play();

		} else {
			System.exit(0);
		}

		scanner.close();

	}

}

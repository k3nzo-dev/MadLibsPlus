
/**
* Plays the game MadLibs where it takes user imput
* @author Lorenzo Boschi
* @version 1.0
*/

import java.util.Scanner;

public class SimpleFacts {
	Scanner scanner = new Scanner(System.in);

	public void play() {
		System.out.println("Would you like to caluclate the average(1) \n Caluclate the surface area of a cube(2)"
				+ "\n Find the amount of coins in a dollar amount(3)");
		String choice1 = scanner.next();

		if (choice1.equalsIgnoreCase("1")) {
			System.out.println("Please enter a number");
			int num1 = Integer.parseInt(scanner.next());
			System.out.print("Your sum is now " + num1);
			System.out.println("");

			System.out.println("Please enter a number");
			int num2 = Integer.parseInt(scanner.next());
			System.out.println("Your sum is now " + (num1 + num2));
			System.out.println("");

			System.out.println("Please enter a number");
			int num3 = Integer.parseInt(scanner.next());
			System.out.println("Your sum is now " + (num1 + num2 + num3));
			System.out.println("");

			System.out.println("Please enter a number");
			int num4 = Integer.parseInt(scanner.next());
			System.out.println("Your sum is now " + (num1 + num2 + num3 + num4));
			System.out.println("");

			System.out.println("Please enter a number");
			int num5 = Integer.parseInt(scanner.next());
			System.out.println("Your sum is now " + (num1 + num2 + num3 + num4 + num5));
			System.out.println("");

			System.out.println("Please enter a number");
			int num6 = Integer.parseInt(scanner.next());
			System.out.println("");

			System.out.println("Your final sum is " + (num1 + num2 + num3 + num4 + num5 + num6));
			int total = num1 + num2 + num3 + num4 + num5 + num6;
			double average = total / 6.0;

			System.out.println("");
			System.out.println("The average is " + average);

		} else if (choice1.equalsIgnoreCase("2")) {
			System.out.println("Please enter the height of the cube");
			int height1 = Integer.parseInt(scanner.next());
			System.out.println("");

			System.out.println("Please enter the width	 of the cube");
			int width1 = Integer.parseInt(scanner.next());
			System.out.println("");

			System.out.println("The surface area of the cube is " + ((height1 * width1) * 6) + "");

		} else if (choice1.equalsIgnoreCase("3")) {

			System.out.println("Please enter the amount of money you would like to use in dollars");
			int money = Integer.parseInt(scanner.next());
			int quarters = money / 4;
			money = money % 25;
			if (money > 1) {
				int dimes = money / 10;
				money = money % 10;
				if (money > 1) {
					int nickels = money / 20;
					money = money % 20;
					System.out.print(money + " in coins would be " + quarters + " quarter(s), " + dimes + " dime(s), "
							+ nickels + "nickel(s).");
					if (money > 1) {
						System.out.println(money + " in coins would be " + quarters + " quarter(s), " + dimes
								+ " dime(s), " + nickels + "nickel(s), and " + money + " pennie(s).");
					} else {
						System.out.println("error");
					}
				} else {
					System.out.print(money + " in coins would be " + quarters + " quarters, " + dimes + " dimes.");
				}
			} else {
				System.out.print(money + " in coins would be " + quarters + " quarters.");
			}

		} else {
			System.exit(0);

		}
		scanner.close();
	}

	public SimpleFacts() {
	}

}

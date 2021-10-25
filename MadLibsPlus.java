/**
 * asks the user for their input for the game MadLibs
 * @author Lorenzo Boschi
 * @version 1.0
 */

import java.util.Scanner;

public class MadLibsPlus {
	Scanner scanner = new Scanner(System.in);

	String adjective1;
	String adjective2;
	String adjective3;
	String adjective4;

	String noun1;
	String noun2;
	String animal1;

	String adverb1;
	String adverb2;

	String verb1;
	String verb2;
	String verb3;

	public void play() {
		// gets all the user words
		System.out.println("Give me a adjective or enter \"stop\" to exit");
		adjective1 = scanner.next();

		System.out.println("Give me a nounor enter \"stop\" to exit");
		noun1 = scanner.next();

		System.out.println("Give me a past tense verb or enter \"stop\" to exit");
		verb1 = scanner.next();

		System.out.println("Give me a adverb or enter \"stop\" to exit");
		adverb1 = scanner.next();

		System.out.println("Give me a another adjective or enter \"stop\" to exit");
		adjective2 = scanner.next();

		System.out.println("Give me a another noun or enter \"stop\" to exit");
		noun2 = scanner.next();

		System.out.println("Give me an animal or enter \"stop\" to exit");
		animal1 = scanner.next();

		System.out.println("Give me a another adjective or enter \"stop\" to exit");
		adjective3 = scanner.next();

		System.out.println("Give me a another verb or enter \"stop\" to exit");
		verb2 = scanner.next();

		System.out.println("Give me a another adverb or enter \"stop\" to exit");
		adverb2 = scanner.next();

		System.out.println("Give me a another past tense verb or enter \"stop\" to exit");
		verb3 = scanner.next();

		System.out.println("Give me a another adjective or enter \"stop\" to exit");
		adjective4 = scanner.next();

		// final story print
		System.out.println("Today I went to the zoo. I saw a " + adjective1 + " " + noun1
				+ " jumping up and down in its tree. \n They " + verb1 + " " + adverb1
				+ " through the large tunnel that led to its " + adjective2 + " " + noun2
				+ "\n I got some peanuts and passed them through the cage to a gigantic gray " + animal1
				+ " towering above my head. \n Feeding that animal made me hungry. I went to get a " + adjective3
				+ " scoop of ice cream \n It filled my stomach. Afterwards I had to " + verb2 + " " + adverb2
				+ "to catch our bus.\n When I got home I " + verb3 + " my mom for a " + adjective4
				+ " day at the zoo.");
		scanner.close();

		// adds kill
		while (adjective1.equalsIgnoreCase("stop")) {
			return;
		}
		while (adjective2.equalsIgnoreCase("stop")) {
			return;
		}
		while (adjective3.equalsIgnoreCase("stop")) {
			return;
		}
		while (adjective4.equalsIgnoreCase("stop")) {
			return;
		}
		while (noun1.equalsIgnoreCase("stop")) {
			return;
		}
		while (noun2.equalsIgnoreCase("stop")) {
			return;
		}
		while (animal1.equalsIgnoreCase("stop")) {
			return;
		}
		while (adverb1.equalsIgnoreCase("stop")) {
			return;
		}
		while (adverb2.equalsIgnoreCase("stop")) {
			return;
		}
		while (verb1.equalsIgnoreCase("stop")) {
			return;
		}
		while (verb3.equalsIgnoreCase("stop")) {
			return;
		}
		return;
	}

	public MadLibsPlus() {
	}
}

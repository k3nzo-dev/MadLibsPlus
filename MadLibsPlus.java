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
		System.out.println("Give me a adjective");
		adjective1 = scanner.next();

		System.out.println("Give me a noun");
		noun1 = scanner.next();

		System.out.println("Give me a past tense verb");
		verb1 = scanner.next();

		System.out.println("Give me a adverb");
		adverb1 = scanner.next();

		System.out.println("Give me a another adjective");
		adjective2 = scanner.next();

		System.out.println("Give me a another noun");
		noun2 = scanner.next();

		System.out.println("Give me an animal");
		animal1 = scanner.next();

		System.out.println("Give me a another adjective");
		adjective3 = scanner.next();

		System.out.println("Give me a another verb");
		verb2 = scanner.next();

		System.out.println("Give me a another adverb");
		adverb2 = scanner.next();

		System.out.println("Give me a another verb");
		verb3 = scanner.next();

		System.out.println("Give me a another adjective");
		adjective4 = scanner.next();

		System.out.println("Today I went to the zoo. I saw a " + adjective1 + " " + noun1
				+ " jumping up and down in its tree. \n They " + verb1 + " " + adverb1
				+ " through the large tunnel that led to its " + adjective2 + " " + noun2
				+ "\n I got some peanuts and passed them through the cage to a gigantic gray " + animal1
				+ " towering above my head. \n Feeding that animal made me hungry. I went to get a " + adjective3
				+ " scoop of ice cream \n It filled my stomach. Afterwards I had to " + verb2 + " " + adverb2
				+ "to catch our bus.\n When I got home I " + verb3 + " my mom for a " + adjective4
				+ " day at the zoo.");
		scanner.close();

	}

	public MadLibsPlus() {
	}
}

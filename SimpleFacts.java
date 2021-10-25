
/**
 * provides the math functions
 * @author Lorenzo Boschi
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleFacts {
	Scanner scanner = new Scanner(System.in);

	public void play() {
		System.out.println("Would you like to caluclate the average(1) \n Or caluclate the surface area of a cube(2)"
				+ "\n Or enter \" exit\" to leave");
		String choice1 = scanner.next();
		while (choice1.equalsIgnoreCase("exit")) {
			return;
		}
		if (choice1.equalsIgnoreCase("1")) {
			ArrayList<Integer> inputs = new ArrayList<Integer>();
			int num1 = 0;
			int num2 = 0;
			int num3 = 0;
			int num4 = 0;
			int num5 = 0;
			int num6 = 0;
			int num7 = 0;
			int num8 = 0;
			int num9 = 0;
			int num10 = 0;
			int num11 = 0;
			int num12 = 0;
			/*
			 * grabs all the user imput
			 */
			boolean cont = true;
			while (cont == true) {
				try {
					System.out.println(
							"Please enter a number larger than 0.  Enter a \"Exit\" or \"0\" line to finallize");
					num1 = Integer.parseInt(scanner.next());
					System.out.print("Your sum is now " + num1);
					System.out.println("");

					if (num1 <= 0) {

						cont = false;
					} else {
						inputs.add(num1);
						System.out.println(
								"Please enter a number larger than 0.  Enter a \"Exit\" or \"0\" line to finallize");
						num2 = Integer.parseInt(scanner.next());
						System.out.println("Your sum is now " + (num1 + num2));
						System.out.println("");
						if (num2 <= 0) {
							cont = false;
						} else {
							inputs.add(num2);
							System.out.println(
									"Please enter a number larger than 0.  Enter a \"Exit\" or \"0\" line to finallize");
							num3 = Integer.parseInt(scanner.next());
							System.out.println("Your sum is now " + (num1 + num2 + num3));
							System.out.println("");

							if (num3 <= 0) {
								cont = false;
							} else {
								inputs.add(num3);
								System.out.println(
										"Please enter a number larger than 0.  Enter a \"Exit\" or \"0\" line to finallize");
								num4 = Integer.parseInt(scanner.next());
								System.out.println("Your sum is now " + (num1 + num2 + num3 + num4));
								System.out.println("");
								if (num4 <= 0) {
									cont = false;
								} else {
									inputs.add(num4);
									System.out.println(
											"Please enter a number larger than 0.  Enter a \"Exit\" or \"0\" line to finallize");
									num5 = Integer.parseInt(scanner.next());
									System.out.println("Your sum is now " + (num1 + num2 + num3 + num4 + num5));
									System.out.println("");
									if (num5 <= 0) {
										cont = false;
									} else {
										inputs.add(num5);
										System.out.println(
												"Please enter a number larger than 0.  Enter a \"Exit\" or \"0\" line to finallize");
										num6 = Integer.parseInt(scanner.next());
										System.out.println(
												"Your sum is now " + (num1 + num2 + num3 + num4 + num5 + num6));
										System.out.println("");

										if (num6 <= 0) {
											cont = false;
										} else {
											inputs.add(num6);
											System.out.println(
													"Please enter a number larger than 0.  Enter a \"Exit\" or \"0\" line to finallize");
											num7 = Integer.parseInt(scanner.next());
											System.out.println("Your sum is now "
													+ (num1 + num2 + num3 + num4 + num5 + num6 + num7));
											System.out.println("");

										}
										if (num7 <= 0) {
											cont = false;
										} else {
											inputs.add(num7);
											System.out.println(
													"Please enter a number larger than 0.  Enter a \"Exit\" or \"0\" line to finallize");
											num8 = Integer.parseInt(scanner.next());
											System.out.println("Your sum is now "
													+ (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8));
											System.out.println("");

											if (num8 <= 0) {
												cont = false;
											} else {
												inputs.add(num8);
												System.out.println(
														"Please enter a number larger than 0.  Enter a \"Exit\" or \"0\" line to finallize");
												num8 = Integer.parseInt(scanner.next());
												System.out.println("");
												System.out.println("Your sum is now " + (num1 + num2 + num3 + num4
														+ num5 + num6 + num7 + num8 + num9));

												if (num9 <= 0) {
													cont = false;
												} else {
													inputs.add(num9);
													System.out.println(
															"Please enter a number larger than 0.  Enter a \"Exit\" or \"0\" line to finallize");
													num10 = Integer.parseInt(scanner.next());
													System.out.println("Your sum is now " + (num1 + num2 + num3 + num4
															+ num5 + num6 + num7 + num8 + num9 + num10));
													System.out.println("");

												}
												if (num10 <= 0) {
													cont = false;
												} else {
													inputs.add(num10);
													System.out.println(
															"Please enter a number larger than 0.  Enter a \"Exit\" or \"0\" line to finallize");
													num11 = Integer.parseInt(scanner.next());
													System.out.println("Your sum is now " + (num1 + num2 + num3 + num4
															+ num5 + num6 + num7 + num8 + num9 + num10 + num11));
													System.out.println("");

												}
												if (num11 <= 0) {
													cont = false;
												} else {
													inputs.add(num11);
													System.out.println(
															"Please enter a number larger than 0.  Enter a \"Exit\" or \"0\" line to finallize");
													num12 = Integer.parseInt(scanner.next());
													System.out.println("Your sum is now "
															+ (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8
															+ num9 + num10 + num11 + num12));
													System.out.println("");

													if (num12 <= 0) {
														cont = false;
													} else {
														inputs.add(num12);
													}
												}
											}
										}
									}
								}

							}
						}
					}

				} catch (Exception e) {
					cont = false;
				}
			}

			double numbers = (double) inputs.size();
			// find the total regardless of length
			int total = 0;
			int i = 0;
			while (i < numbers) {
				total = inputs.get(i) + total;
				i++;
			}
			System.out.println("Your final sum is " + total);

			// fix the (1,2,3) miscalucation
			double average = total / (numbers);

			System.out.println("");
			System.out.println("The average is " + average);

		} else if (choice1.equalsIgnoreCase("2")) {
			// takes the of the cube dimentions
			System.out.println("Please enter the height of the cube");
			int height = Integer.parseInt(scanner.next());
			System.out.println("");

			System.out.println("Please enter the width	 of the cube");
			int width = Integer.parseInt(scanner.next());
			System.out.println("");

			// finds one side of the cube multiply and by 6
			System.out.println("The surface area of the cube is " + ((height * width) * 6) + "");

		} else {
			scanner.close();

			return;

		}
		return;
	}

	public SimpleFacts() {
	}

}

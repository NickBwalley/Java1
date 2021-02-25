package javaMath_Methods;

import java.util.Scanner;

public class mathMethods {

	public static void main(String[] args) {
		System.out.println(Math.abs(-23.4));//absolute value (how much from 0 is the value )
		System.out.println(Math.ceil(7.3));//always rounds up a value like 7.3 -> 8.0
		System.out.println(Math.floor(7.8));//always rounds down a value like 7.8 -> 7.0
		System.out.println(Math.max(14, 17));//compares two values and returns the highest of the two
		System.out.println(Math.min(19.49, 14));//compares two values and returns the minimum of the two values
		System.out.println(Math.pow(5, 3));// a number raised to which power
		System.out.println(Math.sqrt(81));//takes a number and determines the square-Root
	}
	
	public static void getMax() {
		Scanner input = new Scanner(System.in);
		int num1, num2, result;
		System.out.println("Enter First Number: ");
		num1 = input.nextInt();
		System.out.println("Enter Second Number: ");
		num2 = input.nextInt();
		result = Math.max(num1, num2);
		System.out.printf("Largest Number is: %d", result );
		input.close();
	}

}

package mainClass;

import java.util.Scanner;

public class MainClass {

	private static final int NUMBER_LENGTH = 4;
	private static final int NUMBER_OFFSET = 10;
	
	public static void main(String[] args) {
		int number = 4321;
		int secondNumber = input("Enter a number: ");
		int numberSwap = swappedNumber(number);
		int newConditionNumber = condition(secondNumber);
		String comparison = largerThan(number, numberSwap);
		log(number);
		log(numberSwap);
		log(comparison);
		log(secondNumber + " processed is: " + newConditionNumber);
		printStringNumber();
		boolean isTriangle = isTriangle(input("Enter a number: "),
					input("Enter a number: "), 
					input("Enter a number: "));
		log("Is Triangle: " + isTriangle);
		swapWithoutTemp();
		log("Is leap year: " + isLeapYear(secondNumber));
	}
	
	private static int input(String message) {
		log(message);
		Scanner input = new Scanner(System.in);
		int wholeNumber = input.nextInt();
		return wholeNumber;
	}
	
	private static void log(String message) {
		System.out.println(message);
	}
	
	private static void log(int printNumber) {
		System.out.println(printNumber);
	}
	
	private static int swappedNumber(int number) {
		int reversedNumber = 0;
		for(int i = 0; i < NUMBER_LENGTH; ++i) {
			int temp = number % NUMBER_OFFSET;
			number = number / NUMBER_OFFSET;
			reversedNumber = (reversedNumber + temp) * NUMBER_OFFSET;
		}
		return reversedNumber / NUMBER_OFFSET;
	}
	
	private static String largerThan(int number, int numberSwap) {
		return (number > numberSwap) 
				? number + " is larger than " + numberSwap
				: number + " is not larger than " + numberSwap;
	}
	
	private static int condition(int number) {
		if(number > 0) return number * 10;
		else if(number < 0) return number / 10;
		else return number - 10;
	}
	
	private static void printStringNumber() {
		String number = "1234.56789";
		log(number + " = " + (number.length() - 3));
	}
	
	private static boolean isTriangle(int pointA, int pointB, int pointC) {
		return !(pointA == pointB || pointB == pointC || pointA == pointC);
	}
	
	private static void swapWithoutTemp() {
		int a = 100;
		int b = 30;
		log(a + " " + b);
		a = a + b;
		b = b - a;
		b = a - b;
		log(a + " " + b);
	}
	
	public static boolean isLeapYear(int number) {
		return number % 4 == 0;
	}
	
}









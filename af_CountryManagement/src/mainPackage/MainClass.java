package mainPackage;

import java.util.Scanner;
import java.util.Random;

public class MainClass {
	public static void main(String[] args) {
		methods();
	}
	
	public static void methods() {
		int input = logInt("Enter a number: 1-10 ->");
		int[] numbersArray = inputNumbers(input);
		displayMenu();
		int menuOptionIndex = logInt("Enter menu option index: ");
		logicMenu(numbersArray, menuOptionIndex);
	}
	
	private static void displayMenu() {
		log("1: Sort array");
		log("2: Sort array desc");
		log("3: Search from array");
		log("4: Shuffle array");
		log("5: Sum of numbers");
		log("6: Max number");
		log("7: Min number");
		log("8: The average number of numbers");
		log("9: symetry of numbers");
		log("10: reverse array");
		log("11: see input");
		log("12: exit");
	}

	public static int logicMenu(int[] array, int menuOptionIndex) {
		if(menuOptionIndex == 1) {
			
		}
		
		if(menuOptionIndex == 2) {
			log(bubbleSortDesc(array));
		}
		
		if(menuOptionIndex == 3) {
			pickArrayNumber(array);
		}
		
		if(menuOptionIndex == 4) {
			log("Shuffled array is: ");
			arrayShuffle(array);
		}
		
		if(menuOptionIndex == 5) {
			log("Sum of numbers in array is: " + arraySum(array));
		}
		
		if(menuOptionIndex == 6) {
			log("Max number is: " + maxNumber(array));
		}
		
		if(menuOptionIndex == 7) {
			log("Min number is: " + minNumber(array));
		}
		
		if(menuOptionIndex == 8) {
			log("Average number is: " + averageNumber(array));
		}
		
		if(menuOptionIndex == 9) {
			log("Is symetrical: " + symetricalNumbers(array));
		}
		
		if(menuOptionIndex == 10) {
			reverseArray(array);
		}
		
		if(menuOptionIndex == 11) {
			displayInput(array);
			return 0;
		}
	
		if(menuOptionIndex == 12) {
			log("Exited the program");
			return 0;
		}
		return 0;
	}

	private static void log(int[] bubbleSort) {
		for(int i = 0; i < bubbleSort.length; ++i) {
			log(bubbleSort[i]);
		}
	}

	public static void log(String message) {
		System.out.println(message);
	}
	
	public static void log(int number) {
		System.out.println(number);
	}
	
	public static int logInt(String message) {
		System.out.println(message);
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		return input;
	}
	
	
	private static int[] bubbleSortDesc(int[] array) {
		for(int i = 0; i < array.length - 1; ++i) {
			for(int j = 0; j < array.length - 1; ++j) {
				if(array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
	
	private static void pickArrayNumber(int[] array) {
		int numberOfSearch = logInt("Search for number position: ");
		for(int i = 0; i < array.length; ++i) {
			if(array[i] == numberOfSearch) {
				log("Number is: " + array[i]);
			}
		}
	}
	
	private static void arrayShuffle(int[] array) {
		Random rand = new Random();
		int randomIndex = rand.nextInt(array.length - 1);
		for(int i = 0; i < array.length; ++i) {
			int tmpValue = array[i];
			array[i] = array[randomIndex];
			array[randomIndex] = tmpValue;
		}	
		
		for(int i = 0; i < array.length; ++i) {
			log(array[i]);
		}
	}
	
	private static int arraySum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; ++i) {
			sum = sum + array[i];
		}
		return sum;
	}
	
	private static int maxNumber(int[] array) {
		int maxNumber = 0;
		for (int i = 0; i < array.length; ++i) {
			if(maxNumber < array[i]) {
				maxNumber = array[i];
			}
		}
		return maxNumber;
	}
	
	private static int minNumber(int[] array) {
		int minNumber = maxNumber(array);
		for(int i = 0; i < array.length; ++i) {
			if(minNumber > array[i]) {
				minNumber = array[i];
			}
		}
		return minNumber;
	}
	
	private static float averageNumber(int[] array) {
		float sum = 0;
		int arrayValue = 0; int averageNumber = 0;
		if(array.length > 2) {
			for(int i = 0; i < array.length; ++i) {
				arrayValue = array[i];
				averageNumber = averageNumber + arrayValue;
				sum = (float)averageNumber / array.length;
			}
			return sum;
		}
		else {
			return 0.0f;
		}
	}
	
	private static boolean symetricalNumbers(int[] array) {
		for(int i = 0, j = array.length - 1; i < array.length || j > 0; ++i, --j) {
			if(array[i] != array[j]) {
				return false;
			}
		}
		return true;
	}
	
	private static void reverseArray(int[] array) {
		for(int i = array.length - 1; i >= 0; --i) {
			log(array[i]);
		}
	}
	
	public static void displayInput(int[] array) {
		for(int i = 0; i < array.length; ++i) {
			log("Entered numbers are: " + array[i]);
		}
	}
	
	public static int[] inputNumbers(int input) {
		int[] array;
		array = new int[input];
		for(int i = 0; i < input; ++i) {
				array[i] = logInt("Enter a number: ");		
		}
		return array;
	}
	
}


















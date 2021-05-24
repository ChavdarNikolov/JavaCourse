package mainPackage;

import java.util.Scanner;

public class Console {
	
	public static void log(String message) {
		System.out.println(message);
	}
	
	public static String logString(String message) {
		System.out.println(message);
		Scanner strings = new Scanner(System.in);
		String name = strings.nextLine();
		return name;
	}
	
	public static int logInt(String message) {
		System.out.println(message);
		Scanner integers = new Scanner(System.in);
		int number = integers.nextInt();
		return number;
	}
	
}

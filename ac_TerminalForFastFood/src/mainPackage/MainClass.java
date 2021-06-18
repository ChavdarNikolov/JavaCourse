package mainPackage;

import java.util.Scanner;

public class MainClass {
	
	private static final int UPPER_BOUND = 1_000_000;
	private static final int LOW_BOUND = 99;
	private static final int MIDDLE_BOUND = 99_999;
	private static final int INDEX_OFFSET = 10;
	private static final int ZERO_INIT = 0;
	private static final int ZERO_COMPARISON = 0;
	
	public static void main(String[] args) {
		int wallet = 25;
		int price = ZERO_INIT;//BGN
		int	idNumber = input("Enter an id number: ");
		boolean isEarlyAdopter = LOW_BOUND < idNumber && MIDDLE_BOUND > idNumber;
		boolean isNormal = MIDDLE_BOUND < idNumber && UPPER_BOUND > idNumber;
		boolean isLagger = !isEarlyAdopter && !isNormal && LOW_BOUND < idNumber;
		boolean isVip = isVip(idNumber);
		boolean isSecondMealAvailable = isSecondMealAvailable(idNumber);
		String clientVip = logVip(isVip);
		
		clientStatus(isEarlyAdopter, isNormal, isLagger);
		log(clientVip);
		log("Can have a second meal: " + isSecondMealAvailable);
		
		int	menuOptionIndex = input("Enter a menu option");
		int finalPrice = menuManagerLogic(menuOptionIndex, price);
		int finalWallet = wallet(finalPrice, wallet);
		
		if(finalWallet <= ZERO_COMPARISON) {
			log("You can't make a purchase; pick again");
			menuManagerLogic(menuOptionIndex, price);
		}
		log("Purchased succesfully!");
		info(finalPrice, finalWallet);
	}	
	
	public static int wallet(int finalPrice, int wallet) {
		return wallet - finalPrice;
	}

	public static int input(String message) {
		log(message);
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	
	public static void log(int element) {
		System.out.println(element);
	}
	
	public static void log(String message) {
		System.out.println(message);
	}
	
	public static boolean isVip(int idNumber) {
		return idNumber % 2 == ZERO_COMPARISON;
	}
	
//	public static boolean isNotVip(int idNumber) {
//		return !isVip(idNumber);
//	}
	
	public static void clientStatus(boolean isEarlyAdopter, boolean isNormal, boolean isLagger) {
		log("Early Adopter: " + isEarlyAdopter);
		log("Normal: " + isNormal);
		log("Lagger: " + isLagger);
		
	}
	
	public static String logVip(boolean isVip) {
		return isVip ? "Client is VIP" : "Client is not VIP";	
	}
	
	public static boolean isSecondMealAvailable(int idNumber) {
		return (idNumber / INDEX_OFFSET) % INDEX_OFFSET > 3;
	}
	
	public static int menu(int menuOptionIndex) {	
		if(menuOptionIndex == 1) return 2;
		if(menuOptionIndex == 2) return 1;
		if(menuOptionIndex == 3) return 3;
		if(menuOptionIndex == 0) return 0;
		return -1;
	}
	
	public static void menuList() {
		log("***Menu***");
		log("1. Fries: 2 BGN");
		log("2. Yoghurt: 1 BGN");
		log("3. Eggs: 3 BGN");
	}
	
	public static int menuManagerLogic(int menuOptionIndex, int price) {
		int indexOfPrice = ZERO_INIT;
		int priceStuff = ZERO_INIT;
		menuList();
		if(menuOptionIndex == ZERO_COMPARISON) { 
			return price;
		} else {
			price += indexOfPrice = menu(menuOptionIndex);
			log(itemChosen(menuOptionIndex, price));
			menuOptionIndex = input("Enter a menu choice: ");
			priceStuff = menuManagerLogic(menuOptionIndex, price);
			return priceStuff;
		}
	}
	
	public static void info(int price, int wallet) {
		log("Price currently is: " + price + " BGN");
		log("Wallet currently is: " + wallet + " BGN");
	}
	
	public static String itemChosen(int menuOptionIndex, int price) {
		if(menuOptionIndex == 1) return "Fries chosen " + price;
		if(menuOptionIndex == 2) return "Yoghurt chosen " + price;
		if(menuOptionIndex == 3) return "Eggs chosen " + price;
		return "Nothing chosen!";
	}
}













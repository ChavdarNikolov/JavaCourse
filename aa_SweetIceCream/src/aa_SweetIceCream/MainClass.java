package aa_SweetIceCream;

public class MainClass {
	public static void main(String[] args) {
		int numberOfIceCreamPerDay = 10;
		float price = 3.14f;
		String nameOfIceCream = "EXTREME ICE CREAM";
		String fName = "Delta";
		boolean isLineWorking = true;
		
		System.out.println(numberOfIceCreamPerDay);
		System.out.println(nameOfIceCream);
		System.out.println(price);
		System.out.println(isLineWorking);
		
		String idLetter = "A";
		int idNumber = 12345;
		
		System.out.println(idLetter + idNumber);
		
		String[] iceCreamTaste = {"Vanilla", "Strawberry", "Banana", "Apple"};
		arrayPrint(iceCreamTaste);
		
		System.out.println("Hello " + fName);
	}
	
	public static void arrayPrint(String[] collection) {
		for(int i = 0; i < collection.length; ++i) {
			System.out.println(collection[i]);
		}
	}
}
















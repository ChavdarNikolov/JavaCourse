package mainPackage;

public class MainClass {
	public static void main(String[] args) {
		String name = Console.logString("Enter a name");
		Console.log("Hello " + name);
		int numberOfIceCreams = Console.logInt("Enter a number of Ice Creams: ");
		Console.log("Number of iceCreams per shop: " + deliveredIceCreams(numberOfIceCreams));
		int iceCreamsCreatedYesterday = Console.logInt("Enter a number of iceCreams \n"
													 + "created yesterday");
		Console.log(isGood(numberOfIceCreams, iceCreamsCreatedYesterday));
		Console.log("Min ice Cream: " + minIceCreamCreated(numberOfIceCreams));
	}
	
	public static int deliveredIceCreams(int numberOfIceCreams) {
		return numberOfIceCreams / 10;
	}
	
	public static String isGood(int today, int yesterday) {
		return (today > yesterday) ? "Good job" : "Low capacity"; 
	}
	
	public static int minIceCreamCreated(int numberOfIceCreams) {
		return (numberOfIceCreams > 300) ? numberOfIceCreams : numberOfIceCreams + 300;
	}
	
}

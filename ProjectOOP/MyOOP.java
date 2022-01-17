
public class MyOOP {
	
	public static void main(String[] args) {
		delimiter = "---";
		printCar();
		printCar();
		printCar2();
		printCar2();
		
		delimiter = "***";
		printCar();
		printCar();
		printCar2();
		printCar2();

	}
	public static String delimiter = "";
	public static void printCar() {
		System.out.println(delimiter);
		System.out.println("Car");
		System.out.println("Car");
	}
	public static void printCar2() {
		System.out.println(delimiter);
		System.out.println("Car2");
		System.out.println("Car2");
	}
}

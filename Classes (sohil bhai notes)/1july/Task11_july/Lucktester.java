 public class Lucktester {
	public static void main(String [] args ) {

	double num = Math.random();
	final int GENERATED_LUCK_NUMBER = (int) (num*100);

	java.util.Scanner scan = new java.util.Scanner(System.in);
	int userNumber;
	System.out.println("enter number b/w 0-99\12for your luck test");
	userNumber =scan.nextInt();

	if(GENERATED_LUCK_NUMBER==userNumber){
	System.out.println("I think\12your luck no need to work hard\12(^~^)");
	System.out.println("no need to wear LUX underwear hahaha ");
	}
	else{
	        System.out.println("try again\12need to wear LUXunderwear ");
	}
	System.out.println("Lukey number is = "+GENERATED_LUCK_NUMBER);

}
}
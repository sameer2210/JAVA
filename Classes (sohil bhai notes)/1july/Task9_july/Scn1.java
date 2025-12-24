public class Scn1 {

	public static void main (String [] args){

/*	double num1;
	double num2;
	java.util.Scanner scan = new java.util.Scanner(System.in);
	System.out.println("enter two number");
	num1 = scan.nextDouble();
	 num2 = scan.nextDouble();
	
	double sum = num1 + num2;
	
	System.out.println("num1 ="+ num1);
	System.out.println("num2 ="+ num2);
	System.out.println("sum ="+ sum);
*/

	String src="15 17.5 true 31.8";
	java.util.Scanner scan = new java.util.Scanner(src);

	int age = scan.nextInt();
	float weight = scan.nextFloat();
	boolean isFit = scan.nextBoolean();
	double percentage = scan.nextDouble();

	 System.out.println("Age= "+age);
	 System.out.println("Weight= "+weight);
	 System.out.println("Is he fit = "+isFit);
	 System.out.println("School percentage ="+percentage);
	  
}
}
import java.util.Scanner;

public class Queset1 {
	public static void main(String[] args) {

//	Q1 write a String to Uppercase provided by user
		/*
		 * System.out.println("write your name to perform operation");
		 * 
		 * String name = ""; java.util.Scanner scan = new java.util.Scanner(System.in);
		 * name = scan.nextLine(); name= name.toUpperCase(); System.out.println(name);
		 */
//	Q2 replace String space with underscore	
		/*
		 * String name="Sameer khan is best"; name= name.replace(" ","_");
		 * System.out.println(name);
		 */
//	Q3 replace name in a following sentence " Dear <name> thanks a lot!"
		/*
		 * String name="Dear <name> ,thanks a lot! ";
		 * name=name.replace("<name>","sameer"); System.out.println(name);
		 */
//	Q4 detect a double and tripal Space b/W String 
		/*
		 * String text="this String contain  double and   tripal sapcess";
		 * System.out.println(text.indexOf("  "));
		 * System.out.println(text.indexOf("   "));
		 */
//	Q5 write a programe in a letter formate of String(hello sameer now you are able to write a programe thankyou)
		/*
		 * String letter
		 * ="hello Sameer,\n\t now you are able to write a programe \n\t\t\t thank you!"
		 * ; System.out.println(letter);
		 */
//	Q6 Write a program in java to Reverse a input string.	
		/*
		 * String rev="";
		 * System.out.println("write your name to print in revers order");
		 * 
		 * java.util.Scanner scan=new java.util.Scanner(System.in); String
		 * name=scan.nextLine();
		 * 
		 * int lang=name.length(); for(int i=lang-1; i>=0; i--){ rev=rev+name.charAt(i);
		 * } System.out.println(rev);
		 */
//	Q6 Write a program in java to check enter number is even or odd.
		/*
		 * System.out.println("write number to find even of odd"); Scanner scan = new
		 * Scanner(System.in); int number = scan.nextInt();
		 * 
		 * if (number % 2 == 0) { System.out.println("it is even number"); } else {
		 * System.out.println("it is odd number"); }
		 */
//	Q7 Write a program in java to check enter number is prime or not.	 
		/*
		 * System.out.println("write a int num to check its prime no. or not");
		 *  Scanner scan = new java.util.Scanner(System.in);
		 *  int num = scan.nextInt();
		 *   		 * 
		 * int count = 0; for (int i = 1; i <= num; i++) { 
		 * if (num % i == 0) {
		 *  	count++;
		 * 	} 
		 * } 
		 * if (count == 2) {
		 *  System.out.println("its prime"); 
		 *  } else {
		 * System.out.println("not a prime"); 
		 * }
		 */
//	Q8 Java program to check number is armstrong or not	
		 int n,arm=0,rem,c;
		 System.out.println("enter any no. to check armstrong or not");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		c=n;
		while(n>0)
		{  
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(c==arm) 
			System.out.println("armostrong no.");
			else 
			System.out.println("not a armostrong no.");
	}
}
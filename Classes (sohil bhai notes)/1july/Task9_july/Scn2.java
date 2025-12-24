public class Scn2 {

	public static void main (String [] args){

	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	String firstName;
	int age;
	float weight;
	boolean fit;
	double percentage;
	
	System.out.println("Enter your first name");
	firstName= scan.next();//Take word

	System.out.println("Enter your age");
	age = scan.nextInt();//Take int
	
	System.out.println("Enter your weight");
	weight = scan.nextFloat();//Take float

	System.out.println("want to join us  ? true/false");
	fit = scan.nextBoolean();

	System.out.println("Enter your percentage");
	percentage = scan.nextDouble();

	//database code TODO
	System.out.println("_____your data processed and save___");
	System.out.println("Name	: " +firstName);
	System.out.println("Age	: " +age);
	System.out.println("Weight	: " +weight);
	System.out.println("we join you : " +fit);
	System.out.println("Percentage : " +percentage);

	System.out.println("okey let me check..........");
	System.out.println("3 applicants are .....");

	
	String lappr1 ="Kuldeep";
	String lappr2 ="Dhanna";
	String lappr3 ="Shriram";
System.out.println("Ler1= " + lappr1);
System.out.println("Ler2= " + lappr2);
System.out.println("Ler3= " + lappr3);
	
	System.out.println("Enter 1st applicant");
 	lappr1=scan.nextLine();
	System.out.println("Enter 2nd applicant");
	lappr2=scan.nextLine();
	System.out.println("Enter 3rd applicant");
	lappr3=scan.nextLine();

System.out.println("hard to process ( ^~^ )...\12.....");
 
System.out.println(".............................");
System.out.println("       ");
System.out.println("congratulation you are right");
System.out.println(" your appointed");




}
}

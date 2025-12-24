public class Userinfo {
	public static void main(String args[]){
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	int age;
	String gender;
	String name;
	boolean isFit;
	
	System.out.println("enter age");
	// age = scan.nextInt();
	age = Integer.parseInt( scan.nextLine());
	
	System.out.println("enter gender");
	gender = scan.nextLine();
	
	System.out.println("enter name");
	name = scan.nextLine();
	System.out.println("enter is fit true/false");
	// isFit = scan.nextBoolean();
	isFit = Boolean.parseBoolean( scan.nextLine());
	
	System.out.println("++++++++++++\n+++++++++++++");
	System.out.println("age " +age);
	System.out.println("name "+ name);
	System.out.println("gender "+ gender);
	System.out.println("isFit " + isFit);
	System.out.println("++++++++++++\12+++++++++++++");

}
}

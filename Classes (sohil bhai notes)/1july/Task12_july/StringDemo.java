public class StringDemo {
	public static void main(String args[]){

//_____________________________________________________________

	String sis = " Sameer It Solution";
	System.out.println(sis);
	System.out.println(sis.toUpperCase());
	System.out.println(sis.toLowerCase());
	System.out.println(sis.length());
	
	char sis4thChar = sis.charAt(3);
 
	System.out.println(sis4thChar);
	System.out.println(sis.charAt(1));
	System.out.println(sis.charAt(2));
	System.out.println(sis.charAt(3));


	String name =null;
	java.util.Scanner scan =new java.util.Scanner(System.in);
	
	System.out.println("Enter your name");
	name = scan.nextLine();
	
	System.out.println("_______\12Your name is  " +name);
	System.out.println(" name total char = "+ name.length());
	 
	System.out.println("_________________\12___________________");
	
	String name2 = name.trim();
	
	System.out.println("Your name is " + name2);
	System.out.println("name total char = "+name2.length());
	

	
}
}	
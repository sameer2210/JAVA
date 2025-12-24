
public class Demo2 {
	public static void main(String args[]){
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
			int a;
			int b;
			int div;

		System.out.println(" enter 2 integer ");
			a = scan.nextInt();
			b = scan.nextInt();
			div = a/b;		//JVM sub program throw new Arthimetic Exception (" /by Zero ");
			
			System.out.println(" div " + div );
			
			
	}//end main
}//end class
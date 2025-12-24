
public class Test2 {
	public static void main(String args[]){
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
		String text = " SAMEER ";
		System.out.println(" text = " + text );
		System.out.println(" enter pos for get char ");

		int pos = scan.nextInt();
		char ch = text.charAt(pos-1);
		System.out.println(pos + " pos char = " + ch );
			
	
	
	}//end main
}//end class
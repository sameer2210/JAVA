public class Test2Sol {
	public static void main(String args[]){
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
		String text = " SAMEER ";
		System.out.println(" text = " + text );
		System.out.println(" enter pos for get char ");
		
		int pos = scan.nextInt();
	try{
		  char ch = text.charAt(pos-1);
		  System.out.println(pos + " pos char = " + ch );
	}catch(StringIndexOutOfBoundsException e){
			System.out.println(" Error : no char in given position " );
	}catch(Exception e){
			System.out.println(" Error " + e.getMessage());
	}
		
	}//end java
}//end class
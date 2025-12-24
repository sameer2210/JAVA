public class Demo2Sis {
	public static void main(String args[]){
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
			int a;
			int b;
			int div;
		System.out.println(" enter 2 integer pp");
			
			a = scan.nextInt();
			b = scan.nextInt();
			if(b==0){
				throw  new ArithmeticException(" /by zero: b must be non zero ");
			}
			div = a/b; 	//JVM sub program throw new Arithmetic Exception(" /by zero");
			System.out.println(" div " + div);
			
				
	}//end main
}//end class
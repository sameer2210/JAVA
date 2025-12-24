public class Case2SisSol {
	public static void main(String args[]){
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
		int a;
		int b;
		int div;
	try{
		 System.out.println(" operation start.... \n enter int no. for div... ");
		 a = Integer.parseInt(scan.nextLine());
		 b = Integer.parseInt(scan.nextLine());
		 System.out.println(" b = " + b );
		 System.out.println(" a = " + a );
		 div = a/b;
		 System.out.println(" div = " + div );
		 // System.out.println(" operation done "); // must be execute
	
	}catch(ArithmeticException e){
		System.out.println(" AE Error " + e.getMessage() + " b must be non Zero ");
	}catch(NumberFormatException e){
		System.out.println(" Error : input must be integer type ");
	}catch(Exception e){
		System.out.println(" Error " + e.getMessage())s;
	}finally{
		System.out.println(" operation done "); //must be excute
	}
	
		System.out.println(" ________________________");
		System.out.println(" Happy ending ... ");
		System.out.println(" We are engineer .... ");
	
	}//end main
}//end class
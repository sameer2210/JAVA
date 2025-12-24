public class XTest{
	public static void main(String args[]){
	
	System.out.println("main start....");
	X ob1 = new X();
	System.out.println("______________________");
	X ob2 = new X();
	System.out.println("main End..............");
	
/*	
		main start.....
		static block 1*******
		static block 2*******
		obj block 1 X@15db3454
		obj block 2 X@15db3454
		constructor X@24524644
		___________________________
		obj block 1 X@54626426
		obj block 2 X@54626426
		constructor X@14542426
		main End......................
	
*/
	
	
	
	}//end main
}//end class
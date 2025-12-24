public class CaseDemo2 {
	public static void main(String args[]){
	
	X ref1 = new X();
		ref1.m1();
		ref1.m2();
		ref1.m3();
	System.out.println("__________________");
	
	I1 ref2 = new X();
		ref2.m1();
		
		// ref2.m2();	// CTE //why I1 don't know about m2
		// ref3.m3(); 	// CTE //why I1 don't know about m3
	System.out.println("__________________");
	
	I2 ref3 = new X();
		ref3.m2();
		ref3.m3();
		
		// ref3.m1(); 	//CTE//why I2 don't know about m1
	
	
	}//end main
}//end class
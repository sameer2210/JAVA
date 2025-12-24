public class X {

	//unchecked
	public static void m1(){
		System.out.println(" m1 called .... ");
		if(new java.util.Random().nextBoolean()){	// true of flase
		 throw new RuntimeException(" My Test1 Error1 ");
		}
	}
	
	//unchecked 
	public static void m2() throws RuntimeException{
		System.out.println(" m2 called... ");
		if(new java.util.Random().nextBoolean()) {	// true or false
		  throw new RuntimeException(" My Test 2  Error 2 ");
		}
	}
 	
	// version 3.1 CTE
	// checked : must be handled
	// unreported exception Exception ; must be caught or decleard to be thrown
	// CTE
/*	public static void m3(){
		System.out.println(" m3.1 called .... ");
		if(new java.util.Random().nextBoolean()){   // true or flase
			throw new Exception(" My Test 3 Error 3 ");
		}
	}
 */
	// version 3.2   No CTE
	// checked : must be handled try catch
	//  error created by me and handled me : wrong approach
	public static void m3(){
		System.out.println(" m3.2  called.... ");
		try{
			 // create checked exception and throw
			if(new java.util.Random().nextBoolean()) {   // true or false
			  Exception eObj = new Exception(" My Test 3.2  Error 3  ");
			  throw eObj;
			}
		}catch(Exception e){	//checked exception handled here
			System.out.println(" Error Found :: " + e.getMessage());	// Error Found :: My Test3 Error3
		}
	}//void
 
/*	// version 3.3 No CTE
	// Checked : must be handled try catch 
	public static void m3()throws Exception{
		System.out.println(" m3.3  called.... ");
			// created checked exception and throw
		if(new java.util.Random().nextBoolean()) { 	// true or false
		  Exception eObj = new Exception(" My Test 3.3  Error 3 " );
		  throw eObj;
		}
	}
*/
}// end class
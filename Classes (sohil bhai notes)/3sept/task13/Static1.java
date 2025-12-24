/*
	#can we execute anything without main method ??
	   YES- using static block : reason static first load main execute
	   No - from 1.7>= version
	   
	   if main found executed....main
	   if Not main found executed....show ERROR and stop jvm(java vartual machine)
	   
*/
 

public class Static1 {

	static {
			System.out.println("Sameer ");
			System.out.println("Happy programming by Sis1" );
			
			System.out.println("java is simple");
			System.out.println("oor sunnao");
			System.exit(0);
		}

// note- it would run only in <=1.6 java version

	
}//end class			
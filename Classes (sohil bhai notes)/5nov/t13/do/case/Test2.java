public class Test2 {
	public static void main(String args[]){
	
	//way1 
	X.m2();	//not handled optional, and exception can be come ot not
	
	// way 2
	
	try{
		 X.m2();	// handled optional
	}catch(RuntimeException e){System.out.println(e.getMessage());}
	
	
	}//end main
}//end class
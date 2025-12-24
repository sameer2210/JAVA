
public class Demo1 {
	public static void main(String args[]){
	
		// String ob = " java " ;		// run 
		String ob = null;				// showing error
		
		String str = ob.toUpperCase();		//NullPointerException
	
	System.out.println(" ob " + ob );
	System.out.println(" upper str " + str );
		
	
	}//end main
}//end class
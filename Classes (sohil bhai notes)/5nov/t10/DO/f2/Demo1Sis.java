
public class Demo1Sis {
	public static void main(String args[]){
	
		String ob = " java ";
		// String ob = null;
	
	// String str = ob.toUpperCase();	// new NullPointer Exceptionn ("String object
		
	if(ob==null){
		throw new NullPointerException("String object must be exist ");
	}
	String str = ob.toUpperCase();
	
	System.out.println(" ob " + ob);
	System.out.println(" upper str " + str );
	
	
	}//end main 
}//end class
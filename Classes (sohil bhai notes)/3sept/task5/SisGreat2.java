public class SisGreat2{
	public static void main(String args[]){
	
	LineSeperator is = new LineSeperator();
	
		is.decorateLine();
		 System.out.println("Happy Programing");
		is.decorateLine();
		
		is.decorateLine('_');
		 System.out.println("\nSuccess is sure\n");
		is.decorateLine('<');
		
		is.decorateLine('>',50);
		 System.out.println("\nHonesty is Best policy\n");
		is.decorateLine('<',50);
		
		is.decorateLine('-',100);
		 System.out.println("\nTime is money\n");
		is.decorateLine('$',100);
			
	
	
	}//end main
}//end class
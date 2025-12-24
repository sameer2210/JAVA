public class SisCal5 {
	public static void main(String args[]){
	
		String num1Str = null;
		String num2Str = null;
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		
	try{			//get input
		 num1Str = args[0];  //"10" ArrayIndexOutOfBoundsException
		 num2Str = args[1];  //"20" ArrayIndexOutOfBoundsException
		//parse it 
		 num1 = Integer.parseInt(num1Str);  //No. Format Exception
		 num2 = Integer.parseInt(num2Str);  //No. Format Exception
	
		//process it 
		sum = num1 + num2;
		//print it
		System.out.println(num1 + " + " + num2+ "=" + sum);
		
	}catch(ArrayIndexOutOfBoundsException e){
		//System.out.println("Error msg : " + e.getMessage());	//0 1
		System.out.println("Error Message : must required 2 arguments ");
		System.exit(0);
	}catch(NumberFormatException e){
		System.out.println(" Error : both argument  must be integer type ");
		System.exit(0);
	}
		
	
	}//end main
}//end class
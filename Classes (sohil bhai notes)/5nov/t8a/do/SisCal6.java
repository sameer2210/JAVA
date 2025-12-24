public class SisCal6 {
	public static void main(String args[]){
	
		String num1Str = null;
		String num2Str = null;
		int num1 = 0;
		int num2 = 0;
		int sum =  0;
		
	try{
			//get input
		num1Str = args[0];  //"10" ArrayIndexOfBoundsException
		num2Str = args[1];  //"20" ArrayIndexOfBoundsException
		//parse it 
		num1 = Integer.parseInt(num1Str); //No FormatException
		num2 = Integer.parseInt(num2Str); //No FormatException
		//process it 
		sum = num1 + num2;
		//print it
		System.out.println(num1 + " + " + num2 + " = " +sum);
		
	}catch(ArrayIndexOutOfBoundsException e){
			//Systme.out.println("Error Msg: " + e.getMessage());
			System.out.println("Error Message :  must required 2 argument");
	}catch(NumberFormatException e){
			System.out.println("Error : both argument must be integer type ");
	}
	
	System.out.println("_____________________");
	System.out.println("Happy Ending ... ");
	System.out.println("____________________");
	
		
	}//end main
}//end class
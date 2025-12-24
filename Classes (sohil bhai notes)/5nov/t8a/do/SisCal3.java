public class SisCal3 {
	public static void main(String args[]){
	
		String num1Str = null;
		String num2Str = null;
		int num1 = 0;
		int num2 = 0;
		int sum  =  0;
		
	try{
		 num1Str = args[0]; //"10" Array Index Out Of Bound Exception
		 num2Str = args[1]; //"20" Array Index Out Of Bounds Exceptioin
	}catch(ArrayIndexOutOfBoundsException e){
			//System.out.println("Error msg : " + e.getMessage());	// 0 1
			System.out.println("Error Message : must required 2 arguments ");
			System.exit(0);
	}
	try{
		 num1 = Integer.parseInt(num1Str); //No Format Exception
		 num2 = Integer.parseInt(num2Str); //No Format Exception
	}catch(NumberFormatException e){
		System.out.println("Error : both argument must be integer type ");
		System.exit(0);
	}
	
	sum = num1 + num2;
	System.out.println(num1 + " + " + num2 + " = " + sum);
		
	
	}//end main
}//end class
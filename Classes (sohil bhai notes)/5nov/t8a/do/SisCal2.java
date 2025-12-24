public class SisCal2 {
	public static void main(String args[]){
	
		String num1Str = null;
		String num2Str = null;
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
	
	try{
		num1Str = args[0];	//"10" ArrayIndexOut Of BoundsException
	}catch(ArrayIndexOutOfBoundsException e){
		//System.out.println("Error Message : " + e.getMassage());
		System.out.println("Error msg : must pass 1st argument as int number ");
		System.exit(0);
	}
	try{
		num2Str = args[1];	//"20" ArrayIndexOutOfBoundException
	}catch(ArrayIndexOutOfBoundsException e){
		//System.out.println("Error msg :" + e.getMessage());
		System.out.println("Error Message : must pass 2nd argument as int number");
		System.exit(0);
	}
	
	try {
			num1 = Integer.parseInt(num1Str);	//No Format Exception
	}catch(NumberFormatException e){
		System.out.println(" Error : 1st argument must be integer type ");
		System.exit(0);
	}
	try {
			num2 = Integer.parseInt(num2Str); //No of Format Exception
	}catch(NumberFormatException e){
		System.out.println("Error : 2nd arg must be integer type ");
		System.exit(0);
	}
	
	sum = num1 + num2;
	System.out.println(num1 + " + " + num2 + " = " + sum);
		
		
	}//end main
}//end class
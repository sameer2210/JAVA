public class SisCal7 {
	public static void main(String args[]){
	
		String num1Str = null;
		String num2Str = null;
		int num1 = 0;
		int num2 = 0;
		int sum  = 0;
		
	try{
			//get input
		num1Str = args[0];
		num2Str = args[1];
		//parse it 
		num1 = Integer.parseInt(num1Str);
		num2 = Integer.parseInt(num2Str);
		//process it
		sum = num1 + num2;
		//print it
		System.out.println("num1  + " + " num2  = "  + sum );
		
	}catch(Exception e){
			System.out.println("Error :" + e.getMessage());
	}
	
		System.out.println("___________________");
		System.out.println("Happy ending..... ");
		System.out.println("______________________");
			
	
	}//end main
}//end class
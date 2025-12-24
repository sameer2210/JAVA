public class Demo1 {
	public static void main(String args[]){
	
		String [] arr = { " career " ,null,"java",null,"nit","sis"};
		java.util.Random rand = new java.util.Random();
		// Random words from String  will print  like sis \ SIS .... 
		
	try{
		 System.out.println("______________________");
		 int pickIndex = rand.nextInt(arr.length);
		 String pickWord = arr[pickIndex];
		 System.out.println(pickWord);
		 System.out.println(pickWord.toUpperCase());
		 System.out.println("______________________");
		 
	}catch(NullPointerException e){
		System.out.println(" Error : " + e.getMessage());
		System.out.println(" Error : no word found ");
	}
	
	}//end main
}//end class

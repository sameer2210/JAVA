public class CharDemo1{
	public static void main(String args[]){
	
		char ch ='A';
		Character ob = new Character(ch);
		
		// String str1 = ob;
		// String str2 = ch;
		
		String str1 = ob.toString();
		String str2 = String.valueOf(ch);
		
		System.out.println(Character.isLowerCase('a'));	//t
		System.out.println(Character.isLowerCase(95)); 	//f
		System.out.println(Character.isLowerCase('A'));	//f
		System.out.println(Character.isLowerCase(64));	//f
	
		System.out.println(Character.isDigit('A'));	//F
		System.out.println(Character.isDigit('0'));	//t
		System.out.println(Character.isDigit('9'));	//t
	
		}//end main
}//end class
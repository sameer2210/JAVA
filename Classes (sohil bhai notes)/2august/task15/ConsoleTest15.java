public class ConsoleTest15 {
	public static void main (String args[]){
	
	java.io.Console con = System.console();

	System.out.println("enter text1 which display");
	String str1 = con.readLine();
	
	System.out.println("enter text2 which not display");
	char passwordCharArr [] = con.readPassword();
	String str2 = new String(passwordCharArr);
	
	System.out.println("input1 data was " + str1);
	System.out.println("input2 data was " + str2);
}
}
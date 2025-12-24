public class Stringp {
	public static void main(String args[]){
	java.util.Scanner scan=new java.util.Scanner(System.in);

	System.out.println("enter your text");
	String str=scan.nextLine();
	String revStr="";
	for(int pos=str.length();pos>=1;pos--){
		char ch = str.charAt(pos-1);
			revStr = revStr+ch;
		//System.out.println((pos-1)+" "+ch);
		}
	System.out.println("rev " + revStr);
	System.out.println(str.equals(revStr)?"palindrom":"NOT Palindrmo");
	
}
}



















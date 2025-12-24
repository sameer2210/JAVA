public class Stringpalindrom3{
	public static void main(String args[]){
	java.util.Scanner scan = new java.util.Scanner(System.in);
		
	System.out.println("enter your trxt");
	String str=scan.nextLine();
	
	StringBuilder sb = new StringBuilder("");
	long startTime = System.nanoTime();
	for(int pos=str.length();pos>=1;pos--){
		char ch = str.charAt(pos-1);
		sb.append(ch);
	}	
	String revStr= sb.toString();
	
	long endTime = System.nanoTime();
	System.out.println("way3 TotalTime= "+(endTime-startTime));
	
	System.out.println("rev " + revStr);
	System.out.println(str.equals(revStr)?"palindrom":"NOT Palindrom");
	
}
}

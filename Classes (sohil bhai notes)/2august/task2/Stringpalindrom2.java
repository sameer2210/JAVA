public class Stringpalindrom2{
	public static void main(String args[]){
	java.util.Scanner scan = new java.util.Scanner(System.in);

	System.out.println("enter your text");	
	String str=scan.nextLine();
	long startTime = System.nanoTime();
	StringBuilder sb = new StringBuilder(str);

	sb.reverse();
	String revStr=sb.toString();
	
	long endTime = System.nanoTime();
	System.out.println("way2 TotalTime="+(endTime-startTime));
	
	System.out.println("rev " + revStr);
	System.out.println(str.equals(revStr)?"palidrom":"NOT Palindrom");
	
}
}
	
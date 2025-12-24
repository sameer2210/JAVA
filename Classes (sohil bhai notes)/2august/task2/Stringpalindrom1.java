
public class Stringpalindrom1{
	public static void main (String args[]){
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	System.out.println("enter your text");
	String str=scan.nextLine();
	long startTime = System.nanoTime();
	String revStr=new String("");
	for(int pos=str.length();pos>=1;pos--){
	char ch=str.charAt(pos-1);
		revStr = revStr+ch;
	//Systm.out.println((pos-1)+" "+ch);
	}

	long endTime = System.nanoTime();
	System.out.println("way1 TotalTime="+(endTime-startTime));
	System.out.println("rev "+revStr);
	System.out.println(str.equals(revStr)?"palindrom":"NOT palindrom");
	
System.out.println("____________________________________________");

}
}

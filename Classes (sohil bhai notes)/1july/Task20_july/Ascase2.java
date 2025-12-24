public class Ascase2{
	public static void main(String args[]){
/*	
	//A-L
	char startChar='A';
		for(int print=1;print<=12;print++){
		System.out.print(startChar++);
		}
	System.out.print("\n ");
*/
System.out.print("_______________________________________________");
	
	java.util.Scanner scan=new java.util.Scanner(System.in);
	System.out.println("how many char do you want print?");
	int totalPrint =scan.nextInt();
	System.out.println("what is star char");
	String str =scan.next();
	char startChar=str.charAt(0);	//'A';	//12
		for(int print=1;print<=totalPrint;print++){
		System.out.print(startChar++);
		}
	System.out.print("\n");

}
}
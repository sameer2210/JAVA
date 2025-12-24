public class Req {
	public static void main(String argsp[]) {
	java.util.Scanner scan = new java.util.Scanner(System.in);
/*	
	int a;				//let 64
	int b;				//65
	System.out.println("enter a");
	a =scan.nextInt();
	System.out.println("enter b");
	b =scan.nextInt();
	int big = a>b?a:b;
	System.out.println("big is " + big);	//big is 65
*/
System.out.println("________________________________________");

	int a;
	int b;
	int c;
	System.out.println("enter a");
	a =scan.nextInt();
	System.out.println("enter b");
	b =scan.nextInt();
	System.out.println("enter c");
	c =scan.nextInt();
	
	int big = a>b?(a>c?a:c):(b>c?b:c);
	System.out.println("big is" +big);
					//or
	int big2 = a>b?a>c?a:c:b>c?b:c;
	System.out.println("big is " +big2);
	
}
}
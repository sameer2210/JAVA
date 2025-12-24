public class Tasklate{

	public static void main ( String [] args ){

	String name=System.getenv("username");
	System.out.println("hello user\11" + name);

	java.util.Date now = new java.util.Date();	
	System.out.println("Date and time is = " + now);

	System.out.println(System.getenv("os"));	
	System.out.println(System.getenv("about"));
	System.out.println(System.getenv("bite"));
	System.out.println(System.getenv("student"));

	float  pi1 = 3.14281f;
	double pi2a = 3.42145789;
	double pi2b = 3.14567890123456789D;
	double pi2c =  3.14567890123456789d;

	System.out.println(pi1);
	System.out.println(pi2a);
	System.out.println(pi2b);
	System.out.println(pi2c);

}
}
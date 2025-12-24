import java.util.Random;

public class X {

	static { System.out.println("static block 1*******"); }
	static { System.out.println("static block 2*******"); }
	
	{ System.out.println("obj block 1 " + this); }
	{ System.out.println("obj block 2 " + this); }
	
	X(){ System.out.println("constructor " + this); }
	
	
}//end class
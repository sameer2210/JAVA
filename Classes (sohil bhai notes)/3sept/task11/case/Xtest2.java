public class Xtest2{
	public static void main(String args[]){
	
	X ob = null;
	System.out.println("ob = " + ob);
	//System.out.println("ob.a " + ob.a);	//Run timeError NPE
	
	ob = new X();
	
	System.out.println("ob = " + ob);
	System.out.println("ob.a = " + ob.a);
	System.out.println("ob.b = " + ob.b);
	System.out.println("X.b = " + X.b);
	
	System.out.println("______________________");
	
	ob.myMethod1();
	ob.myMethod2();
	X.myMethod1();
	}//end main
}//end class

public class Case1 {

	public static void main(String[] args) {
	
		X x1  = new X();
		Y y1  = new Y();
		Z z1  = new Z();

	
		X xref= null;
		
		/*xref= new X();
		xref= new Y();
		xref= new Z();*/
		
		
		System.out.println("xref = "+xref);
		System.out.println("_____________________");
		xref=x1;
		System.out.println("xref = "+xref);
		xref.m1();
		xref.m2();
		xref.m3();
		System.out.println("_____________________");
		
		xref=y1;
		System.out.println("xref = "+xref);
		xref.m1();//x
		xref.m2();//y
		xref.m3();//x
		
		System.out.println("_____________________");
		xref=z1;
		System.out.println("xref = "+xref);
		xref.m1();//x
		xref.m2();//x
		xref.m3();//z
		
//		xref.zm1();
//		xref.zm2();

		System.out.println("_____________________");
		
		
		
		
	}

}

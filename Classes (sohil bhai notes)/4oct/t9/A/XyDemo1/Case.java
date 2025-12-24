public class Case{
	public static void main(String args[]){
	
		X x1 = new X();		// Y,Z override
		Y y1 = new Y();
		Z z1 = new Z();
		
		X xref = null;
		
	/*	xref = new X();		//z override
		xref = new Y();
		xref = new Z();
	*/
	
	System.out.println("xref = "+ xref);
	System.out.println("____________________________");
	xref = x1;
	System.out.println("xref = " +xref);
	xref.m1();
	xref.m2();
	xref.m3();
	System.out.println("__________________________");
	
	xref=y1;
	System.out.println("xref = " + xref);
	xref.m1();
	xref.m2();
	xref.m3();
	System.out.println("__________________________");
	
	xref=z1;
	System.out.println("xref = " + xref);
	xref.m1();
	xref.m2();
	xref.m3();
	
//	xref.zm1();
//	xref.zm2();
	System.out.println("__________________________");
	
		
	
	}//end main
}//end class
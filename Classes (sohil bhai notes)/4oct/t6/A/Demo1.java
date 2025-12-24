
public class Demo1 {
	public static void main(String [] args) {
	
		Y ob = new Y();
		
		ob.m1();	//X
		ob.m3();	//Y not X (override)
		ob.m2();	//Y not X (overide)
		ob.m4();	//Y
		ob.m5();	//Y
		
	
	}//end main 
	
}//end class
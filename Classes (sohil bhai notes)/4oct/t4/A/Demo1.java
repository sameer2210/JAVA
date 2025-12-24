public class Demo1 {
	public static void main(String [] args) {
		
		Y y1 = new Y();
		y1.m1();			//m1 form x
		y1.m2();			//m2 from x
		y1.m3();			//m3 from x
		y1.m4();			//m4 from y
		y1.m5();			//m5 from y
		y1.a=11;
		y1.b=22;
		y1.c=33;
		y1.l=44;
		y1.m=55;
		y1.showAll();	// c=11  b=22  c=33  l=44  m=55
		
		}
		
}//end class
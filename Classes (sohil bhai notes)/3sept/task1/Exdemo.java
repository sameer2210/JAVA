public class Exdemo{
	public static void main(String args[]){
	
	Ex o1 = new Ex();
	o1.m1();														//m1 clalled
	o1.m2(100);													//m2 called with arg 100
	int v = o1.m3();
	System.out.println("return value1 "+ v);			//....100(random)
	int v2 = o1.m4(10,20);
	System.out.println("return sum value2 " + v2);	//....30
		
	
	}//end mains
}//end class
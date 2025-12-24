public class Demo1{
	public static void main(String args[]){
	
	System.out.println("Hello");			//hello
	Sisprinter p = new Sisprinter();
	
	byte b = 10;
	short s = 20;
	int i = 1000;
	long l = 3253l;
	float f = 22.5f;
	double d = 245464.5d;
	p.print(s);								//short data print 20
	p.print(new java.util.Date());	//date print....
	p.print("Sameer ");					//String data print sameer
	
	
		
	}//end main
}//end class
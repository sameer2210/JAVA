public class Demo1{
	public static void main(String args[]){
	
	System.out.println("Hello");
	SisPrinter p = new SisPrinter();
	
	byte b = 20;
	short s = 40;
	int i = 100;
	long l = 345L;
	float f = 22.1f;
	double d = 65463.5d;
	
	p.print(s);
	p.print(f);
	p.print(new java.util.Date());
	System.out.println("_____________________\n");
	p.print(d);
	p.print("Sameeer");
	p.print(l);
	p.print(b);
	p.print(i);
	p.print('s');
	
	//p.print();			error no method or arguments
	//p.print(false);	error no method for boolean
	
	
	
	}//end main
}//end class
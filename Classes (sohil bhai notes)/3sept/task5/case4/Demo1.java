 public class Demo1 {

	public static void main(String args[]){
	
	  System.out.println("Hello");
	  SisPrinter  p = new SisPrinter();
	  
	  
	  byte b=10;
	  short s=20;
	  int i=1000;
	  long l  =724836L;
	  float f=55.f;
	  double d=354545.4d;
	p.print(b);//byte			//int data print 10
	p.print(s);//short    	//int data print 10
	p.print(i);//int			//int data print 10
	p.print(l);//long    		//double data print 724836l.0
	p.print(f); //float		//double data print 55.o
	p.print(d);//double		//double data print354545.4
	p.print('S');//char		//int data print 83
 
	  
	}//end main

}//end class
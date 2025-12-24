public class Task2 {
	public static void main (String [] args){
	
	char ch='D';
	int num1=100;
	boolean happy=true;
	//CTE happy="false";

	System.out.println(ch);
	System.out.println(num1);
	System.out.println(happy);
	System.out.println("________________");

	float f1 = 10.5f;
	double d1 = 99.99999;
	byte b1 = 10;
	int i = b1;
	byte b2 = b1;
	//CTE byte b3=i;
	byte b3 = (byte)i;


	System.out.println(f1);
	System.out.println(d1);
	System.out.println("b1="+b1);
	System.out.println("i="+i);
	System.out.println("b2="+b2);
	System.out.println("b3="+b3);
	System.out.println("___________________");

	byte b = 126;
	System.out.println(b);
	b=127;
	System.out.println(b);
	//CTE b=128;
	//
	System.out.println(b);
	b=(byte)12345678;
	System.out.println(b);
	System.out.println("_____________");

	System.out.println((byte)126);
	System.out.println((byte)127);
	System.out.println((byte)128);
	System.out.println((byte)130);
	System.out.println("```````````````l``````````````");
//-128   127

	System.out.println((byte)-130);

	System.out.println((byte)-129);
	System.out.println((byte)-128);
	System.out.println((byte)-126);



}
}
import java.util.Random;

public class X {
	private Random rand = new Random();
	private int a = rand.nextInt(1000);
	private int b;
	private int c;
	private int d;
	
	private static int e;
	private static int f=(int)(Math.random()*1000);
	private static int g;
	
	static {
		int a = (int)(Math.random()*10);
		int dice = a%6;
		dice = dice+1;
		X.g = dice;
		System.out.println("Static block executed x.g="+X.g);
	}
	
	//object/nonstatic block
	{
		int t =(int)(Math.random()*1000);
		d = t%2==0?t:t+1;
		System.out.println(this + "object block executed d=" +d);
	 }
	 
	public X(int b){
		System.out.println(this + " contructor called b ="+b);
		this.b=b;
	}
	public void setC(int c){
		System.out.println(this + "contructor called c =" + c);
		this.c = c;
	}
	
	public static void setE(int e){
		System.out.println("X static method called X.e =" +e);
		X.e=e;
	}
	
	public void show(){
		System.out.println("Ol:a = " + a);
		System.out.println("OC:b = " +b);
		System.out.println("OM:c = " + c);
		System.out.println("non Block d = " + d);
		System.out.println("M:Static e = " +e);
		System.out.println("____________________");
		System.out.println("I:Static f = " + f);
		System.out.println("Block Static g = " + g);
		System.out.println();
	}

}//end class		
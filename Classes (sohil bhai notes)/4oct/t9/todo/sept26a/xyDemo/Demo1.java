
public class Demo1 {

	public static void main(String[] args) {
	
		X x1  = new X();
		x1.m1();//x
		x1.m2();//x
		x1.m3();//x
		System.out.println("_________________");
		Y y1  = new Y();
		y1.m1();//x
		y1.m2();//Y  override
		y1.m3();//x
		y1.ym1();//y
		y1.ym2();//y
		System.out.println("________________");
		Z z1  = new Z();
		z1.m1();//x
		z1.m2();//x
		z1.m3();//z  override
		z1.zm1();//z
		z1.zm2();//z
		
		
		
		
	}

}

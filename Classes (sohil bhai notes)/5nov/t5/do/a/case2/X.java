
public class X implements I1,I2 {

	public void m1(){System.out.println(this + " m1 for I1 ");}
	public void m2(){System.out.println(this + " m2 for I2 ");}
	public void m3(){System.out.println(this + " m3 for I2 ");}
	
	//comman implemention for both I1 I2 interface, GrandFather Father same wish
	
	public void happy(){System.out.println(this + " happy() for I1 Or I2 ");}
	
	
}//end class	
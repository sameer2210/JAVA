public class Mobiledemo {
	public static void main (String [] args ) throws Exception{
		
		Mobile m1 = new Mobile();
		m1.on();
		m1.mobile("oneplus");
		m1.mobile(100);
		m1.mobile(5000L);
		m1.mobile(69999.9F);
		m1.mobile(true);
		m1.off();
		
	}
}
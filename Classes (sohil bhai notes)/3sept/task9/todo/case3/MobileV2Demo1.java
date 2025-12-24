
public class MobileV2Demo1 {

	public static void main(String[] args) {
	
		MobileV2 m1 = new MobileV2("brand1","blue", "model777");
		m1.show();

		System.out.println("==========================================");
	MobileV2 m2 = new MobileV2("brand2","green", "model999","android", 5.7f);
	m2.show();
	System.out.println("==========================================");

MobileV2 m3 = new MobileV2("brand3","red", "model123","android", 5.7f, 20000, 8, 64);
		System.out.println("+++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++");
		m3.show();

	}

}

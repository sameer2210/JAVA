
public class Case1 {

	public static void main(String[] args) {

		Parent p1 = new Parent("ramesh","mumbai");
		p1.showInfo();
		
		System.out.println("++++++++++++++");
		
		Child c1  = new Child("Surendra","raipur","Anandi");
		
		c1.showInfo();
	}

}

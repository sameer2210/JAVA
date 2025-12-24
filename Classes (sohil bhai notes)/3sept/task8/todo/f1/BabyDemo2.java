
public class BabyDemo2 {

	public static void main(String[] args) {
		Baby b1  = new Baby();
		
		b1.allDetails();
		System.out.println("++++++++++++++++++++++");
		
		b1.setName("raju");
		b1.setAge(9);
		b1.setColor("fair");
		b1.setGender("male");
		b1.setBloodGroup("o+ve");
		b1.setWeight(10);
		b1.setFit(true);
		
		b1.allDetails();
		
		
		System.out.println("++++++++++++++++++++++");
	}

}

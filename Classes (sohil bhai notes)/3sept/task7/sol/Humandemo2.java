public class Humandemo2{
	public static void main(String args[]){
	
	Human h1 = new Human();
/*	
		h1.name="sameer";
		h1.age=21;
		h1.color="fair";
		h1.gender="male";
		h1.bloodGroup="ab+";
		h1.mobileNumber="12345678";
	*/
	
		h1.setName("sameer");
		h1.setAge(21);
		h1.setColor("fair");
		h1.setGender("male");
		h1.setBloodGroup("ab+");
		h1.setMobileNumber("1234567899");
		
/*	//Give Error : private data can not be direct access
		System.out.println("name " + h1.name);
		System.out.println("color " + h1.color);
		System.out.println("gender " + h1.gender);
		System.out.println("bloodGroup " + h1.bloodGroup);
		System.out.println("mobileNumber " + h1MobileNumber);
*/		
		
		
		System.out.println("name " + h1.getName());
		System.out.println("age " + h1.getAge());
		System.out.println("gender " + h1.getGender());
		System.out.println("bloodGroup " + h1.getBloodGroup());
		System.out.println("color " + h1.getColor());
		System.out.println("mobilenumber " + h1.getMobileNumber());
	
	System.out.println("______________________________");
	
	h1.eat();
	h1.speak();
	
	
	
	}//end main
}//end class
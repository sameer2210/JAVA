public class Humandemo1{
	public static void main(String args[]){
	
	Human h1 = new Human(); 
	
		// h1.name="Ram";
		// h1.age=18;
		// h1.color="fair";
		// h1.gender="male";
		// h1.bloodGroup="ab+";
		// h1.mobileNumber="123456789";
		//for access private method we need to cange output methods
		//like seter geter method
		
		h1.setName("Sohil");
		h1.setAge(33);
		h1.setColor("fair");
		h1.setGender("male");
		h1.setBloodGroup("ab+");
		h1.setMobileNumber("123456789");
		
		
	System.out.println("______________________________");
		System.out.println("Name is : "+ h1.getName());
		System.out.println("age is : " + h1.getAge());	
		System.out.println("color is : " + h1.getColor());
		System.out.println("gender is : " + h1.getGender());
		System.out.println("BloodGoroup : " + h1.getBloodGroup());	
		System.out.println("mobileNumber : " + h1.getMobileNumber());
		
	System.out.println("______________________________");
		h1.showAll();
		h1.eat();
		h1.speak();
	
	System.out.println("______________________________");
	
	//h1.eat();
	//h1.speak();
		
	
	
	}//end main
}//end class
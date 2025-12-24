public class Human{

	String name;
	int age;
	String gender;
	String color;
	String bloodGroup;
	String mobileNumber;
	
	void eat(){
		System.out.println(name +" eating......");
	}
	void speak(){
		System.out.println(name + " speak.......");
	}
	
	void showAll(){
		System.out.println("name " + name);
		System.out.println("age " + age);
		System.out.println("color " + color);
		System.out.println("gender " + gender);
		System.out.println("bloodGroup " + bloodGroup);
		System.out.println("mobileNumber " + mobileNumber);
	}
	
}//end class


public class Parent {

	float amount;
	float gold;
	String properties;
	
	public Parent(){
		System.out.println(this + "Parent created.....");
	}
	void speak(){
		System.out.println(this + " ***speak method called");
	}
	void run(){
		System.out.println(this + "*** run method called");
	}
	
	void eat(){
		System.out.println(this + "*** eat method called");
	}
	void walk(){
		System.out.println(this + "*** walk method called");
	}
	
}//end class	
	
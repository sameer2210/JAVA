public class Humandemo{
	public static void main(String args[]){
	
	Human h1 = new Human();
	
	System.out.println("name " + h1.name);
	System.out.println("age " + h1.age);
	System.out.println("color " + h1.color);
	System.out.println("gender " + h1.gender);
	System.out.println("bloodGroup " + h1.bloodGroup);
	System.out.println("mobileNumber " + h1.mobileNumber);
	System.out.println("_______________*_____________");
	
	//update
	h1.name="Sameer";
	h1.age=21;
	h1.color="fair";
	h1.gender="male";
	h1.bloodGroup="AB+";
	h1.mobileNumber="9691709556";
	//fetch
	//h1.gender="female";
	System.out.println("______________________________");
	System.out.println("name " + h1.name);
	System.out.println("age " + h1.age);
	System.out.println("color " + h1.color);
	System.out.println("gender " + h1.gender);
	System.out.println("bloodGroup " + h1.bloodGroup);
	System.out.println("mobileNumber " + h1.mobileNumber);
	System.out.println("______________________________");
	
	//h1.eat();
	//h1.speak();
	
	
	
	}//end main
}//end class
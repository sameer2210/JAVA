public class HumanDemo{
	public static void main(String args[]){
	Human hum = new Human();
	System.out.println("___________________________________________________________________________________");
	
	hum.humInfo();
	hum.eat();
	hum.speak();
	
	System.out.println("___________________________________________________________________________________");
	
	hum.setName("Focus");
	hum.setGender("male");
	hum.setColor("dull");
	hum.setAge(12);
	hum.setHeight(5.5f);

	System.out.println("___________________________________________________________________________________");

	// hum.getName();
	hum.getName();
	hum.getGender();
	hum.getColor();
	hum.getAge();
	hum.getHeight();
	System.out.println("___________________________________________________________________________________");
	
	hum.humInfo();
	
	System.out.println("___________________________________________________________________________________");
	
	hum.eat();
	hum.speak();
	
	System.out.println("___________________________________________________________________________________");


	}//end main
}//end class
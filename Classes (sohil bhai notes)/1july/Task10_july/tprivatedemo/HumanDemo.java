public class HumanDemo{
	public static void main(String [] args){
	Human hum = new Human();

	hum.humInfo();
	hum.eat();
	hum.speak();

	System.out.println("___________1__________");

	hum.setName("Jhetalal");
	hum.setGender("male");
	hum.setColor("bright");
	hum.setAge(21);
	hum.setHeight(5.8f);
	
	System.out.println("___________2__________");
	
	hum.getName();
	hum.getGender();
	hum.getColor();
	hum.getAge();
	hum.getHeight();

	System.out.println("_________3____________");

	hum.humInfo();
	hum.eat();
	hum.speak();
	
	System.out.println("___________4__________");

}
}


public class HumanDemo{
	public static void main(String [] args){
	Human hum = new Human();

 	System.out.println("________________________");
	hum.humInfo();
	hum.eat();
	hum.speak();
	hum.name="Sameer";
	hum.gender="male";
	hum.colour="bright";
	hum.age=21;
	hum.height=5.7f;
	
	System.out.println("_______________________");
	hum.humInfo();
	System.out.println("_______________________");
	hum.eat();
	hum.speak();
	System.out.println("_______________________");

}
}

public class Car extends Body{
	
	Car(String a){
		System.out.println("\n car brand name is ="+ a);
	}
	
public static void main (String args []){
	
	Car c1 = new Car(" bmw");
	
	Body b1 = new Body();
	b1.set();
	b1.made();
	
	System.out.println();
	
	Engine e1 = new Engine();
	e1.power();
	e1.transfer();
	
	Tyre t1 = new Tyre();
	t1.Colour();
	
}

}
public class Animal extends Cat{
	
	Animal(){
		System.out.println(" cat is a Animal''''");
	}
	
	public static void main (String [] args){

		Cat c1 = new Cat();
		c1.run();
		c1.drink();
		
	Animal a1 = new Animal();
	
	}		
}
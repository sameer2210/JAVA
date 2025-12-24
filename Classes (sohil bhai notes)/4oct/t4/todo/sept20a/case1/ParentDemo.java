
public class ParentDemo {

	public static void main(String[] args) {
		
		Parent p1  = new Parent();
		p1.amount=8000000;
		p1.gold=500;
		p1.properties="25 acr 2 house 3 formhouse 2 plot";

		System.out.println("_________________");
		p1.eat();
		p1.walk();
		p1.run();
		p1.speak();
		
		System.out.println("amount "+p1.amount  +" amout");
		System.out.println("gold "+p1.gold +" g");
		System.out.println("properties "+p1.properties);
		

	}

}

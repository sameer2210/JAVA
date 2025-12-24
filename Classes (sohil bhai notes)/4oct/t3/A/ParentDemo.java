public class ParentDemo {
	public static void main(String args[]){
	
	Parent p1 = new Parent();
	p1.amount=80000000;
	p1.gold=500;
	p1.properties="25 acr 2 house 3 formhouse 2 plot";
	
	System.out.println("_____________________");
	p1.eat();			//....eat method called
	p1.walk();			//.....walk....
	p1.run();			//.....run....
	p1.speak();		//.....speak....
	
	System.out.println(p1.amount + " amount");	//
	System.out.println(p1.gold + " gold " );		//
	System.out.println(p1.properties);				//
	
	
	
	}//end main
}//end class
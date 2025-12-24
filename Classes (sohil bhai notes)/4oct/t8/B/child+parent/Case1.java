public class Case1{
	public static void main(String args[]){
	
	Parent p1 = new Parent();
		p1.eat();		//... eat parent
		p1.walk();		//.. walk parent
		p1.speak();	//... speak parent
		
	//p1.conding();
	//p1.devlopSw();
	System.out.println("_________________________");
	
	Child c1 = new Child();
		c1.eat();
		c1.walk();
		c1.speak();
		
		c1.coding();
		c1.devlopSw();
		
		Parent pref=c1;
		
		pref.eat();		//Child@6d06d69c--- eat .... Parent
		pref.walk();	//Child@6d06d69c--- walk .... Parent
		pref.speak();	//Child@6d06d69c--- professional speaking by  .... Child
		
	//	pref.coding();
	//	pref.devlopSw();
		
		
	}//end main
}//end class

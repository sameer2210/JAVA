public class ChildParentCaseA {
	public static void main(String[] args) {

	Parent p1  = new Parent();
	p1.eat();
	p1.walk();
	p1.speak();
	
	//p1.coding();  //CTE
	//p1.devlopSw();//CTE
	
	System.out.println("__________________");
	
	Child c1  = new Child();
	c1.eat();//p
	c1.walk();//p
	c1.speak();//c why override
	
	c1.coding();//c
	c1.devlopSw();//c
	
/*	Parent pref=c1;
	
	pref.eat();//p
	pref.walk();//p
	pref.speak();//c why override
	
	pref.coding();//cTE
	pref.devlopSw();//CTE
*/	}
}

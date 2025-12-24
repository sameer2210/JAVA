
public class Case4 {

	public static void main(String[] args) {
		Parent p1  = new Parent();
		p1.eat();//p
		p1.speak();//p
		p1.specialAction();//p
		p1.verSpecialAction();//p
		System.out.println("_________________");

		Child c1  = new Child();
		c1.eat();//p
		c1.speak();//override from child 
		c1.specialAction();//static method come from P
		c1.verSpecialAction();//overhidden
		//static method come from Child 
		System.out.println("__________________");
		Parent.specialAction();//P
		Child.specialAction();//P
		Parent.verSpecialAction();//P
		Child.verSpecialAction();//C
		
 
		System.out.println("****************************");
		 
		Parent pref  =null;
		pref=p1;
		System.out.println("pref  = "+pref);
		pref.speak();//p
		pref.verSpecialAction();//p
		System.out.println("__________________");
		
		pref=c1;
		System.out.println("pref  = "+pref);
		pref.speak();//C
		pref.verSpecialAction();//Parent method
		//why static method nerver overide
		System.out.println("****************************");
System.out.println("________________________");
		
		
	}

}

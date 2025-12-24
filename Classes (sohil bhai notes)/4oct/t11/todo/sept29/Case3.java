
public class Case3 {

	public static void main(String[] args) {
		Parent p1  = new Parent();
		Child c1  = new Child();
		//p1.specialAction(); from parent
		//c1.specialAction();//from parent
		System.out.println("_____________________");
		Parent pref  =null;
		System.out.println("pref  = "+pref);
		pref=p1;
		pref.speak();//p
		pref.eat();//p
		pref.specialAction();//p
		pref.verSpecialAction();//p
		
		System.out.println("__________________");
		pref=c1;
		System.out.println("pref  = "+pref);
		pref.eat();//p
		pref.speak();//Child version override 
		pref.specialAction();//p
		pref.verSpecialAction();//exp Parent
System.out.println("________________________");


		
		
	}

}

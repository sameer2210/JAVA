
public class Case2 {

	public static void main(String[] args) {
		Parent p1  = new Parent();
		Child c1  = new Child();
		System.out.println("_____________________");
		Parent pref ;
		pref=p1;
		pref.eat();//p
		pref.sleep();//p
		pref.greet();//p
		pref.speak();//p
		
		System.out.println("__________________");
		pref=c1;
		pref.eat();//p
		pref.sleep();//p
		pref.greet();//p
		pref.speak();//Child version override 
		System.out.println("________________________");
		//p1.specialAction(); from parent
		//c1.specialAction();//from parent


		
		
	}

}

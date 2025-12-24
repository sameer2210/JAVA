public class Case2 {
	public static void main(String args[]){
	
		Parent p1 = new Parent();
		Child c1 = new Child();
		System.out.println("______________________");
		
		Parent pref;
		pref=p1;
		pref.eat();
		pref.sleep();
		pref.greet();
		pref.speak();
		System.out.println("_____________________");
		
		pref=c1;
		pref.eat();
		pref.sleep();
		pref.greet();
		pref.speak();
		System.out.println("_____________________");
		
		p1.specialAction();//from parent
		c1.specialAction();//from parent
		
			
	}//end main
}//end class
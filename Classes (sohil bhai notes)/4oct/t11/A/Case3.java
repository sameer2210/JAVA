public class Case3{
	public static void main(String args[]){
	
		Parent p1 = new Parent();
		Child c1 = new Child();
		// p1.specalAction(); from parent
		// c1.specalAction(); from parent
		System.out.println("_____________________");
		
		Parent pref = null;
		System.out.println("pref = " + pref);
		pref=p1;
		pref.speak();
		pref.eat();
		pref.specialAction();
		pref.verSpecialAction();
		System.out.println("___________________");
		
		pref=c1;
		System.out.println("pref = " +pref);
		pref.eat();
		pref.speak();
		pref.speak();
		pref.specialAction();		//Special method from Parent ----
		
		System.out.println("____________________");
		pref=c1;
		System.out.println("pref = " + pref);
		pref.eat();
		pref.speak();
		pref.specialAction();			//Special method from Parent ----
		pref.verSpecialAction();	//verSpecialAction method from Parent -----
		System.out.println("______________________");
			
	
	}//end main
}//end class
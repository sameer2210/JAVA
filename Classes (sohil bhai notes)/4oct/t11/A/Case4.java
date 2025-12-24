public class Case4 {
	public static void main(String args[]){
	
		Parent p1 = new Parent();
		p1.eat();
		p1.speak();
		p1.specialAction();
		p1.verSpecialAction();
		System.out.println("____________________");
		
		Child c1 = new Child();
			c1.eat();
			c1.speak();
			c1.specialAction();
			c1.verSpecialAction();
		
		// staic method come from Child
		System.out.println("_____________________");
			
			Parent.specialAction();			//Special method from Parent ----
			Child.specialAction();			//Special method from Parent ----
			Parent.verSpecialAction();	//verSpecialAction method from Parent -----
			Child.verSpecialAction();		//verSpecialAction method from child ----
			
			System.out.println("-------------------------");
				
				Parent pref = null;
				pref=p1;
				System.out.println("pref = " + pref);
				pref.speak();
				pref.verSpecialAction();
			System.out.println("__________________");
			
				pref=c1;
				System.out.println("pref = " + pref);
				pref.speak();					//Child@6d06d69c ---- speak from child override
				pref.verSpecialAction();	//verSpecialAction method from Parent -----
				
				// why static method naver override
			System.out.println("___________________");
			
		
	}//end main
}//end class
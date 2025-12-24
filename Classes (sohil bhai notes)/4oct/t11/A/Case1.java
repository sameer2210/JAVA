public class Case1 {
	public static void main(String args[]){

		Parent p1 = new Parent();
			p1.eat();
			p1.sleep();
			p1.speak();
			p1.greet();
		System.out.println("_________________");
		Child c1 = new Child();
			c1.eat();
			c1.sleep();
			c1.greet();
			c1.playGame();
		System.out.println("____________________");
			
		Parent pref = null;
		System.out.println("pref " + pref);
		
		pref=p1;
		System.out.println("_____________________");
		System.out.println("pref = " + pref);
		pref.eat();
		pref.sleep();
		System.out.println("-------------------");
		pref=c1;
		System.out.println("pref " + pref );
		pref.eat();		//Child@6d06d69c eat from Parent
		pref.sleep();		//Child@6d06d69c sleep from Parent
		pref.speak();	//hild@6d06d69c ---- speak from child override
		System.out.println("--------------------");
		
		//pref.playGame();
		//((Child)pref).playGame();
		//safe mode
		if(pref instanceof Child){
			((Child)pref).playGame();
		}
		System.out.println("_________________________");
		
		
	}//end class
}//end class
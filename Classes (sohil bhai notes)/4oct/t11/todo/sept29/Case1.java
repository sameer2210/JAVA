
public class Case1 {

	public static void main(String[] args) {
		Parent p1  = new Parent();
		p1.eat();//p
		p1.sleep();//p
		p1.speak();//p
		p1.greet();//p
		System.out.println("________________");
		Child c1  = new Child();
		c1.eat();//p
		c1.sleep();//p
		c1.speak();//c override
		c1.greet();//p
		c1.playGame();//self
		
		System.out.println("_____________________");
		Parent pref  = null;
		System.out.println("pref " + pref);

		pref=p1;
		System.out.println("_____________________");
		System.out.println("pref =" + pref);
		pref.eat();
		pref.sleep();
		pref.speak();
		System.out.println("________________________");
		pref=c1;
		System.out.println("pref " + pref);
		
		pref.eat();//p
		pref.sleep();//p
		pref.speak();//overide C
		
		System.out.println("******************");
		//pref.playGame();//self
		//((Child)pref).playGame();//  risk 
		//safe mode 
		 if(pref instanceof Child){
			 ((Child)pref).playGame();//
		 }
		System.out.println("________________________");
	}

}

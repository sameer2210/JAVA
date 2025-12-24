public class Child extends Parent {

	private String password=""+Math.random();
	
	void speak(){System.out.println(this + " *** speak from Child override ");}
	void playGame(){System.out.println(this + " play game from child " );}
	
	//override
	void todo(){
		System.out.println("todo child " + this);
		eat();
		sleep();
		
		//abuse();// CTE if it present in parent class as private
		
		speak();			//override child
		super.speak();
		//super.drinkWine(); CTE
		drinkWine();
		playGame();
	}//end todo
	
	private void drinkWine(){
		System.out.println("Parent drinking wine *** " + this);
	}
	
}//end classs	
	
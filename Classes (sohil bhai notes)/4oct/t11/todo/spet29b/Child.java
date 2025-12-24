
public class Child extends Parent{
	private String password=""+Math.random(); 
	
	void speak(){System.out.println(this + " $$$$$speak from child override");}
	void playGame(){System.out.println(this + " play game from child ");}
	 
	//override
	void todo(){
		System.out.println("todo child "+this);
		eat();//p
		sleep();//p
		
		//abuse();//CTE if it present in parent class as private
		  
		speak();//override child
		super.speak();
		//super.drinkWine();CTE 
		drinkWine();//its present in CHild class
		playGame();//self version
	}//end todo
	
	
	 private void drinkWine(){
		  System.out.println("parent drinking wine $$$$$$$"+ this);
	  }	
	
}

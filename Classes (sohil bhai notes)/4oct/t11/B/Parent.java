public class Parent {
		String name;
		private String password=""+Math.random();
		
	void eat(){System.out.println(this + "eat from Parent");}
	void sleep(){System.out.println(this + " sleep from Parent");}
	void speak(){System.out.println(this + "speak from Parent ");}
	
	void todo(){
					System.out.println("Parent TODO called " + this );
					eat();
					sleep();
					drinkWine();
					abuse();
					System.out.println("inside thought password" +password );
	}
					
	private void drinkWine(){
		System.out.println("Parent drinking wine "+ this );
	}
	private void abuse(){
		System.out.println("parent abusing " + this );
	}
	
}//end class
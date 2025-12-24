
abstract public class Animal{

	void eat(){
		System.out.println(this + " eating with mounth ");
	}
	
	void sleep(){
		System.out.println(this + " close eye and sleep");
	}
	
	//public void makeSound(){}	//mew  //roar  //bark
	
		public abstract void makeSound();
		
		 
}//end class
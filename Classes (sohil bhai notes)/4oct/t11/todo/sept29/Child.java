
public class Child extends Parent{
	void speak(){System.out.println(this + " $$$$$speak from child override");}
	void playGame(){System.out.println(this + " play game from child ");}
	
	static void verSpecialAction(){
		  System.out.println("verSpecialAction method from Child**$$$$$$****");
	  }
}

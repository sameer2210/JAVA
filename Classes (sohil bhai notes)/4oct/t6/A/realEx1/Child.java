public class Child extends Parent {

	void playGame() {
		System.out.println(this + " ---- plaing game ");
	}
	void writeJavaProgram() {
		System.out.println(this + " ---- write Java Program ");
	}
	
	//override
	void marry() {
		System.out.println(this + " _________________");
		System.out.println("**** marry **** ");
		System.out.println("must be seen & educated ");
		System.out.println("need DJ & ...... ");
		System.out.println(" **** marry ***** ");
	}
	
	void speak() {
		System.out.println(this + " *** speaking .... professional way ");
	}
	
	void greet() {
		System.out.println(this + " Greet say Hii ");
	}
	
	
}//end class 
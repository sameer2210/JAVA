public class Child extends Parent {

	void playGame(){
		System.out.println(this + " ---- playing game");
	}
	void writeJavaProgram() {
		System.out.println(this + " ---- write java Program ");
	}
	
	//override 
	void marry() {
		System.out.println(this + " __________________");
		System.out.println("----- marry ------");
		System.out.println("must be seen & educated ");
		System.out.println(" need DJ & .......");
		System.out.println(" ------- marry -------- ");
	}
	
	void speak(){
		System.out.println(this + "---- speaking..... professional way ");
	}
	void greet(){
		System.out.println(this + " Greet Say Hii ");
	}
	
}//end class
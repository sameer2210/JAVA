public class Child extends Parent {

	String techSkills;
	String professionalWayOfThinking;
	
		public Child(){
			System.out.println(this + " CHILD object created ");
		}
		
	void playGame(){
		System.out.println(this + " ***** playing game");
	}
	
	void writeJavaProgram(){
		System.out.println(this + " ***** write Java Program");
	}
	
	void observe(){
		System.out.println(this + " ***** observing ");
	}
	
	
}//end class
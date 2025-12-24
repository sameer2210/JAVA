public class ChildDemo1 {
	public static void main(String[] args) {

		Child c1  = new Child();
		//set parent attribute 
		c1.amount=8000000;
		c1.gold=500;
		c1.properties="25 acr 2 house 3 formhouse 2 plot";

		//set child attribute 
		c1.professionalWayOfThinking="fearless, focus on career not job, selffitness,better communication,big thingking,problesoving nature";
		c1.techSkills="c ,c++, java....";
		
		c1.speak();
		c1.run();
		c1.eat();
		c1.walk();
		
		c1.playGame();
		c1.observe();
		c1.writeJavaProgram();
		
		System.out.println("***** " + c1.properties);
		System.out.println("*****  " + c1.gold);
		System.out.println("*****  " + c1.amount);
		
		System.out.println("$$$ professionalWayOfThinking " + c1.professionalWayOfThinking);
		System.out.println("$$$ techSkills " + c1.techSkills);

		
	}
}

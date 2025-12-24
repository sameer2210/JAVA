public class ChildDemo1{
	public static void main(String args[]){
	
	Child c1 = new Child();
	//set parent attribute
	c1.amount=80000000;
	c1.gold=500;
	c1.properties="25 acr 2 house 3 formhouse 2 plot";
	
	//set child attribute
	c1.professionalWayOfThinking="fearless, focus on career not job,selffitness,better communucation,big thinking ,problesoving nature";
	c1.techSkills="c,c++,java.....";
	
	c1.speak();				//.....speak method called
	c1.run();					//.....run.....
	c1.eat();					//......eat....
	c1.walk();					//....walk....
	
	c1.playGame();			//.....playing game
	c1.observe();				//,,,,,observing
	c1.writeJavaProgram();//......write java program
	
	System.out.println("_______________________________");
	
	System.out.println("**** " + c1.properties);
	System.out.println("**** " + c1.gold);
	System.out.println("**** " + c1.amount);
	
	System.out.println("### professionalWayOfThinking "+ c1.professionalWayOfThinking );
	System.out.println("### techSkills " + c1.techSkills);
	
	
	}//end main 
}//end class
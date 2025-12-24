
public class Son extends Father {

	String name = " goli  ";
	String langSkill = "java";
	
	void showDetails(){
		System.out.println("fatherName : " +super.name);
		System.out.println("son name : " + name);
		System.out.println("son langSkill : " +langSkill);
	}
	
	//sonName 	Father	son
	//fatherName	Father	 Son
	
}//end class
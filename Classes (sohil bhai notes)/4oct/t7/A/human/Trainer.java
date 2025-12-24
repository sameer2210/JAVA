public class Trainer extends Student {
	int exp;
	String masterSkill;
	String domain;
	
	public Trainer(String name, String gender, String college, String branch,
							int exp, String masterSkill, String domain){
				super(name, gender, college, branch);
				this.exp = exp;
				this.masterSkill = masterSkill;
				this.domain = domain;
				System.out.println(" 7 arg trainer constructor called ");
	}
	
	void show(){
		System.out.println(this + " _____ Trainer info _____ " );
		System.out.println("name " + name);
		System.out.println("gender "+ gender);
		System.out.println("college " + college);
		System.out.println("branch "+ branch);
		System.out.println("exp " + exp);
		System.out.println("master skill " + masterSkill);
		System.out.println("domain expert " + domain);
	}
	
	
}//end class
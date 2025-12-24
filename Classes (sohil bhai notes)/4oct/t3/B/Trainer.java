
public class Trainer extends Student{

	String expertSkill;
	int totalExplnMon;
	int totalStudentTrained;
	public void teach(){
		System.out.println("(T)teaching " + name +":"+ gender+":"+ weight +"::"+ speakLanguage1 + "#" + id + " # "+ institute +" # " + percentage +"*"+ expertSkill + " *" + totalExplnMon + " months"+ "& " + totalStudentTrained);
	}

	public void motivate() {
		System.out.println("(T)motivating " + name + ":" + gender+ ":" + weight + "::" + speakLanguage1 + "#" + id + "# " + institute + " # " + percentage + "* " + expertSkill + "* " + totalExplnMon + " months " + " & " + totalStudentTrained);
	}
	
	
}//end class
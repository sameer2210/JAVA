
public class Student extends Human{

	public void read() {
	System.out.println(this  +" read Stu");
	}
	
	public void write() {
	System.out.println(this  +" write Stu");
	}
	
	public void giveExam() {
	System.out.println(this  +" Giving Exam Stu");
	}
	
	//OVERRIDE HUMAN METHOD SPEAK
	
		void speak(){ 
		System.out.println(this +"  speaking... polite,soft,respct..knowledg...STU");
	}
	
}

public class Student extends Human {

	public void read () {
		System.out.println(this + " read Stu ");
	}
	
	public void write() {
		System.out.println(this + " write Stu ");
	}
	
	public void giveExam() {
		System.out.println(this + " Giveing Exam Stu ");
	}
	
	//OVERRIDE human Method speak
	
		void speak(){
			System.out.println(this + " speaking ....polite,soft,respect...Knowledg....Stu ");
	}


}//end class	
public class StudentDemo{
	public static void main(String args[]){
	
	Student s1 = new Student("sameer "," male ", 87f);
	Student s2 = new Student("nobita "," male ", 77f);
	Student s3 = new Student("riya ","female ", 88f);
	Student s4 = new Student("sizuka","female ", 77f);
	
	s1.aboutMe();
	s2.aboutMe();
	s3.aboutMe();
	s4.aboutMe();
	
	s1.write();
	s2.write();
	s3.write();
	s4.write();
	
	
	
	
	}//end main
}//end class
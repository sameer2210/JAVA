
public class StudentDemo1 {
public static void main(String[] args) {
	
	Student.whatIsStudent();
	
	
	Student s1  = new Student("ravi", "male", 87f);
	Student s2  = new Student("ramesh", "male", 77f);
	Student s3  = new Student("rita", "female", 89f);
	Student s4  = new Student("uma", "female", 97f);
	
	s1.aboutMe();
	s2.aboutMe();
	s3.aboutMe();
	s4.aboutMe();
	
	s1.write();
	s2.write();
	s3.write();
	s4.write();
	
}
	
}

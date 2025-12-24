public class Persondemo7 {
	public static void main(String args[])throws Exception{
	
	Person myStudent = new Person();
	
	myStudent.name ="Sameer ";
	myStudent.gender ="male";
	myStudent.age =21;
	
	Thread.sleep(1000);
	myStudent.aboutMySelf();
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	myStudent.writeWinnerNotes("java is simple");
	Thread.sleep(1000);
	myStudent.writeWinnerNotes("i m Success");
	Thread.sleep(1000);
	Thread.sleep(1000);
	myStudent.writeWinnerNotes("i m happy");
	
}
}
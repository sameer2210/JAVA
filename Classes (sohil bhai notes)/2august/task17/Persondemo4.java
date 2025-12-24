public class Persondemo4 {
	public static void main(String args[])throws Exception{
	
	Person myStudent = new Person();
	
	myStudent.name ="Rita";
	myStudent.gender ="female";
	myStudent.age=21;
	myStudent.aboutMySelf();
	Thread.sleep(2000);
	
	String givenColor = null;
	givenColor = myStudent.giveColor();
	System.out.println("Given color " + givenColor);
	
}
}
public class Persondemo5 {
	public static void main(String args[])throws Exception{
	
	Person myStudent = new Person();
	myStudent.name ="Rita";
	myStudent.gender ="female";
	myStudent.age =21;
	
	System.out.println("\ntotalWords\n");

	int totalWords;
	totalWords =myStudent.totalWords("java is simple");
	System.out.println("java is simple = " +totalWords);
		
	totalWords =myStudent.totalWords("success is simple if you believe");
	System.out.println("success is simple if you believe= " + totalWords);
	
}
}
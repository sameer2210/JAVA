public class Persondemo3 {
	public static void main (String args[])throws Exception{
	
	Person myStudent = new Person();
	
	myStudent.name="Sameer";
	myStudent.gender="male";
	myStudent.age=21;
	Thread.sleep(2000);
	myStudent.aboutMySelf();
	Thread.sleep(2000);
	
	int givenNumber = myStudent.giveNumber();
	System.out.println("given number is " + givenNumber);
	
	Thread.sleep(2000);
	int []givenNumberSet = null;
	System.out.println("Given number set " + givenNumberSet);
	givenNumberSet = myStudent.generateNumber(5);
	for(int p=1;p<=givenNumberSet.length;p++){
	  System.out.println("sno# " +p + " " + givenNumberSet[p-1]);
	}
	
}
}
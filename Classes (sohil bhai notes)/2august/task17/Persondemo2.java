public class Persondemo2 {
	public static void main (String args[])throws Exception{
	
	Person mystudent = new Person();
	
	mystudent.name="Sameer";
	mystudent.gender="Male";
	mystudent.age=21;
	mystudent.aboutMySelf();
	Thread.sleep(2000);
	int givenNumber = mystudent.giveNumber();
	System.out.println("given number is "+ givenNumber);
	
}
}
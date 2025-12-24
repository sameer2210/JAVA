public class SisStudentDemo {
	public static void main(String args[]){
	
	SisStudent s1= new		SisStudent();
	s1.saySomething();
	s1.name="Sameer";
	System.out.println("_______________");
	s1.saySomething();
	System.out.println("_______________");
	s1.updateFavoriteWord("java");
	
	s1.saySomething();
	
	s1.updateWords("green");
	s1.updateWords("apple");
	s1.updateWords("book");
	s1.updateWords("start");
	s1.updateWords("happy");
	System.out.println("_________________");
	s1.saySomething();
	
	SisStudent s2 = new		SisStudent();
	s2.saySomething();
	s2.name="ravi";
	s2.updateFavoriteWord("career");
	
	s2.updateWords("apple");
	s2.updateWords("trainer");
	s2.updateWords("fit");
	System.out.println("__________________");
	s2.saySomething();
		
	
	}//end main
}//end class
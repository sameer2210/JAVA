public class MultiLavelDemo1{
	public static void main(String args[]){
	
	Human h1 = new Human();
	h1.speak();
	h1.run();
	h1.eat();
	System.out.println("______________________");
	
	Student s1 = new Student();
	s1.run();
	s1.eat();
	s1.speak();
	s1.read();
	s1.write();
	System.out.println("________________________");
	 
	Trainer t1 = new Trainer();
		t1.run();
		t1.eat();
		t1.speak();
		
		t1.read();
		t1.write();
		
		t1.teach();
		t1.motivate();
	
		
	}//end main
}//end class
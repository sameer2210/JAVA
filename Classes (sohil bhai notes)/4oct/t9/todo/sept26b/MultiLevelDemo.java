
public class MultiLevelDemo {

	public static void main(String[] args) {
		 
		Human h1  = new Human();
		h1.speak();
		h1.run();
		h1.eat();
		System.out.println("+++++++++++++++++++++++++++++");
		
		Student s1  = new Student();
		
		s1.run();
		s1.eat();
		
		s1.speak();//Student override
		s1.read();
		s1.write();
		
		System.out.println("_____________________________");
		Trainer t1  = new Trainer();
		t1.run();
		t1.eat();
		
		t1.speak();//t
		
		t1.read();//T
		t1.write();//T
		
		t1.teach();
		t1.motivate();
	
		
	}

}

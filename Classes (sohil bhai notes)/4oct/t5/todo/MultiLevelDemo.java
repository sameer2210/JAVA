
public class MultiLevelDemo {

	public static void main(String[] args) {
		 
		Human h1  = new Human();
		h1.speak();
		h1.run();
		h1.eat();
		h1.sleep();
		System.out.println("+++++++++++++++++++++++++++++");
		
		
		Student s1  = new Student();
		
		s1.speak();
		s1.run();
		s1.eat();
		s1.sleep();
		
		s1.read();
		s1.write();
		s1.giveExam();
		
		System.out.println("_____________________________");
		Trainer t1  = new Trainer();
		t1.speak();
		t1.run();
		t1.eat();
		t1.sleep();
	
		t1.read();
		t1.write();
		t1.giveExam();
	
    		t1.teach();
		t1.motivate();
	
		
	}
}

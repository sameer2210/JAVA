
public class MultiLevelDemo {

	public static void main(String[] args) {
		 
		/* Human h1  = new Human();
		h1.speak();
		h1.run();
		h1.eat();
		h1.sleep();
		System.out.println("+++++++++++++++++++++++++++++");

		*/
		
		
		Student s1  = new Student();
		
		s1.run();//H
		s1.eat();//H
		s1.sleep();//H
		
		//s1.speak();//                H  NOT GOOD if not override 
		s1.speak();// Overide so that speak will call from student 
		
		s1.read();//S
		s1.write();//S
		s1.giveExam();//S
		
/* 		System.out.println("_____________________________");
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
	
 */		
	}

}

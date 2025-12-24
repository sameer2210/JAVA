
public class MultiLevelDemo2 {

	public static void main(String[] args) {
		 
		/* Human h1  = new Human();
		h1.speak();
		h1.run();
		h1.eat();
		h1.sleep();
		System.out.println("+++++++++++++++++++++++++++++");

		*/
		
		/* 
		Student s1  = new Student();
		s1.run();//H
		s1.eat();//H
		s1.sleep();//H
		//s1.speak();//                H  NOT GOOD if not override 
		s1.speak();// Overide so that speak will call from student 
		
		s1.read();//S
		s1.write();//S
		s1.giveExam();//S
		 */

		Trainer t1  = new Trainer();
		t1.run();//H
		t1.eat();//H
		t1.sleep();//H
		t1.speak();//H    STU****
	
		t1.read();//stu    ///TRAINER***** OVERRIDE
		t1.write();
		t1.giveExam();
		
		t1.teach();
		t1.motivate();
	
	}

}

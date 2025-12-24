
public class MultiLevelDemo {

	public static void main(String[] args) {
		/*
		Human human1  = new Human();
		human1.name="ramesh";
		human1.gender="male";
		human1.weight=60;
		human1.speakLanguage1="hindi";

		human1.speak();
		human1.run();
		human1.eat();
		human1.sleep();
		
		System.out.println("+++++++++++++++++++++++++++++");
		
		Student s1  = new Student();
		 
		
		s1.name="gagan";
		s1.gender="male";
		s1.weight=65;
		s1.speakLanguage1="panjabi";

		s1.id="67823";
		s1.institute="nit";
		s1.percentage=89.5f;
		
		s1.speak();
		s1.run();
		s1.eat();
		s1.sleep();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
		s1.read();
		s1.write();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
		*/
		System.out.println("$$$$$$$$$$$$$$Trainer demostart$$$$$$$$$$$");
		
		Trainer trainer = new Trainer();
		
		trainer.name="Surendra kumar ";
		trainer.gender="male";
		trainer.weight=80;
		trainer.speakLanguage1="hindi";
		trainer.speakLanguage2="english";

		trainer.id="47";
		trainer.institute="nit";
		trainer.percentage=65.0f;
		
		trainer.expertSkill="java";
		trainer.totalExpInMon=12*13;
		trainer.totalStudentTrained=5500;
		
		trainer.speak();
		trainer.run();
		trainer.eat();
		trainer.sleep();
		System.out.println("___________________________");
		trainer.read();
		trainer.write();
		System.out.println("___________________________");
		trainer.motivate();
		trainer.teach();
		
		
		System.out.println("$$$$$$$$$$$$$$Trainer demoEnd$$$$$$$$$$$");
		

	}

}

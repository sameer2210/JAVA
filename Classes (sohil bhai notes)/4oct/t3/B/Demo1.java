public class Demo1 {
	public static void main(String [] args){
	
		Human h1 = new Human();
		h1.name="Aayush gu";
		h1.gender="LGBT";
		h1.weight = 69;
		h1.speakLanguage1="hindi";
		
		h1.speak();
		h1.run();
		h1.eat();
		h1.sleep();
		System.out.println("___________________");
		
		Student s1 = new Student();
		s1.name="BirjuHatela";
		s1.gender="male";
		s1.weight=61;
		s1.speakLanguage1="marathi";
		
		s1.id="7172";
		s1.institute="nit";
		s1.percentage=99.9f;
		
		s1.speak();
		s1.run();
		s1.sleep();
		
		s1.read();
		s1.write();
		System.out.println("________________________");
		
	
	System.out.println("__________Trainer demostrate___________");
	Trainer t1 = new Trainer();
	t1.name="Sameer ";
	t1.gender="male";
	t1.weight=60;
	t1.speakLanguage1="English";
	t1.speakLanguage2="hindi";
	t1.id="2210";
	t1.institute="nit";
	t1.percentage=88.0f;
	
	t1.expertSkill="java";
	t1.totalExplnMon=61*62;
	t1.totalStudentTrained=951753;
	
	t1.speak();
	t1.run();
	t1.eat();
	t1.sleep();
	System.out.println("_______________________");
	t1.read();
	t1.write();
	t1.motivate();
	t1.teach();
	
	System.out.println("_____________Trainer demo end____________");
		
		
	}//end main
	
}//end class